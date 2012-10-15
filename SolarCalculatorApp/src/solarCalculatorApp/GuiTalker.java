package solarCalculatorApp;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JEditorPane;
import javax.swing.JFrame;


public class GuiTalker {


	
	//private static String urlToServer = "http://pantsofffriday372project.appspot.com/CalculatorServlet";
	private static String urlToServer = "http://localhost:8888/";
	private static String urlToPopulate = "guiAppPopulateServlet";
	private static String urlToCalc = "guiAppCalcServlet";
	
	public GuiTalker() {
		
	}
	
	private URL getSerlvetConnection(String connectUrl) throws MalformedURLException {
		URL url = new URL(connectUrl);
		return url;
	}
	
	static HashMap<String, ArrayList<String>> dataOut = new HashMap<String, ArrayList<String>>();
	static ArrayList<String> panelBrand = new ArrayList<String>();
	static ArrayList<String> energyProv = new ArrayList<String>();
	static ArrayList<String> inverterBrand = new ArrayList<String>();
	
	public final static HashMap<String, ArrayList<String>> inverterBrandModels = new HashMap<String, ArrayList<String>>();
	public final static HashMap<String, ArrayList<String>> panelBrandModels = new HashMap<String, ArrayList<String>>();
	
	//this gets the data to populate the lists.
	public HashMap<String, ArrayList<String>> getPopData() {
		
		//ArrayList<String> inverterModel= new ArrayList<String>();
		try {
			String connectURL = urlToServer + urlToPopulate;
			URL urlpath = getSerlvetConnection(connectURL);
			BufferedReader reader = new BufferedReader(new InputStreamReader(urlpath.openStream()));
			String line;
			
			String regexBrand = "[*]+";
			String regexModel = "[,]+";
			
			
			
			while ((line = reader.readLine()) != null) {
				String[] lineModels = null;
				if (line.toString().contains("INVERTERBRAND")) {
					line = line.replace("INVERTERBRAND", "");
					String[] lineBrands = line.split(regexBrand);
					for (int i=0 ; i<lineBrands.length ; i++) {
						lineModels = lineBrands[i].toString().split(regexModel);
						ArrayList<String> temp = new ArrayList<String>();
						inverterBrand.add(lineModels[1]);
						for (int count=2 ; count<lineModels.length ; count++) {
							temp.add(lineModels[count].toString());
						}
						inverterBrandModels.put(lineModels[1], temp);
					}
				} else if (line.toString().contains("PANELBRAND")) {
					line = line.replace("PANELBRAND", "");
					String[] lineBrands = line.split(regexBrand);
					for (int i=0 ; i<lineBrands.length ; i++) {
						lineModels = lineBrands[i].toString().split(regexModel);
						ArrayList<String> temp = new ArrayList<String>();
						panelBrand.add(lineModels[1]);
						for (int count=2 ; count<lineModels.length ; count++) {
							temp.add(lineModels[count].toString());
						}
						panelBrandModels.put(lineModels[1], temp);
					}
				} else if (line.toString().contains("ENERGY")) {
					line = line.replace("ENERGY", "");
					String[] energy = line.split("[,]+");
					for (int i=1 ; i<energy.length ; i++) {
						energyProv.add(energy[i]);
					}
				}
				
			}
			
			dataOut.put("Inverter Brand", inverterBrand);
//			dataOut.put("Inverter Model", inverterModel);
			dataOut.put("Panel Brand", panelBrand);
			dataOut.put("Energy", energyProv);
			
			reader.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataOut;
	}
	
	//this sends and receives the data for calculations.
	public void sendCalcData(String urlInput) {
		try {
			String connectURL = urlToServer + urlToCalc + urlInput;
			//URL urlpath = getSerlvetConnection(connectURL);
			URL urlpath = new URL(connectURL);
			BufferedReader reader = new BufferedReader(new InputStreamReader(urlpath.openStream()));
			
			String line;
	
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/*public void random() {
		try {
		    String url = "http://localhost:8888/guiAppPopulateServlet";
//		    String url= "http://www.google.com.au";
		    JEditorPane editorPane = new JEditorPane(url);
		    editorPane.setEditable(false);

		    JFrame frame = new JFrame();
		    frame.getContentPane().add(editorPane, BorderLayout.CENTER);
		    frame.setSize(400, 400);
		    frame.setVisible(true);
		} catch (IOException e) {
		}
	}*/
	
	
	
	
//	public  void getServletConnection() throws IOException {
//
//		String responded = "";
//		URL urlServlet = new URL(urlToServer);
//		HttpURLConnection con = (HttpURLConnection) urlServlet.openConnection();
//		con.setDoInput(true);
//		con.setDoOutput(true);
//		con.connect();
//		//con.getResponseMessage();
//		//responded += con.getResponseCode();
//		//responded += con.getResponseMessage();
//		//System.out.println(con.getContent().toString());
//		/*System.out.println(con.getContentType().toString());
//		System.out.println(con.getContentLength());
//		System.out.println(con.getContent().toString());
//		System.out.println(con.getc);*/
//		try {
//InputStream in = con.getInputStream();
//ObjectInputStream input = new ObjectInputStream(in);
//String echo;
//
//	echo = (String) input.readObject();
//
//input.close();
//in.close();
//
//System.out.println(echo);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		if (!responded.isEmpty()) {
//			System.out.println("Received");
//			System.out.println(responded);
//		}
//		con.disconnect();
//		System.out.println("Checkpoint 5");
//		
//		
//	}
	
}