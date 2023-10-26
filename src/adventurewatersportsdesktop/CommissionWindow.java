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
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import system.DateTime;
import validations.Validation;

/**
 *
 * @author darro
 */
public class CommissionWindow extends javax.swing.JFrame {

    /**
     * Creates new form CommissionWindow
     */
    public CommissionWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCommission = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tvRegisterationNumber = new javax.swing.JTextField();
        btnSearchVehicle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblCommission.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Sr No.", "Date", "Vehicle-no", "Transport", "pax", "Amount", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblCommission);
        if (tblCommission.getColumnModel().getColumnCount() > 0) {
            tblCommission.getColumnModel().getColumn(0).setMinWidth(25);
            tblCommission.getColumnModel().getColumn(0).setMaxWidth(50);
            tblCommission.getColumnModel().getColumn(4).setMinWidth(20);
            tblCommission.getColumnModel().getColumn(4).setMaxWidth(30);
            tblCommission.getColumnModel().getColumn(6).setMinWidth(40);
            tblCommission.getColumnModel().getColumn(6).setMaxWidth(60);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("COMMISSION PAYMENT");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Registration no :");

        btnSearchVehicle.setText("Search");
        btnSearchVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchVehicleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tvRegisterationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnSearchVehicle)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tvRegisterationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchVehicle))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchVehicleActionPerformed
        // TODO add your handling code here:
        String registrationNumber = tvRegisterationNumber.getText();
        if (Validation.isRegistrationNumber(tvRegisterationNumber)) {
            displayCommission(registrationNumber);
        } else {
            JOptionPane.showMessageDialog(null, "Last 4 digits of vehicle number");
        }
        
    }//GEN-LAST:event_btnSearchVehicleActionPerformed

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
            java.util.logging.Logger.getLogger(CommissionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommissionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommissionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommissionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommissionWindow().setVisible(true);
            }
        });
    }
    
    
    // Display commission in table format
    public void displayCommission(String vehicleNumber) {
        int regNumber = Integer.parseInt(vehicleNumber);

        // Create defaultTableModel object and use tableReport instance.
        DefaultTableModel tableModel = (DefaultTableModel) tblCommission.getModel();

        try {
            String apiUrl = "http://127.0.0.1:5000/get_unpaid_commission?Vehical_no=" + regNumber;

            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Get the response code
            int responseCode = connection.getResponseCode();
            System.out.println(responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        response.append(line);
                    }

                    // Parse the JSON response
                    JSONObject jsonDataObject = new JSONObject(response.toString());

                    // Now we can access the data from the JSON response
                    //String registrationNumber = jsonDataObject.getString("reg_no");
                    //String transportName = jsonDataObject.getString("transport_name");

                    // Access data within the order-details
                    JSONArray orderDetails = jsonDataObject.getJSONArray("order_details");

                    tableModel.setRowCount(0);

                    for (int i = 0; i < orderDetails.length(); i++) {
                        JSONObject orderItem = orderDetails.getJSONObject(i);

                        // Convert dateTimeStamp to dateStamp
                        String dateTimeStamp = orderItem.getString("created_at");
                        String dateStamp = DateTime.getDate(dateTimeStamp);
                        
                        int paymentStatusCode = orderItem.getInt("commission_payment_status");
                        String paymentStatus = "";
                        if (paymentStatusCode == 0) {
                            paymentStatus = "Not Paid";
                        } else {
                            paymentStatus = "Paid";
                        }
                        
                        // Add to the table
                        tableModel.addRow(new Object[] {i+1, dateStamp, orderItem.getString("vehical_no"),
                            orderItem.getString("transport_name"),
                            orderItem.getInt("pax"),
                            orderItem.getInt("commission"),
                            paymentStatus});

                        String serialNumber = orderItem.getString("serial_no");
                        String createdAt = orderItem.getString("created_at");

                        System.out.println(serialNumber + " " + createdAt + " " + paymentStatus);
                    }
                }
            }
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchVehicle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCommission;
    private javax.swing.JTextField tvRegisterationNumber;
    // End of variables declaration//GEN-END:variables
}
