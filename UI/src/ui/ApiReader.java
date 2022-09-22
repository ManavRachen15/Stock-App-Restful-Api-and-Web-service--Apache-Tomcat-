
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manav
 */
public class ApiReader {
    
   // TODO code application logic here
    public static void main(String[] args) {
        // TODO code application logic here
        String wsURL = "http://localhost:8080/StockService/webresources/shares";
        //final String CompName = "CompanyName";
        // final String StCode = "Code";
        //final String StPrice = "Price";
               
        try {
            //I. setup the URL to call the REST API (web service API)
            String urlString = wsURL;
            URL url = new URL(urlString);
            //II. Connect to the REST API 
            HttpURLConnection connURL = (HttpURLConnection) url.openConnection();
            connURL.setRequestMethod("GET");            
            System.out.println("\nREST API call: " + connURL+ "\n");
            connURL.connect();
            //Attach a stream to the REST API connection to retrieve the service response
            BufferedReader ins = new BufferedReader(new InputStreamReader(connURL.getInputStream()));
            String inString;
            StringBuilder sb = new StringBuilder();
            while ((inString = ins.readLine()) != null)  {
               sb.append(inString);
            }
           ins.close();
           connURL.disconnect();
           //call the XMLparse to process the REST API XML response
           System.out.println("\nfrom JSON PARSE\n"+ jsonParse(sb.toString()));

        } 
        catch (MalformedURLException me) {
            System.out.println("MalformedURLException: " + me);
        } 
        catch (IOException ioe) {
            System.out.println("IOException: " + ioe);
        }
    }
    
    private static String jsonParse(String RESTresponse) {

       JSONObject json = new JSONObject (RESTresponse);
       
       return json.toString();
       
    }   
}
