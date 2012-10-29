package solarCalculatorApp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class ResultReportGeneration {

	public void make( HashMap<String, ArrayList<String>> Dataresult, HashMap<String, String> optionSelect) {
		try {
			Document document = new Document(PageSize.A4);
			
			String input = JOptionPane.showInputDialog(null, "Enter file name to save as: (Caution, any file will be overwritten.");
			
			PdfWriter bravo = PdfWriter.getInstance(document,
					new FileOutputStream(input + ".pdf"));
			document.addAuthor("Pants off Friday");
			document.addSubject("Solar Power Calculator");
			document.addTitle("Solar Power Calculation");
			document.open();
			document.add(new Paragraph("Note: if this report isn't generated, please re-run the program."));
			
			List optionList = new List(true, false, 10);

			optionList.add(new ListItem("Number of panels: " + optionSelect.get("numPanel")));
			optionList.add(new ListItem("Panel Brand: " + optionSelect.get("panelBrand")));
			optionList.add(new ListItem("Panel Model: " + optionSelect.get("panelNum")));
			optionList.add(new ListItem("Inverter Brand: " + optionSelect.get("invBrand")));
			optionList.add(new ListItem("Inverter Model: " + optionSelect.get("invNum")));
			optionList.add(new ListItem("Energy Provider: " + optionSelect.get("energyProv")));
			optionList.add(new ListItem("Tilt Angle: " + optionSelect.get("tilt")));
			optionList.add(new ListItem("Roof Orientation: " + optionSelect.get("orientation")));
			optionList.add(new ListItem("Installation Cost: " + optionSelect.get("initInstalCost")));
			optionList.add(new ListItem("Avg. Daily Usage: " + optionSelect.get("dailyUsage")));
			optionList.add(new ListItem("Postcode: " + optionSelect.get("postcode")));
	        
			document.add(optionList);
			
			float tableWidth = 100;
			
			PdfPTable t = new PdfPTable(21);
			PdfPTable t2 = new PdfPTable(21);
			PdfPTable t3 = new PdfPTable(21);
			PdfPTable t4 = new PdfPTable(21);
			PdfPTable t5 = new PdfPTable(21);
			t.setWidthPercentage(tableWidth);
			t2.setWidthPercentage(tableWidth);
			t3.setWidthPercentage(tableWidth);
			t4.setWidthPercentage(tableWidth);
			t5.setWidthPercentage(tableWidth);
			
			
			ArrayList<String> yearlyArray = Dataresult.get("yearlyArray");
			ArrayList<String> dailyGenResultArray = Dataresult.get("dailyGenResultArray");
			ArrayList<String> yearlyGenResultArray = Dataresult.get("yearlyGenResultArray");
			ArrayList<String> yearlySavingResultArray = Dataresult.get("yearlySavingResultArray");
			ArrayList<String> investReturnResultArray = Dataresult.get("investReturnResultArray");
			ArrayList<String> breakEvenArray = Dataresult.get("breakEvenArray");
			
			document.setPageSize(PageSize.A4.rotate());
			document.newPage();
			document.add(new Paragraph("Result Data"));
			t.addCell("Year");
			for (int i = 0; i < yearlyArray.size(); i++) {
				t.addCell(yearlyArray.get(i).toString());
			}
//			document.add(t);
			
			t2.addCell("Daily Gen");
			// Daily
			for (int i = 0; i < dailyGenResultArray.size(); i++) {
//				generatedTable.setText(1, i + 1, dailyGenResultArray.get(i).toString());
				t2.addCell(dailyGenResultArray.get(i).toString());
			}
//			document.add(t2);
			
			t3.addCell("Yearly Gen Result");
			// Yearly
			for (int i = 0; i < yearlyGenResultArray.size(); i++) {
//				generatedTable.setText(2, i + 1, yearlyGenResultArray.get(i).toString());
				t3.addCell(yearlyGenResultArray.get(i).toString());
			}
//			document.add(t3);
			
			t4.addCell("Yearly Saving Result");
			// Yearly
			for (int i = 0; i < yearlySavingResultArray.size(); i++) {
//				generatedTable.setText(3, i + 1, yearlySavingResultArray.get(i).toString());
				t4.addCell(yearlySavingResultArray.get(i).toString());
			}
//			document.add(t4);
			
			t5.addCell("Investment Return");
			// Invest
			for (int i = 0; i < investReturnResultArray.size(); i++) {
//				generatedTable.setText(4, i + 1, investReturnResultArray.get(i).toString());
				t5.addCell(investReturnResultArray.get(i).toString());
			}
//			document.add(t5);

			if (Double.parseDouble(breakEvenArray.get(0)) <= 0) {
				document.add(new Paragraph("This will not break even"));
			} else {
				document.add(new Paragraph("It will take " + breakEvenArray.get(0).toString() + " years to break even."));
			}

			t.setComplete(true);
			t2.setComplete(true);
			t3.setComplete(true);
			t4.setComplete(true);
			t5.setComplete(true);
			
			t.completeRow();
			t2.completeRow();
			t3.completeRow();
			t4.completeRow();
			t5.completeRow();
			
			document.add(t);
			document.add(t2);
			document.add(t3);
			document.add(t4);
			document.add(t5);
			
			t.flushContent();
			t2.flushContent();
			t3.flushContent();
			t4.flushContent();
			t5.flushContent();
			
//			bravo.close();
			bravo = null;
			document.close();
			document = null;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,
					"The file cannot be accessed because it is being used by another process",
					"File error", JOptionPane.ERROR_MESSAGE);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
