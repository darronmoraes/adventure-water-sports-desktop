/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adventurewatersportsdesktop;

import models.Credential;
import models.User;
import org.json.JSONObject;
import system.Constants;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author darro
 */
public class UserRegistrationWindow extends javax.swing.JFrame {

    private User userEmployee;
    private Credential credential;

    /**
     * Creates new form UserRegistrationWindow
     */
    public UserRegistrationWindow() {
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

        btnGroupGender = new javax.swing.ButtonGroup();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        etFirstName = new javax.swing.JTextField();
        etLastName = new javax.swing.JTextField();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        etAddress = new javax.swing.JTextField();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        etContact = new javax.swing.JTextField();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        etEmail = new javax.swing.JTextField();
        radioMale = new javax.swing.JRadioButton();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        radioFemale = new javax.swing.JRadioButton();
        radioEmpty = new javax.swing.JRadioButton();
        btnRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Name");

        etFirstName.setBorder(javax.swing.BorderFactory.createTitledBorder("First Name"));

        etLastName.setBorder(javax.swing.BorderFactory.createTitledBorder("Last Name"));

        jLabel2.setText("Address");

        etAddress.setBorder(null);

        jLabel3.setText("Contact No.");

        etContact.setBorder(null);


        jLabel4.setText("Email-Id");

        etEmail.setBorder(null);
        etEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etEmailActionPerformed(evt);
            }
        });

        btnGroupGender.add(radioMale);
        radioMale.setText("Male");

        jLabel5.setText("Gender");

        btnGroupGender.add(radioFemale);
        radioFemale.setText("Female");

        btnGroupGender.add(radioEmpty);
        radioEmpty.setText("Don't Mention");


        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioMale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(radioFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(radioEmpty))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnRegister)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etContact, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(etEmail))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etContact, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioMale)
                    .addComponent(radioFemale)
                    .addComponent(radioEmpty))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegister)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        getInputFieldData();
        registerEmployee(userEmployee);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void etEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etEmailActionPerformed


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
            java.util.logging.Logger.getLogger(UserRegistrationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRegistrationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRegistrationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRegistrationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRegistrationWindow().setVisible(true);
            }
        });
    }

    /*
    * Function to make a call to api
    * Register user
    *
    * */
    private void registerEmployee(User user) {

        try {
            // Create JSON object with user data
            final JSONObject request = getJsonObject(user);

            String apiPath = Constants.URL + Constants.REGISTER_ENDPOINT;
            // Open connection
            URL url = new URL(apiPath);
            HttpURLConnection connect = (HttpURLConnection) url.openConnection();
            connect.setRequestMethod("POST");
            connect.setRequestProperty("Content-Type", "application/json");
            connect.setDoOutput(true);

            // Write the JSON payload to request body
            try (OutputStream os = connect.getOutputStream()) {
                byte[] input = request.toString().getBytes(StandardCharsets.UTF_8);
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

            int responseCode = connect.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Show the serial number, amount and pax in dialog
                String message = "Employee : " + user.getFirstName() + " " +user.getLastName()
                        + "\nEmail : " + user.getCredential().getEmail()
                        + "\nPassword : " + user.getCredential().getPassword()
                        + "\n\n Please Note: Pen down the password generated.";

                JOptionPane.showMessageDialog(null, message);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static JSONObject getJsonObject(User user) {
        JSONObject request = new JSONObject();
        request.put("email", user.getCredential().getEmail());
        request.put("password", user.getCredential().getPassword());
        request.put("firstname", user.getFirstName());
        request.put("lastname", user.getLastName());
        request.put("address", user.getAddress());
        request.put("contact", user.getContactNo());
        request.put("gender", user.getGender());
        request.put("role", "emp");
        return request;
    }

    private void getInputFieldData() {
        String email = etEmail.getText();
        credential = new Credential(email);

        String firstName = upperCaseFirstCharacter(etFirstName);
        String lastName = upperCaseFirstCharacter(etLastName);
        String address = upperCaseFirstCharacter(etAddress);
        String contactNo = etContact.getText();
        String gender = "";

        if (radioMale.isSelected()) {
            gender = "male";
        } else if (radioFemale.isSelected()) {
            gender = "female";
        } else {
            gender = "na";
        }

        userEmployee = new User(firstName, lastName, address, contactNo, gender, credential);
    }


    // method to make first character of String to upper case and rest lower
    private String upperCaseFirstCharacter(JTextField jTextField) {
        String string = jTextField.getText();
        if (!string.isEmpty())
            return string.substring(0,1).toUpperCase() + string.substring(1).toLowerCase();
        return string;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.JButton btnRegister;
    private javax.swing.JTextField etAddress;
    private javax.swing.JTextField etContact;
    private javax.swing.JTextField etEmail;
    private javax.swing.JTextField etFirstName;
    private javax.swing.JTextField etLastName;
    private javax.swing.JRadioButton radioEmpty;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    // End of variables declaration//GEN-END:variables
}
