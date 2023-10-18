package models;

/**
 *
 * @author darro
 */
public class Report {
    
    // Variables declaration
    private double commission;
    private String order_date;
    private String pax;
    private double total_amount;
    
    // Constructor
    public Report(double commission, String orderDate, String pax, double totalAmount) {
        this.commission = commission;
        this.order_date = orderDate;
        this.pax = pax;
        this.total_amount = totalAmount;
    }
    
    // getters and setters
    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getPax() {
        return pax;
    }

    public void setPax(String pax) {
        this.pax = pax;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }
    
}
