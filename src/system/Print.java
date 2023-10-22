/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;

import adventurewatersportsdesktop.Constants;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

/**
 *
 * Printable implementation for printing the message
 * 
 * 
 * @author darro
 */
public class Print implements Printable {

    // Instance variable
    private String date;
    private String time;
    private String serialNumber;
    private int pax;
    private int amount;
    private String modeOfPayment;
    
    public Print(String date, String serialNo, String paymentMode, int pax, int amount) {
        this.date = date;
        this.serialNumber = serialNo;
        this.pax = pax;
        this.amount = amount;
        this.modeOfPayment = paymentMode;
    }
    
    public Print(String date, String serialNo, int pax, int amount) {
        this.date = date;
        this.serialNumber = serialNo;
        this.pax = pax;
        this.amount = amount;
    }
    
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex > 0) {
            return NO_SUCH_PAGE;
        }
        
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
        
        // Define the font and size for your text
        Font font = new Font("SanSerif", Font.PLAIN, 10);
        g2d.setFont(font);
        
        // Define the line spacing for different items
        int lineHeight = 12;
        
        // print business name
        g2d.drawString(Constants.BUSINESS_NAME, 10, 10);
        // print the address
        g2d.drawString(Constants.ADDRESS_LINE_1, 10, 22);
        g2d.drawString(Constants.ADDRESS_LINE_2, 10, 34);
        g2d.drawString(Constants.ADDRESS_LINE_3, 10, 46);
        g2d.drawString("PHONE : " + Constants.PHONE, 10, 58);
        
        // print date and time
        g2d.drawString("Date : " + date, 10, 76);
        
        // Print booking details
        g2d.drawString("Serial No: " + serialNumber, 10, 88);
        g2d.drawString("Payment Mode: " + modeOfPayment, 10, 100);
        // table format
        g2d.drawString("Ride", 10, 120);
        g2d.drawString("Dolphin", 10, 132);
        
        g2d.drawString("Pax", 90, 120);
        g2d.drawString(String.valueOf(pax), 90, 132);
        
        g2d.drawString("Amount", 120, 120);
        g2d.drawString(String.valueOf(amount), 120, 132);
        
        // Thank you visit again message
        String message = "Thank you, visit again.";
        g2d.drawString(message, 40, 154);
        
        
        return PAGE_EXISTS;

        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
