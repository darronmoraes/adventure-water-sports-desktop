package models;

/**
 *
 * @author darro
 */
public class BookingTicket {
    
    // Variables declaration
    private String serialNumber;
    private String date;
    private int amount;
    private int pax;
    private String paymentMode;
    
    // Constructor
    public BookingTicket(String serialNumber, int amount, int pax) {
        this.serialNumber = serialNumber;
        this.amount = amount;
        this.pax = pax;
    }
    
    public BookingTicket(String date, String serialNumber, int amount, int pax, String paymentMode) {
        this.serialNumber = serialNumber;
        this.amount = amount;
        this.pax = pax;
        this.date = date;
        this.paymentMode = paymentMode;
    }
    
    // getters

    public String getSerialNumber() {
        return serialNumber;
    }

    public int getAmount() {
        return this.amount;
    }

    public int getPax() {
        return pax;
    }
    
    public String getDate() {
        return date;
    }
    
    public String getPaymentMode() {
        return this.paymentMode;
    }
}
