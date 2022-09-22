/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockService;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import org.eclipse.persistence.internal.oxm.record.json.JsonParserReader;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * REST Web Service
 *
 * @author manav
 */
@Path("shares")
public class shares {
    
    public static FileWriter file;
    public shares(){
    
    }
   @GET
   @Produces("application/json")
    public String getJson() throws IOException {

        JSONArray shares = new JSONArray();

        for (ExRate exr : ExRate.values()) {
            JSONObject job = new JSONObject();
            job.put("CompanyName", exr.curName());
            job.put("Code", exr.name());                        // this for section gets added to an json array from an json object
            job.put("Price", exr.rateInGBP());
            job.put("Amount", exr.noStocks());
            job.put("Rate", exr.Rate());
            
            shares.put(job);
        }
        JSONObject rootJobj = new JSONObject();
        
        
        rootJobj.put("Current stocks", shares);         
      
        //currconv
      
       FileWriter file = new FileWriter("F:\\manavsShit\\Masters\\Cloud\\file.txt");
       try{
        file.write(rootJobj.toString());
        System.out.println("coppied object to file");
        System.err.println("\nJSON object: " + rootJobj);
                                                                    // this writes to a txt file as a json array
       
        }catch (IOException e){
             e.printStackTrace();
        }finally{ 
            file.flush();
            file.close();
            return rootJobj.toString();
        }
    }
    
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
   
    public enum ExRate {
        AMZN ("Amazon", 2785.58, 5000, "GBP"),                   // enum to store static data
        AAPL ("Apple ", 162.95, 5000, "GBP"),
        BILI ("BILI", 1434.50, 5000, "GBP"),
        NKE ("Nike",126.95, 5000, "GBP"),
        ADS ("Alliance data Systems", 200.65, 5000, "GBP");
      

        private final double rateInGBP;
        private final String curName;                                           //setting the names for each thing in the enum 
        private final int noStocks;
        private final String Rate;
        ExRate(String curName,double rateInGBP, int noStocks, String Rate) {
            this.rateInGBP = rateInGBP;
            this.curName = curName;
            this.noStocks = noStocks;
            this.Rate = Rate;
        }
        double rateInGBP()   { return rateInGBP; }
        String curName()   { return curName; }
        int noStocks() {return noStocks; }
        String Rate() {return Rate; }
    }
   
}
