package solarCalculatorApp;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;


public class AppServlet {


	private static String urlToServer = "http://www.google.com.au";
	
	public AppServlet() {
		
	}
	
	public  void getServletConnection() throws IOException {
		//String responded = "";
		URL urlServlet = new URL("http://www.rainbowballs.com.au/niknakme/category.php?categryID=5");
		System.out.println("Checkpoint 1");
		HttpURLConnection con = (HttpURLConnection) urlServlet.openConnection();
		System.out.println("Checkpoint 2");
		con.setDoInput(true);
		con.setRequestMethod("GET");
		System.out.println("Checkpoint 3");
		con.connect();
		System.out.println("Checkpoint 4");
		con.getResponseMessage();
		/*responded = con.getResponseMessage().toString();
		if (!responded.isEmpty()) {
			System.out.println("Received");
		}*/
		con.disconnect();
		System.out.println("Checkpoint 5");
		
		
	}
	
}