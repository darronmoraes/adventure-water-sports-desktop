/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;

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
    
}
