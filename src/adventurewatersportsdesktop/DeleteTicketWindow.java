/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adventurewatersportsdesktop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;
import models.Order;
import org.json.JSONObject;
import system.DateTime;

/**
 *
 * @author darro
 */
public class DeleteTicketWindow extends javax.swing.JFrame {
    
    private Order ticketOrder;

    /**
     * Creates new form DeleteTicketWindow
     */
    public DeleteTicketWindow() {
        initComponents();
        
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelTicketSerial = new javax.swing.JPanel();
        etTicketSerialNumber = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        panelTicketInfo = new javax.swing.JPanel();
        btnDeleteTicket = new javax.swing.JButton();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        tvSerialNumber = new javax.swing.JLabel();
        tvPax = new javax.swing.JLabel();
        tvAmount = new javax.swing.JLabel();
        tvDate = new javax.swing.JLabel();
        tvPaymentMode = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panelTicketSerial.setBackground(new java.awt.Color(255, 255, 255));
        panelTicketSerial.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder("Ticket Serial Number"), null)); // NOI18N

        etTicketSerialNumber.setBorder(javax.swing.BorderFactory.createTitledBorder("Serial Number"));

        btnSearch.setLabel("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTicketSerialLayout = new javax.swing.GroupLayout(panelTicketSerial);
        panelTicketSerial.setLayout(panelTicketSerialLayout);
        panelTicketSerialLayout.setHorizontalGroup(
            panelTicketSerialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTicketSerialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etTicketSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTicketSerialLayout.setVerticalGroup(
            panelTicketSerialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTicketSerialLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelTicketSerialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etTicketSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTicketInfo.setBackground(new java.awt.Color(255, 255, 255));
        panelTicketInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ticket Information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        btnDeleteTicket.setText("Delete");
        btnDeleteTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTicketActionPerformed(evt);
            }
        });

        jLabel1.setText("Serial-No :");

        jLabel2.setText("Pax :");

        jLabel3.setText("Amount :");

        jLabel4.setText("Payment-Mode :");

        jLabel5.setText("Date :");

        tvSerialNumber.setText("jLabel6");

        tvPax.setText("jLabel6");

        tvAmount.setText("jLabel6");

        tvDate.setText("jLabel6");

        tvPaymentMode.setText("jLabel6");

        javax.swing.GroupLayout panelTicketInfoLayout = new javax.swing.GroupLayout(panelTicketInfo);
        panelTicketInfo.setLayout(panelTicketInfoLayout);
        panelTicketInfoLayout.setHorizontalGroup(
            panelTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTicketInfoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelTicketInfoLayout.createSequentialGroup()
                        .addComponent(tvAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addComponent(tvPax, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelTicketInfoLayout.createSequentialGroup()
                        .addComponent(tvSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tvDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tvPaymentMode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTicketInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeleteTicket)
                .addGap(17, 17, 17))
        );
        panelTicketInfoLayout.setVerticalGroup(
            panelTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTicketInfoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(tvSerialNumber)
                    .addComponent(tvDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tvPax))
                .addGap(12, 12, 12)
                .addGroup(panelTicketInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(tvAmount)
                    .addComponent(tvPaymentMode))
                .addGap(18, 18, 18)
                .addComponent(btnDeleteTicket)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTicketSerial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTicketInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panelTicketSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelTicketInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        
        if (isSerialNumberValid()) {
            String serialNumber = etTicketSerialNumber.getText();
            getTicketDetailsOnSerialNumber(serialNumber);
        }
    }                                         

    private void btnDeleteTicketActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        if (ticketOrder.getId() != -1) {
            deleteOrderTicket();
            setVisibilityToFalse();
            clearInputField();
            dispose();
        }
    }                                               

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DeleteTicketWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteTicketWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteTicketWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteTicketWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteTicketWindow().setVisible(true);
            }
        });
    }
    
    // init
    private void init() {
        panelTicketInfo.setVisible(false);
    }
    
    // Check if serial number entered in the field
    private boolean isSerialNumberValid() {
        String serialNumber = etTicketSerialNumber.getText();
        
        if (serialNumber.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: " + " Serial-Number is required", "No Data Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (serialNumber.length() > 7) {
            JOptionPane.showMessageDialog(null, "Error: " + "Serial-Number length is over character", "No Data Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    private void displayTicketInfo(String date, String serialNo, int pax, double amount, String paymentMode) {
        panelTicketInfo.setVisible(true);
        
        tvSerialNumber.setText(serialNo);
        tvDate.setText(date);
        tvPax.setText(String.valueOf(pax));
        tvAmount.setText(String.valueOf(amount));
        tvPaymentMode.setText(paymentMode);
    }
    
    private void clearInputField() {
        etTicketSerialNumber.setText("");
    }
    
    private void setVisibilityToFalse() {
        panelTicketInfo.setVisible(false);
    }
    
    
    // API to get ticket details
    private void getTicketDetailsOnSerialNumber(String ticketSerialNumber) {
        String api = "http://127.0.0.1:5000/get_order_details?serial_no=" + ticketSerialNumber;
        
        try {
            URL url = new URL(api);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the HTTP request method to GET
            connection.setRequestMethod("GET");
            
            // Get the HTTP response code
            int responseCode = connection.getResponseCode();
            
            if (responseCode == HttpURLConnection.HTTP_OK) {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    StringBuilder response = new StringBuilder();
                    String line;
                    
                    while((line = br.readLine()) != null) {
                        response.append(line);
                    }
                    
                    JSONObject object = new JSONObject(response.toString());
                    
                    int id = object.getInt("id");
                    double amount = object.getDouble("amount");
                    String date = object.getString("created_at");
                    int pax = object.getInt("pax");
                    String paymentMode = object.getString("payment_method");
                    String serialNumber = object.getString("serial_no");
                    
                    ticketOrder = new Order(id, date, serialNumber, amount, pax, paymentMode);
                    
                    String formatedDate = DateTime.getDate(date);
                    displayTicketInfo(formatedDate, serialNumber, pax, amount, paymentMode);
                            
                    
                    
                    System.out.println(object);
                }
            } else if (responseCode == HttpURLConnection.HTTP_BAD_REQUEST) {
                System.out.println(responseCode + " HTTP-BAD-REQUEST");
            }
            
            System.out.println(responseCode);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void deleteOrderTicket() {
        int id = ticketOrder.getId();
        System.out.println(id + " Order-Ticket-Id");
        String api = "http://127.0.0.1:5000/delete_order/" + id;
        
        try {
            URL url = new URL(api);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("DELETE");
            
            // Get the response code
            int responseCode = connection.getResponseCode();
            
            if (responseCode == HttpURLConnection.HTTP_OK) {
                JOptionPane.showMessageDialog(null, "Ticket " + ticketOrder.getSerialNumber() + " Cancelled");
                
                /*
                    {
                        "message": "Deleted order with ID 76"
                    }
                */
            } else {
                // Payment failed, show an error message
                JOptionPane.showMessageDialog(null, "Payment Failed:", "Payment Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnDeleteTicket;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextField etTicketSerialNumber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelTicketInfo;
    private javax.swing.JPanel panelTicketSerial;
    private javax.swing.JLabel tvAmount;
    private javax.swing.JLabel tvDate;
    private javax.swing.JLabel tvPax;
    private javax.swing.JLabel tvPaymentMode;
    private javax.swing.JLabel tvSerialNumber;
    // End of variables declaration                   
}
