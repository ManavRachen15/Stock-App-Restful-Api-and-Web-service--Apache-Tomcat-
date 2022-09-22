import Classes.StockReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
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
public class UI extends javax.swing.JFrame {
 DefaultTableModel tableModel;
 
    /**
     * Creates new form UI
     */
    public UI() {                                                           
        initComponents();
        tableModel = (DefaultTableModel) jTable1.getModel();
       
    }
    
    
    private void filter(String query){
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(tableModel);
        jTable1.setRowSorter(tr);                                                               // this method sorts/filters the table this is thne connected
        tr.setRowFilter(RowFilter.regexFilter(query));                                          // to the search box 
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        AmountofS = new javax.swing.JTextField();
        ShareCode = new javax.swing.JTextField();
        Buy = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ShareCode1 = new javax.swing.JTextField();
        AmountofS1 = new javax.swing.JTextField();
        Sell = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Refresh");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        AmountofS.setText("Amount of shares");
        AmountofS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountofSActionPerformed(evt);
            }
        });

        ShareCode.setText("Share name");
        ShareCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShareCodeActionPerformed(evt);
            }
        });

        Buy.setText("Buy");
        Buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stock", "Code", "Price", "Rate", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        ShareCode1.setText("Share name");
        ShareCode1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShareCode1ActionPerformed(evt);
            }
        });

        AmountofS1.setText("Amount of shares");
        AmountofS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountofS1ActionPerformed(evt);
            }
        });

        Sell.setText("Sell");
        Sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellActionPerformed(evt);
            }
        });

        jTextField1.setText("Currency");

        jTextField2.setText("Search");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sell)
                    .addComponent(ShareCode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AmountofS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AmountofS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ShareCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Buy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(47, 47, 47))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ShareCode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AmountofS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Sell)
                            .addComponent(Buy)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ShareCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AmountofS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String currency = jTextField1.getText();
        FileReader in = null;
        tableModel.setRowCount(0);
        try {
            in = new FileReader("F:\\manavsShit\\Masters\\Cloud\\file.txt");
            BufferedReader br = new BufferedReader(in);
            String line;                                                   // this section reads the text file and recalls current stocks from the shares file
            while ((line = br.readLine()) != null) {
                //JSON Breakdown
                JSONObject rootObject = new JSONObject(line);
                JSONArray stockArray = new JSONArray(rootObject.getJSONArray("Current stocks"));
             

          // for (int i=0; i < stockArray.length(); i++){
                    
                   
                    
                ArrayList<StockReader> stocks = new ArrayList<>();

                try{
                HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://yfapi.net/v6/finance/quote?region=US&lang=en&symbols=AMZN%2CAAPL%2CBILI%2CNKE%2CADS"))
                .header("x-api-key", "sF6azm4x63GRwIFoMzV5a9fBtI8xKZH9v1GFIBU1")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();                                                                       // this section calls the api yahoo finace we declare the varibles that the api has 
                                                                                                // to display infomation from our stock reader class.
                HttpResponse<String> call = HttpClient.newHttpClient()                          
                .send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println(call.body()); 
                
                JSONObject jsonObject = new JSONObject(call.body());
                JSONObject quoteResponse = jsonObject.getJSONObject("quoteResponse");
                JSONArray jsonArray = quoteResponse.getJSONArray("result");
                
                for (int z = 0; z < jsonArray.length(); z++) {
                    JSONObject tempStock = new JSONObject();
                    tempStock = stockArray.getJSONObject(z);
                    
                    String companyCode = jsonArray.getJSONObject(z).getString("symbol");
                    String companyName = jsonArray.getJSONObject(z).getString("shortName");
                    Double noStock = jsonArray.getJSONObject(z).getDouble("regularMarketPrice");
                    String Rate = jsonArray.getJSONObject(z).getString("currency");
                    Double stockPrice = jsonArray.getJSONObject(z).getDouble("regularMarketPrice");
                    
                    tableModel.insertRow(z, new Object[]{companyName,companyCode,stockPrice*GetCurRate(Rate,currency),currency, tempStock.getDouble("Amount")});
                    StockReader stock = new StockReader(companyName, companyCode, stockPrice, noStock, Rate);
                    stocks.add(stock);
                }
            } catch (IOException e) {
               e.printStackTrace();
            }       catch (InterruptedException ex) {
                        Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
               // }
            }
            in.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error");
        } catch (IOException ex) { 
            System.out.println("Error");
     } 
            


    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ShareCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShareCodeActionPerformed
        
    }//GEN-LAST:event_ShareCodeActionPerformed

    private void AmountofSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountofSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmountofSActionPerformed

    private void BuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyActionPerformed
        String AmountBought = AmountofS.getText();                                                         //stores users input
        int userInt = Integer.parseInt(AmountBought);      
        String Code = ShareCode.getText();
                                                                                                         // when the user buys a stock the txt fille gets read displaying the code and amount
                                                                                                        // this then re writes to the file with the new value or how many stocks remain
        FileReader source = null;
        try{
            source = new FileReader("F:\\manavsShit\\Masters\\Cloud\\file.txt");
            BufferedReader buffReader = new BufferedReader(source);
            String newLine;           
           
            while ((newLine = buffReader.readLine()) != null){
                JSONObject rootObject = new JSONObject(newLine);
                JSONArray stockArray = new JSONArray(rootObject.getJSONArray("Current stocks"));
                for (int i=0; i < stockArray.length(); i++){
                    JSONObject tempStock = new JSONObject();
                    tempStock = stockArray.getJSONObject(i);
                    System.out.println(tempStock.getString("Code") + tempStock.getInt("Amount"));
                   
                    FileWriter sharesFile = new FileWriter("F:\\manavsShit\\Masters\\Cloud\\file.txt"); 
                    PrintWriter AmountofS = new PrintWriter(new FileWriter("F:\\manavsShit\\Masters\\Cloud\\file3.txt", true));
                    JSONObject jsonObject = new JSONObject(stockArray.get(i).toString());
                    AmountofS.write(Code+AmountBought+"}\n");
                    
                    try
                    {                      
                        if(jsonObject.getString("Code").equals(Code)) {
                            int bought = tempStock.getInt("Amount")-userInt;
                            jsonObject.put("Amount", bought);
                            tableModel.insertRow(i, new Object[]{tempStock.getString("CompanyName"),tempStock.getString("Code"),null, null, bought});
                        }
                        else if(jsonObject.getString("Code") != Code)
                        {
                            System.out.println("ERROR");
                        }
                        stockArray.put(i, jsonObject);
                        System.out.println("{Current stocks:"+stockArray.toString()+"}");
                        sharesFile.write("{\"Current stocks\":"+stockArray.toString()+"}");
                    }
                    catch (IOException IO){
                        IO.printStackTrace();
                   }
                    finally{
                        sharesFile.flush();
                        sharesFile.close();
                        AmountofS.flush();
                        AmountofS.close();      
                    }        
                }     
            }   
            
            source.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            source.close();
        }
        catch(IOException ex) {
           Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }
         
      
    }//GEN-LAST:event_BuyActionPerformed

    private void ShareCode1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShareCode1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShareCode1ActionPerformed

    private void AmountofS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountofS1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmountofS1ActionPerformed

    private void SellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellActionPerformed
        String AmountBought = AmountofS1.getText();
        int userInt = Integer.parseInt(AmountBought);                                       //stores users input
        String Code = ShareCode1.getText();
        FileReader source = null;
        
        try{                                                                                            // when the user sells a stock the txt fille gets read displaying the code and amount                                                                                          // this then re writes to the file with the new value or how many stocks remain
            source = new FileReader("F:\\manavsShit\\Masters\\Cloud\\file.txt");
            BufferedReader buffReader = new BufferedReader(source);
            String newLine;           
            while ((newLine = buffReader.readLine()) != null){
                JSONObject rootObject = new JSONObject(newLine);
                JSONArray stockArray = new JSONArray(rootObject.getJSONArray("Current stocks"));
                
                for (int i=0; i < stockArray.length(); i++){
                    
                    JSONObject tempStock = new JSONObject();
                    tempStock = stockArray.getJSONObject(i);
                    System.out.println(tempStock.getString("Code") + tempStock.getInt("Amount"));
                   
                    FileWriter sharesFile = new FileWriter("F:\\manavsShit\\Masters\\Cloud\\file.txt");    
                    FileWriter AmountofS1 = new FileWriter("F:\\manavsShit\\Masters\\Cloud\\file3.txt");    
                    JSONObject jsonObject = new JSONObject(stockArray.get(i).toString());
                    AmountofS1.write(AmountBought.toString()+"}");
                    try
                    {                      
                        if(jsonObject.getString("Code").equals(Code)) {
                            int Sold = tempStock.getInt("Amount")+userInt;
                            jsonObject.put("Amount", Sold);
                            tableModel.insertRow(i, new Object[]{tempStock.getString("CompanyName"),tempStock.getString("Code"), null, null,Sold});
                        }
                        
                        else if(jsonObject.getString("Code") != Code)
                        {
                            System.out.println("ERROR");
                        }
                        stockArray.put(i, jsonObject);
                        System.out.println("{Current stocks:"+stockArray.toString()+"}");
                        sharesFile.write("{\"Current stocks\":"+stockArray.toString()+"}");
                       
                    }
                    catch (IOException IO){
                        IO.printStackTrace();
                    }
                    finally{
                        sharesFile.flush();
                        sharesFile.close();     
                           
                        
                        
                    }
                }
            }   
            source.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            source.close();
        }
        catch(IOException ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_SellActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        String query=jTextField2.getText();         // this segment allows the textbox to search the shares section
        filter(query);
    }//GEN-LAST:event_jTextField2KeyReleased

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //Read JSON File

                //Ammend JTable
                new UI().setVisible(true);
            }
        });
    }
    public double GetCurRate(String from, String to){
    
        try {
            //I. setup the URL to call the REST API (web service API)
            String urlString = String.format("http://localhost:8080/CurConvRS/webresources/exchangeRate?fromCur=%s&toCur=%s", from, to);
            URL url = new URL(urlString);
            //II. Connect to the REST API 
            HttpURLConnection connURL = (HttpURLConnection) url.openConnection();
            connURL.setRequestMethod("GET");            
            System.out.println("\nREST API call: " + connURL+ "\n");                                    // getcur rates is the currecy ecxchange api it reads from the url this fucntion get called
            connURL.connect();                                                                          // in the refresh button function
            //Attach a stream to the REST API connection to retrieve the service response
            BufferedReader ins = new BufferedReader(new InputStreamReader(connURL.getInputStream()));
            String inString;
            StringBuilder sb = new StringBuilder();
            while ((inString = ins.readLine()) != null)  {
               sb.append(inString);
            }
           ins.close();
           connURL.disconnect();
           String bob = sb.toString();
           String[] splited = bob.split(" ");
           Double curRate = Double.parseDouble(splited[0]);
           return curRate;
          

        } 
        catch (MalformedURLException me) {
            System.out.println("MalformedURLException: " + me);
        } 
        catch (IOException ioe) {
            System.out.println("IOException: " + ioe);
        }
     return 0;
    }
    
    private static String jsonParse(String RESTresponse) {

       JSONObject json = new JSONObject (RESTresponse);
       
       return json.toString();
    }   
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountofS;
    private javax.swing.JTextField AmountofS1;
    private javax.swing.JButton Buy;
    private javax.swing.JButton Sell;
    private javax.swing.JTextField ShareCode;
    private javax.swing.JTextField ShareCode1;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}