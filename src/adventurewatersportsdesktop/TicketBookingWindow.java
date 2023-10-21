/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adventurewatersportsdesktop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.BookingTicket;
import org.json.JSONObject;

/**
 *
 * @author darron
 */
public class TicketBookingWindow extends javax.swing.JFrame {

    /**
     * Creates new form TicketBookingWindow
     */
    public TicketBookingWindow() {
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

        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        jBtnIncrementPax = new javax.swing.JButton();
        jBtnDecrementPax = new javax.swing.JButton();
        jTextPaxCount = new javax.swing.JLabel();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        jTextFieldAmount = new javax.swing.JLabel();
        jToggleBtnCommercialVehicle = new javax.swing.JToggleButton();
        jPanelCommercialData = new javax.swing.JPanel();
        javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel12 = new javax.swing.JLabel();
        jTextFieldRegistrationNumber = new javax.swing.JTextField();
        jTextFieldTransportProprieter = new javax.swing.JTextField();
        jTextFieldContactNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        javax.swing.JButton jBtnTicket = new javax.swing.JButton();
        javax.swing.JButton jBtnClearTicket = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Pax Count");

        jBtnIncrementPax.setText("+");
        jBtnIncrementPax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncrementPaxActionPerformed(evt);
            }
        });

        jBtnDecrementPax.setText("-");
        jBtnDecrementPax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDecrementPaxActionPerformed(evt);
            }
        });

        jTextPaxCount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextPaxCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTextPaxCount.setText("0");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Amount");

        jTextFieldAmount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextFieldAmount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTextFieldAmount.setText("Amount");

        jToggleBtnCommercialVehicle.setText("Commercial Vehicle");
        jToggleBtnCommercialVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleBtnCommercialVehicleActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Registration no");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Transport Prop.");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Contact No.");

        jTextFieldRegistrationNumber.setText("GA-08-T-1214");
        jTextFieldRegistrationNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRegistrationNumberActionPerformed(evt);
            }
        });

        jTextFieldTransportProprieter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTransportProprieterActionPerformed(evt);
            }
        });

        jTextFieldContactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContactNumberActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Commercial Vehicle");

        javax.swing.GroupLayout jPanelCommercialDataLayout = new javax.swing.GroupLayout(jPanelCommercialData);
        jPanelCommercialData.setLayout(jPanelCommercialDataLayout);
        jPanelCommercialDataLayout.setHorizontalGroup(
            jPanelCommercialDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCommercialDataLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelCommercialDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCommercialDataLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCommercialDataLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldTransportProprieter, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCommercialDataLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldRegistrationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelCommercialDataLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelCommercialDataLayout.setVerticalGroup(
            jPanelCommercialDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCommercialDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanelCommercialDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldRegistrationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCommercialDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldTransportProprieter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCommercialDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBtnTicket.setText("Generate Ticket");
        jBtnTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTicketActionPerformed(evt);
            }
        });

        jBtnClearTicket.setText("Clear");
        jBtnClearTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClearTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jBtnDecrementPax, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextPaxCount, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jBtnIncrementPax, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jToggleBtnCommercialVehicle)
                            .addGap(44, 44, 44))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanelCommercialData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnTicket)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnClearTicket)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jBtnIncrementPax)
                    .addComponent(jBtnDecrementPax)
                    .addComponent(jTextPaxCount, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldAmount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleBtnCommercialVehicle)
                .addGap(18, 18, 18)
                .addComponent(jPanelCommercialData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnTicket)
                    .addComponent(jBtnClearTicket))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Instance variables for counter and amount
     * 
     * @param evt 
     */
    
    private int counter = 0;
    private int estimatedAmount = 0;
    
    /**
     * Custom methods
     * 
     * @param evt 
     */
    
    // Method to calculate the total amount generated 
    private int amountPerPaxRide(int pax) {
        return Constants.DOLPHIN_RIDE_PRICE * pax;
    }
    
    // Check if Commercial vehicle details entered
    private boolean areVehicleDetailsEntered() {
        String registrationNumber = jTextFieldRegistrationNumber.getText();
        String proprieterName = jTextFieldTransportProprieter.getText();
        String contactNumber = jTextFieldContactNumber.getText();

        return !registrationNumber.isEmpty() && !proprieterName.isEmpty() && !contactNumber.isEmpty();
    }
    
    // Method to clear the fields
    private void clearBookingTextFields() {
        // Clear the text Fields
        jTextPaxCount.setText("0");
        jTextFieldAmount.setText("0 Rs.");

        jTextFieldRegistrationNumber.setText("");
        jTextFieldTransportProprieter.setText("");
        jTextFieldContactNumber.setText("");
        
        // set the variables counter and estimatedAmount to 0
        counter = 0;
        estimatedAmount = 0;
    }
    
    // Method to exit from booking window to dashboard
    private void closeWindow() {
        this.setVisible(false);
    }
    
    private void jBtnIncrementPaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncrementPaxActionPerformed
        // TODO add your handling code here:
        counter++;

        jTextPaxCount.setText(String.valueOf(counter));

        estimatedAmount = amountPerPaxRide(counter);
        jTextFieldAmount.setText(String.valueOf(estimatedAmount));
    }//GEN-LAST:event_jBtnIncrementPaxActionPerformed

    private void jBtnDecrementPaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDecrementPaxActionPerformed
        // TODO add your handling code here:
        if (counter > 0) {
            counter--;
        }

        jTextPaxCount.setText(String.valueOf(counter));

        if (counter != 0) {
            estimatedAmount = amountPerPaxRide(counter);
            jTextFieldAmount.setText(String.valueOf(estimatedAmount));
        } else {
            JOptionPane.showMessageDialog(null, "Requires pax above 1 to calculate estimated cost");
            jTextFieldAmount.setText("0");
        }
    }//GEN-LAST:event_jBtnDecrementPaxActionPerformed

    private void jToggleBtnCommercialVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleBtnCommercialVehicleActionPerformed
        // TODO add your handling code here:
        if (jToggleBtnCommercialVehicle.isSelected()) {
            jPanelCommercialData.setVisible(true);
        } else {
            jPanelCommercialData.setVisible(false);
        }
    }//GEN-LAST:event_jToggleBtnCommercialVehicleActionPerformed

    private void jTextFieldRegistrationNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRegistrationNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRegistrationNumberActionPerformed

    private void jTextFieldTransportProprieterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTransportProprieterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTransportProprieterActionPerformed

    private void jTextFieldContactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContactNumberActionPerformed

    private void jBtnTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTicketActionPerformed
        // TODO add your handling code here:

        // Get the TextField data for commercial bookings
        String registrationNumber = jTextFieldRegistrationNumber.getText();
        String proprieterName = jTextFieldTransportProprieter.getText();
        String contactNumber = jTextFieldContactNumber.getText();

        if (counter == 0 && estimatedAmount == 0) {
            JOptionPane.showMessageDialog(null, "Atleast 1 person is required to proceed with ticketing");
        } else if (counter != 0 && estimatedAmount != 0) {
            if (areVehicleDetailsEntered()) {
                commercialApiCall(registrationNumber, proprieterName, contactNumber);
                clearBookingTextFields();   // clear the text fields.
                closeWindow();
            } else {
                nonCommercialApiCall();
                clearBookingTextFields();   // clear the text fields.
                closeWindow();
            }
        }
    }//GEN-LAST:event_jBtnTicketActionPerformed

    private void jBtnClearTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClearTicketActionPerformed
        // TODO add your handling code here:
        // Call the clearBookingTextFields() function.
        clearBookingTextFields();
    }//GEN-LAST:event_jBtnClearTicketActionPerformed

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
            java.util.logging.Logger.getLogger(TicketBookingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketBookingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketBookingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketBookingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketBookingWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnDecrementPax;
    private javax.swing.JButton jBtnIncrementPax;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelCommercialData;
    private javax.swing.JLabel jTextFieldAmount;
    private javax.swing.JTextField jTextFieldContactNumber;
    private javax.swing.JTextField jTextFieldRegistrationNumber;
    private javax.swing.JTextField jTextFieldTransportProprieter;
    private javax.swing.JLabel jTextPaxCount;
    private javax.swing.JToggleButton jToggleBtnCommercialVehicle;
    // End of variables declaration//GEN-END:variables

    // Api Calls
    // Non Commercial vehicle api call
    private void nonCommercialApiCall() {

        String nonCommercialApiURL = Constants.URL + Constants.NON_COMMERCIAL_BOOKING_ENDPOINT;

        try {
            // Create the JSON object with pax and amount
            JSONObject jsonRequest = new JSONObject();
            jsonRequest.put("pax", counter);
            jsonRequest.put("amount", estimatedAmount);

            // Open the connection and set up the request
            URL url = new URL(nonCommercialApiURL);
            HttpURLConnection connect = (HttpURLConnection) url.openConnection();
            connect.setRequestMethod("POST");
            connect.setRequestProperty("Content-Type", "application/json");
            connect.setDoOutput(true);

            // Write the JSON payload to request body
            try (OutputStream os = connect.getOutputStream()) {
                byte[] input = jsonRequest.toString().getBytes("utf-8");
                os.write(input, 0, input.length);
            } catch (IOException ex) {
                Logger.getLogger(DashboardWindow.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Get the response from the server
            BufferedReader br = new BufferedReader(new InputStreamReader(connect.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                response.append(line);
            }

            // Parse the JSON response
            JSONObject jsonResponse = new JSONObject(response.toString());

            // Check if the status is 200 (success)
            if (jsonResponse.getInt("status") == 200) {
                JSONObject result = jsonResponse.getJSONObject("result");
                JSONObject order = result.getJSONObject("order");

                BookingTicket bookingData = new BookingTicket(
                        order.getString("serial_number"),
                        order.getInt("amount"),
                        order.getInt("pax")
                );

                // Show the serial number, amount and pax in dialog
                String message = "Serial Number: " + bookingData.getSerialNumber()
                        + "\nAmount: " + bookingData.getAmount()
                        + "\nPax: " + bookingData.getPax();

                JOptionPane.showMessageDialog(null, message);
            }

            br.close();

            // Print in the terminal the response
            System.out.println("Response " + response.toString());

            connect.disconnect();

        } catch (MalformedURLException ex) {
            Logger.getLogger(DashboardWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ProtocolException ex) {
            Logger.getLogger(DashboardWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DashboardWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Commercial API call
    private void commercialApiCall(String registrationNumber, String transportProp, String contactNumber) {
        String nonCommercialApiURL = Constants.URL + Constants.COMMERCIAL_BOOKING_ENDPOINT;

        try {
            // Create the JSON object with pax and amount
            JSONObject jsonRequest = new JSONObject();
            jsonRequest.put("pax", counter);
            jsonRequest.put("amount", estimatedAmount);
            jsonRequest.put("reg_no", registrationNumber);
            jsonRequest.put("name", transportProp);
            jsonRequest.put("contact", contactNumber);

            // Open the connection and set up the request
            URL url = new URL(nonCommercialApiURL);
            HttpURLConnection connect = (HttpURLConnection) url.openConnection();
            connect.setRequestMethod("POST");
            connect.setRequestProperty("Content-Type", "application/json");
            connect.setDoOutput(true);

            // Write the JSON payload to request body
            try (OutputStream os = connect.getOutputStream()) {
                byte[] input = jsonRequest.toString().getBytes("utf-8");
                os.write(input, 0, input.length);
            } catch (IOException ex) {
                Logger.getLogger(DashboardWindow.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Get the response from the server
            BufferedReader br = new BufferedReader(new InputStreamReader(connect.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                response.append(line);
            }
            br.close();

            // Parse the JSON response
            JSONObject jsonResponse = new JSONObject(response.toString());

            // Check if the status is 200 (success)
            if (jsonResponse.getInt("status") == 200) {
                JSONObject result = jsonResponse.getJSONObject("result");
                JSONObject order = result.getJSONObject("order");

                BookingTicket bookingData = new BookingTicket(
                        order.getString("serial_number"),
                        order.getInt("amount"),
                        order.getInt("pax")
                );

                // Show the serial number, amount and pax in dialog
                String message = "Serial Number: " + bookingData.getSerialNumber()
                        + "\nAmount: " + bookingData.getAmount()
                        + "\nPax: " + bookingData.getPax();

                JOptionPane.showMessageDialog(null, message);
            }

            // Print in the terminal the response
            System.out.println("Response " + response.toString());

            connect.disconnect();

        } catch (MalformedURLException ex) {
            Logger.getLogger(DashboardWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ProtocolException ex) {
            Logger.getLogger(DashboardWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DashboardWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
