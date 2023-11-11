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
    private String vehicleNumber;
    
    // Constructor
    public BookingTicket(String serialNumber, int amount, int pax) {
        this.serialNumber = serialNumber;
        this.amount = amount;
        this.pax = pax;
    }
    
    public BookingTicket(String date, String serialNumber, int amount, int pax, String paymentMode, String vehicleNumber) {
        this.serialNumber = serialNumber;
        this.amount = amount;
        this.pax = pax;
        this.date = date;
        this.paymentMode = paymentMode;
        this.vehicleNumber = vehicleNumber;
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

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}
