/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;

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
    private String copyOf;

    private String vehicleNo;
    
    public Print(String date, String serialNo, String paymentMode, int pax, int amount, String copyOf, String vehicleNo) {
        this.date = date;
        this.serialNumber = serialNo;
        this.pax = pax;
        this.amount = amount;
        this.modeOfPayment = paymentMode;
        this.copyOf = copyOf;
        this.vehicleNo = vehicleNo;
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
        // Get the papers width from the PageFormat
        double pageWidth = pageFormat.getImageableWidth();
        
        
        
        // Define the font and size for your text
        Font font = new Font("SanSerif", Font.PLAIN, 12);
        g2d.setFont(font);

        // Define the bold font and size for text
        Font fontType2 = new Font("SanSerif", Font.BOLD, 12);
        
        // Define the line spacing for different items
        int lineHeight = 12;
        
        // print business name
        // calculate the x coordinate to center align the texts
        int xCenteredBusinessName = (int) (pageWidth - g2d.getFontMetrics().stringWidth(Constants.BUSINESS_NAME))/2;
        g2d.drawString(Constants.BUSINESS_NAME, xCenteredBusinessName, 25);
        // print the address
        int xCenteredAddressLine1 = (int) (pageWidth - g2d.getFontMetrics().stringWidth(Constants.ADDRESS_LINE_1))/2;
        g2d.drawString(Constants.ADDRESS_LINE_1, xCenteredAddressLine1, 45);
        int xCenteredAddressLine2 = (int) (pageWidth - g2d.getFontMetrics().stringWidth(Constants.ADDRESS_LINE_2))/2;
        g2d.drawString(Constants.ADDRESS_LINE_2, xCenteredAddressLine2, 65);
        int xCenteredAddressLine3 = (int) (pageWidth - g2d.getFontMetrics().stringWidth(Constants.ADDRESS_LINE_3))/2;
        g2d.drawString(Constants.ADDRESS_LINE_3, xCenteredAddressLine3, 85);

        g2d.setFont(fontType2);
        int xCenteredGST = (int) (pageWidth - g2d.getFontMetrics().stringWidth("GST No. : " + Constants.GST_NUMBER)) / 2;
        g2d.drawString("GST No. : " + Constants.GST_NUMBER, xCenteredGST, 105);

        g2d.setFont(font);
        // After printing the address lines, add lines
        int x1CenteredLine = (int) (pageWidth /2) + 170;
        int x2CenteredLine = (int) (pageWidth /2) - 170;
        g2d.drawLine(x1CenteredLine, 120, x2CenteredLine, 120);  // Draws a line from (10, 58) to (200, 58)
        
        // Print the copyOf data
        int xCenteredCopyOf = (int) (pageWidth - g2d.getFontMetrics().stringWidth(this.copyOf))/2;
        g2d.drawString(this.copyOf, xCenteredCopyOf, 140);
        
        g2d.drawLine(x1CenteredLine, 145, x2CenteredLine, 145);  // Draws another line below copyOf

        // Continue with your other text and drawing
        
        // print date and time
        g2d.drawString("Date : " + this.date, 10, 170);
        
        // Print booking details
        g2d.drawString("Serial No: " + this.serialNumber, 10, 190);
        g2d.drawString("Payment Mode: " + modeOfPayment, 10, 210);
        g2d.drawString("Vehicle Reg: " + vehicleNo, 10, 230);

        // table format
        g2d.drawLine(x1CenteredLine, 250, x2CenteredLine, 250);  // Draws another line before headers
        g2d.drawLine(x1CenteredLine, 270, x2CenteredLine, 270);  // Draws another line below headers
        g2d.setFont(fontType2);
        g2d.drawString("Ride", 10, 265);
        g2d.setFont(font);
        g2d.drawString("Dolphin", 10, 295);

        g2d.setFont(fontType2);
        g2d.drawString("Pax", 80, 265);
        g2d.setFont(font);
        g2d.drawString(String.valueOf(pax), 80, 295);

        g2d.setFont(fontType2);
        g2d.drawString("Amount", 150, 265);
        g2d.setFont(font);
        g2d.drawString(String.valueOf(amount), 150, 295);
        
        g2d.drawLine(x1CenteredLine, 305, x2CenteredLine, 305);  // Draws another line below headers
        
        // Thank you visit again message
        String message = "Thank you, visit again.";
        int xCenteredThankYouMessage = (int) (pageWidth - g2d.getFontMetrics().stringWidth(message))/2;
        g2d.drawString(message, xCenteredThankYouMessage, 320);
        
        
        return PAGE_EXISTS;
    }
    
}
