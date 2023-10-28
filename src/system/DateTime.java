/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * Date currentDate = new Date();
 * Create a date format to format the date as a String.
 * SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
 * String currentDateStringFormat = dateFormat.format(currentDate);
 * 
 * // Print the cuurent date
 * System.out.println("Current Date: " + currentDateStringFormat);
 * 
 * 
 * @author darro
 */
public class DateTime {
    
    // Static method to get current date
    public static String getDate() {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(currentDate);
    }
    
    public static String getTime() {
        Date currentTime = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss");
        return timeFormat.format(currentTime);
    }
    
    public static String getDate(String input) {
        // Input date format
        SimpleDateFormat inputFormat = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss");
        
        try {
            // Parse the input
            Date date = inputFormat.parse(input);
            
            // Define the output date format
            SimpleDateFormat outputFormat = new SimpleDateFormat(Constants.DATE_DD_MM_YYYY);
            
            return outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static String formatDate(String input) {
        // Input date format
        SimpleDateFormat inputFormat = new SimpleDateFormat(Constants.DATE_DD_MM_YYYY);
        
        try {
            // Parse the input
            Date date = inputFormat.parse(input);
            
            // Define the output date format
            SimpleDateFormat outputFormat = new SimpleDateFormat(Constants.DATE_YYYY_MM_DD);
            
            return outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
