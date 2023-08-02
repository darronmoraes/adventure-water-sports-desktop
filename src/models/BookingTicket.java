package models;

/**
 *
 * @author darro
 */
public class BookingTicket {
    
    // Variables declaration
    private String serialNumber;
    private int amount;
    private int pax;
    
    // Constructor
    public BookingTicket(String serialNumber, int amount, int pax) {
        this.serialNumber = serialNumber;
        this.amount = amount;
        this.pax = pax;
    }
    
    // getters

    public String getSerialNumber() {
        return serialNumber;
    }

    public int getAmount() {
        return amount;
    }

    public int getPax() {
        return pax;
    }
    
}
