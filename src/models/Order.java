package models;

public class Order {
    private int id;
    private String date;
    private String serialNumber;
    private double amount;
    private int pax;
    private String paymentMode;

    public Order(int id, String date, String serialNumber, double amount, int pax, String paymentMode) {
        this.id = id;
        this.date = date;
        this.serialNumber = serialNumber;
        this.amount = amount;
        this.pax = pax;
        this.paymentMode = paymentMode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getPax() {
        return pax;
    }

    public void setPax(int pax) {
        this.pax = pax;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
    
    
}
