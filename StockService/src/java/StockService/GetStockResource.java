/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import org.json.JSONObject;



/**
 * REST Web Service
 *
 * @author manav
 */
@Path("GetStock")
public class GetStockResource {

    @Context
    private UriInfo context;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(String string) throws IOException {
      
    try {
            
            String AURL = "https://api.twelvedata.com/stocks"+"&apikey=d812c05ff7ef4c489c66160acfb0c30a";          //URL For the API Details 
            URL url = null;
            try {
                url = new URL(AURL);                                            //New URL is the API URL
            } catch (MalformedURLException ex) {
                Logger.getLogger(GetStockResource.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            HttpURLConnection connURL;                                          //Intialising that connURL is a HttpURLConnection Type            
            connURL = (HttpURLConnection) url.openConnection();                 //Opens Connection            
            connURL.setRequestMethod("GET");                                    //Sets the Request Method    

            BufferedReader ins = new BufferedReader(new InputStreamReader(connURL.getInputStream()));           //Gets the InputStream 
            String inString;
            StringBuilder JSONresultStr = new StringBuilder();                  //Makes a StringBuilder 
            while ((inString = ins.readLine()) != null) {                       
                JSONresultStr.append(inString);
            }
           
            ins.close();                                                        //Closes the BufferedReader
            connURL.disconnect();                                               //Closes the Connection
            JSONObject wholeJSON = new JSONObject(JSONresultStr.toString());    //creates a json object from the result string gained from the get response
            String last = wholeJSON.toString();                                 //JSON Object turned into a string    
            
            //return last;                                                        //Returns String
        }
            catch (IOException ex) {
            Logger.getLogger(GetStockResource.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
