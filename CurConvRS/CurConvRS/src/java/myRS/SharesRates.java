/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myRS;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author manav
 */
@Path("ShareRates")
public class SharesRates {

    public SharesRates(){
    }
    
    @GET
    @Produces("text/plain")
    public String getText(@QueryParam("fromCur")String fromCur, 
                           @QueryParam("toCur")String toCur) {
        
        double cRate=0.0;
        
        try {
            double rate1 = ExRate.valueOf(fromCur).rateInGBP;
            double rate2 = ExRate.valueOf(toCur).rateInGBP;
            cRate = rate1/rate2;
        }
        catch (IllegalArgumentException iae) {
            System.err.println(iae.toString());
        }
        
        String pattern = "dd-MM-yyyy HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        
        String now = simpleDateFormat.format(new Date());
        String stampedExRate = cRate + " @ " + now;
        
        return stampedExRate;
    }

    @PUT
    @Consumes("text/plain")
    public void putText(String content) {
    }
    
       public enum ExRate {
        AMZN ("Amazon", 2785.58, 5000, "GBP"),
        AAPL ("Apple ", 162.95, 98, "GBP"),
        BC94 ("Samsung", 1434.50, 39, "GBP"),
        NKE ("Nike",126.95, 50, "GBP"),
        ADS ("adidas", 200.65, 80, "GBP");
      

        private final double rateInGBP;
        private final String curName;
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


