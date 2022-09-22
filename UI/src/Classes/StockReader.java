package Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manav
 */
public class StockReader {
    
   String companyName;
   double stockPrice;
   String companyCode;
   double noStock;
   String Rate;
   String Cure;

    public StockReader(String companyName, String companyCode, Double stockPrice, Double noStock, String Rate) {
      this.companyName=companyName;
      this.stockPrice=stockPrice;
      this.companyCode=companyCode;
      this.noStock=noStock;
      this.Rate=Rate;
      
    }

   
   
    public String getCompanyName() {
        return this.getCompanyName();
    }
                                                                // used to make an object which stores data
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }                                                                   
    
    public double getStockPrice() {
        return this.getStockPrice();
    }
 
    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }
    
    public String getCompanyCode() {
        return this.getCompanyCode();
    }
 
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }
    
      public double getnoStock() {
        return this.getnoStock();
    }
 
    public void setnoStock(double companyCode) {
        this.noStock = noStock;
    }
    
    public String getRate() {
        return this.getRate();
    }
 
    public void setRate(double companyCode) {
        this.Rate = Rate;
    }
}
