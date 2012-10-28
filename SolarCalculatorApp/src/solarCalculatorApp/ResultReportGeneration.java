package solarCalculatorApp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JFileChooser;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class ResultReportGeneration {

	public void make( HashMap<String, ArrayList<String>> Dataresult) {
		try {
			Document document = new Document(PageSize.A4.rotate());
			
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			fileChooser.setVisible(true);
			
			PdfWriter bravo = PdfWriter.getInstance(document,
					new FileOutputStream("test.pdf"));
			document.open();
			document.add(new Paragraph("Result Data here"));
			PdfPTable t = new PdfPTable(21);
			PdfPTable t2 = new PdfPTable(21);
			PdfPTable t3 = new PdfPTable(21);
			PdfPTable t4 = new PdfPTable(21);
			PdfPTable t5 = new PdfPTable(21);
			
			ArrayList<String> yearlyArray = Dataresult.get("yearlyArray");
			ArrayList<String> dailyGenResultArray = Dataresult.get("dailyGenResultArray");
			ArrayList<String> yearlyGenResultArray = Dataresult.get("yearlyGenResultArray");
			ArrayList<String> yearlySavingResultArray = Dataresult.get("yearlySavingResultArray");
			ArrayList<String> investReturnResultArray = Dataresult.get("investReturnResultArray");
			ArrayList<String> breakEvenArray = Dataresult.get("breakEvenArray");
			
			t.addCell("Year");
			for (int i = 0; i < yearlyArray.size(); i++) {
//				generatedTable.setText(0, i + 1, yearlyArray.get(i).toString());
				t.addCell(yearlyArray.get(i).toString());
//				data.setValue(i, 0, Integer.toString(i+1));
//				data.setValue(i, 1, Double.parseDouble(yearlySavingResultArray.get(i)));
//				data.setValue(i, 2, Double.parseDouble(investReturnResultArray.get(i)));
			}
			document.add(t);
			
			t2.addCell("Daily Gen");
			// Daily
			for (int i = 0; i < dailyGenResultArray.size(); i++) {
//				generatedTable.setText(1, i + 1, dailyGenResultArray.get(i).toString());
				t2.addCell(dailyGenResultArray.get(i).toString());
			}
			document.add(t2);
			
			t3.addCell("Yearly Gen Result");
			// Yearly
			for (int i = 0; i < yearlyGenResultArray.size(); i++) {
//				generatedTable.setText(2, i + 1, yearlyGenResultArray.get(i).toString());
				t3.addCell(yearlyGenResultArray.get(i).toString());
			}
			document.add(t3);
			
			t4.addCell("Yearly Saving Result");
			// Yearly
			for (int i = 0; i < yearlySavingResultArray.size(); i++) {
//				generatedTable.setText(3, i + 1, yearlySavingResultArray.get(i).toString());
				t4.addCell(yearlySavingResultArray.get(i).toString());
			}
			document.add(t4);
			
			t5.addCell("Investment Return");
			// Invest
			for (int i = 0; i < investReturnResultArray.size(); i++) {
//				generatedTable.setText(4, i + 1, investReturnResultArray.get(i).toString());
				t5.addCell(investReturnResultArray.get(i).toString());
			}
			document.add(t5);

			if (Double.parseDouble(breakEvenArray.get(0)) <= 0) {
				document.add(new Paragraph("This will not break even"));
			} else {
				document.add(new Paragraph("It will take " + breakEvenArray.get(0).toString() + " years to break even."));
			}


			bravo.close();
			document.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
