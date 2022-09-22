/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myRS;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * REST Web Service
 *
 * @author manav
 */
@Path("shares")
public class shares {

    public shares(){
    
    }
   @GET
    @Produces("application/json")
    public String getJson() {

        JSONArray shares = new JSONArray();

        for (ExRate exr : ExRate.values()) {
            JSONObject job = new JSONObject();
            job.put("Company Name", exr.curName());
            job.put("Code", exr.name());
            job.put("Price", exr.rateInGBP());
            shares.put(job);
        }

        JSONObject rootJobj = new JSONObject();
        
        rootJobj.put("CurrConv", shares);
        //currconv
        return rootJobj.toString();
    }
    
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
    
    public enum ExRate {
        AMZN ("Amazon", 2785.58),
        AAPL ("Apple ", 162.95),
        BC94 ("Samsung", 1434.50),
        NKE ("Nike",126.95),
        ADS ("adidas", 200.65);
      

        private final double rateInGBP;
        private final String curName;
        ExRate(String curName,double rateInGBP) {
            this.rateInGBP = rateInGBP;
            this.curName = curName;
        }
        double rateInGBP()   { return rateInGBP; }
        String curName()   { return curName; }
    }
}
