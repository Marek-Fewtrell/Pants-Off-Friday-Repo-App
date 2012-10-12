package solarCalculatorApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import sun.net.www.http.HttpClient;


public class GuiTalker {


	private static String urlToServer = "http://localhost:8888/guiAppServlet";
	//private static String urlToServer = "http://pantsofffriday372project.appspot.com/CalculatorServlet";
	
	public GuiTalker() {
		
	}
	
	public  void getServletConnection() throws IOException {


		String responded = "";
		URL urlServlet = new URL(urlToServer);
		HttpURLConnection con = (HttpURLConnection) urlServlet.openConnection();
		con.setDoInput(true);
		con.setDoOutput(true);
		con.connect();
		//con.getResponseMessage();
		//responded += con.getResponseCode();
		//responded += con.getResponseMessage();
		//System.out.println(con.getContent().toString());
		/*System.out.println(con.getContentType().toString());
		System.out.println(con.getContentLength());
		System.out.println(con.getContent().toString());
		System.out.println(con.getc);*/
		try {
InputStream in = con.getInputStream();
ObjectInputStream input = new ObjectInputStream(in);
String echo;

	echo = (String) input.readObject();

input.close();
in.close();

System.out.println(echo);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (!responded.isEmpty()) {
			System.out.println("Received");
			System.out.println(responded);
		}
		con.disconnect();
		System.out.println("Checkpoint 5");
		
		
	}
	
}