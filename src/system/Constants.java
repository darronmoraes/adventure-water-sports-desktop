/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;

/**
 *
 * @author darro
 */
public class Constants {
    
    // API URL
    //public static final String URL = "http://127.0.0.1:5000/";
    public static final String URL = "http://18.119.160.201/";

    // AUTH API END-POINT
    public static final String LOGIN_ENDPOINT = "login";
    public static final String REGISTER_ENDPOINT = "register-user";
    // RESET PASSWORD END-POINT
    public static final String RESET_PASSWORD_ENDPOINT = "update_account_password";
    
    
    // BOOKING API END-POINT
    public static final String NON_COMMERCIAL_BOOKING_ENDPOINT = "private_booking";
    public static final String COMMERCIAL_BOOKING_ENDPOINT = "booking";
    public static final String ORDER_DETAILS = "get_order_details";

    // DELETE ORDER API END-POINT
    public static final String DELETE_ORDER_TICKET = "delete_order/";


    //  Commission API END-POINT
    public static final String UPDATE_COMMISSION_STATUS = "update_commisssion_payment_status";
    public static final String UNPAID_COMMISSION = "get_unpaid_commission";

    
    // REPORT API END-POINT
    public static final String CURRENT_DATE_REPORT = "get_single_day_report";
    public static final String CURRENT_DATE_ORDER_REPORT = "get_single_day_order_details";
    public static final String ROUTE_CURRENT_DATE_REPORT = "day-report";
    
    // Date range report
    public static final String RANGE_DATE_REPORT = "get_order_details_dates";
    
    
    // Integer Constants
    public static final Integer DOLPHIN_RIDE_PRICE = 350;
    
    // Business profile
    public static final String BUSINESS_NAME = "DOLPHIN TRIP";
    public static final String ADDRESS_LINE_1 = "Sinquerim-Candolim";
    public static final String ADDRESS_LINE_2 = "Boat Owner's Association";
    public static final String ADDRESS_LINE_3 = "(Sinquerim Jetty)";
    public static final String ADDRESS_PIN = "403 706";
    public static final String PHONE = "832 2995468";
    
    
    // Date and Time
    public static final String DATE_YYYY_MM_DD = "yyyy-MM-dd";
    public static final String DATE_DD_MM_YYYY = "dd-MM-yyyy";
    public static final String DATE_DD_MM_YY = "dd-MM-yy";


    // Password Length
    public static final int DEFAULT_PASSWORD_LENGTH = 8;
    
}
