package solarCalculatorApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;


public class GuiTalker {
	
	private static String urlToServer = "http://pantsofffriday372project.appspot.com/";
	//private static String urlToServer = "http://localhost:8888/";
	private static String urlToPopulate = "guiAppPopulateServlet";
	private static String urlToCalc = "guiAppCalcServlet";
	
	public GuiTalker() {
		
	}
	
	
	private URL getSerlvetConnection(String connectUrl) throws MalformedURLException, ConnectException {
		URL url = new URL(connectUrl);
		return url;
	}
	
	static HashMap<String, ArrayList<String>> dataListIn = new HashMap<String, ArrayList<String>>();
	static ArrayList<String> panelBrand = new ArrayList<String>();
	static ArrayList<String> energyProv = new ArrayList<String>();
	static ArrayList<String> inverterBrand = new ArrayList<String>();
	
	public static final HashMap<String, ArrayList<String>> inverterBrandModels = new HashMap<String, ArrayList<String>>();
	public static final HashMap<String, ArrayList<String>> panelBrandModels = new HashMap<String, ArrayList<String>>();
	
	//this gets the data to populate the lists.
	public HashMap<String, ArrayList<String>> getPopData() throws ConnectException{
		try {
			String connectURL = urlToServer + urlToPopulate;
			URL urlpath = getSerlvetConnection(connectURL);
			BufferedReader reader = new BufferedReader(new InputStreamReader(urlpath.openStream()));
			String line;
			
			String regexBrand = "[*]+";
			String regexModel = "[,]+";
			
			while ((line = reader.readLine()) != null) {
				String[] lineModels = null;
				if (line.toString().contains("INVERTERBRAND")) {//Checks for the correct line of results
					line = line.replace("INVERTERBRAND", "");
					String[] lineBrands = line.split(regexBrand);//Splits each brand and model combo up
					for (int i=0 ; i<lineBrands.length ; i++) {
						lineModels = lineBrands[i].toString().split(regexModel);//Splits each model of brand up
						ArrayList<String> temp = new ArrayList<String>();
						inverterBrand.add(lineModels[1]);
						for (int count=2 ; count<lineModels.length ; count++) {
							temp.add(lineModels[count].toString()); // adds the brand with all models for it
						}
						inverterBrandModels.put(lineModels[1], temp);
					}
				} else if (line.toString().contains("PANELBRAND")) {//Checks for the correct line of results
					line = line.replace("PANELBRAND", "");
					String[] lineBrands = line.split(regexBrand);//Splits each brand and model combo up
					for (int i=0 ; i<lineBrands.length ; i++) {
						lineModels = lineBrands[i].toString().split(regexModel);//Splits each model of brand up
						ArrayList<String> temp = new ArrayList<String>();
						panelBrand.add(lineModels[1]);
						for (int count=2 ; count<lineModels.length ; count++) {
							temp.add(lineModels[count].toString());// adds the brand with all models for it
						}
						panelBrandModels.put(lineModels[1], temp);
					}
				} else if (line.toString().contains("ENERGY")) {//Checks for the correct line of results
					line = line.replace("ENERGY", "");
					String[] energy = line.split("[,]+"); //Splits each company up
					for (int i=1 ; i<energy.length ; i++) {
						energyProv.add(energy[i]); // adds the company
					}
				}
				
			}
			
			dataListIn.put("Inverter Brand", inverterBrand);
			dataListIn.put("Panel Brand", panelBrand);
			dataListIn.put("Energy", energyProv);
			
			reader.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataListIn;
	}
	
	
	static HashMap<String, ArrayList<String>> resultIn = new HashMap<String, ArrayList<String>>();
	static ArrayList<String> yearlyArray = new ArrayList<String>();
	static ArrayList<String> dailyGenResultArray = new ArrayList<String>();
	static ArrayList<String> yearlyGenResultArray = new ArrayList<String>();
	static ArrayList<String> yearlySavingResultArray = new ArrayList<String>();
	static ArrayList<String> investReturnResultArray = new ArrayList<String>();
	static ArrayList<String> breakEvenArray = new ArrayList<String>();
	
	//this sends and receives the data for calculations.
	public  HashMap<String, ArrayList<String>> sendCalcData(String urlInput) throws ConnectException {
		
			String connectURL = urlToServer + urlToCalc + urlInput;
			URL urlpath;
			try {
				urlpath = getSerlvetConnection(connectURL);
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(urlpath.openStream()));

			String line;
			String regexResultNum = "[,]+";
			while ((line = reader.readLine()) != null) {
				if (line.toString().contains("yearlyArray,")) {//Checks for correct line of results
					line = line.replace("yearlyArray", "");
					String[] lineResultNum = line.split(regexResultNum);//Splits each result up
					for (int i=1 ; i<lineResultNum.length ; i++) {
						System.out.println(lineResultNum[i]);//TODO Need to add to some result thing here.
						yearlyArray.add(lineResultNum[i]);
					}
				} else if (line.toString().contains("dailyGenResultArray")) {//Checks for correct line of results
					line = line.replace("dailyGenResultArray,", "");
					String[] lineResultNum = line.split(regexResultNum);//Splits each result up
					for (int i=0 ; i<lineResultNum.length ; i++) {
						System.out.println(lineResultNum[i]);//TODO Need to add to some result thing here.
						dailyGenResultArray.add(lineResultNum[i]);
					}
				} else if (line.toString().contains("yearlyGenResultArray")) {//Checks for correct line of results
					line = line.replace("yearlyGenResultArray,", "");
					String[] lineResultNum = line.split(regexResultNum);//Splits each result up
					for (int i=0 ; i<lineResultNum.length ; i++) {
						System.out.println(lineResultNum[i]);//TODO Need to add to some result thing here.
						yearlyGenResultArray.add(lineResultNum[i]);
					}
				} else if (line.toString().contains("yearlySavingResultArray")) {//Checks for correct line of results
					line = line.replace("yearlySavingResultArray,", "");
					String[] lineResultNum = line.split(regexResultNum);//Splits each result up
					for (int i=0 ; i<lineResultNum.length ; i++) {
						System.out.println(lineResultNum[i]);//TODO Need to add to some result thing here.
						yearlySavingResultArray.add(lineResultNum[i]);
					}
				} else if (line.toString().contains("investReturnResultArray")) {//Checks for correct line of results
					line = line.replace("investReturnResultArray,", "");
					String[] lineResultNum = line.split(regexResultNum);//Splits each result up
					for (int i=0 ; i<lineResultNum.length ; i++) {
						System.out.println(lineResultNum[i]);//TODO Need to add to some result thing here.
						investReturnResultArray.add(lineResultNum[i]);
					}
				} else if (line.toString().contains("breakEvenArray")) {//Checks for correct line of results
					line = line.replace("breakEvenArray,", "");
					String[] energy = line.split("[,]+");//Splits each result up
					for (int i=0 ; i<energy.length ; i++) {
						System.out.println(energy[i]);//TODO Need to add to some result thing here.
						breakEvenArray.add(energy[i]);
					}
				}
			}
			
			resultIn.put("yearlyArray", yearlyArray);
			resultIn.put("dailyGenResultArray", dailyGenResultArray);
			resultIn.put("yearlyGenResultArray", yearlyGenResultArray);
			resultIn.put("yearlySavingResultArray", yearlySavingResultArray);
			resultIn.put("investReturnResultArray", investReturnResultArray);
			resultIn.put("breakEvenArray", breakEvenArray);
			
			reader.close();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return resultIn;
		
	}
}