
package models;

/**
 *
 * "commission": 150.0,
            "commission_payment_status": 0,
            "created_at": "Sun, 22 Oct 2023 15:55:40 GMT",
            "pax": 1,
            "serial_no": "AWS3409",
            "transport_name": "JOLLY boy",
            "vehical_id": 5,
            "vehical_no": "GA09D8805"
 * @author darro
 */
public class Commission {
    private double commission;
    private int paymentStatus;
    private String timeStamp;
    private int pax;
    private String serialNumber;
    private String transportName;
    private int vehicleId;
    private String registratinNumber;

    public Commission(double commission, int paymentStatus, String timeStamp, int pax, String serialNumber, String transportName, int vehicleId, String registratinNumber) {
        this.commission = commission;
        this.paymentStatus = paymentStatus;
        this.timeStamp = timeStamp;
        this.pax = pax;
        this.serialNumber = serialNumber;
        this.transportName = transportName;
        this.vehicleId = vehicleId;
        this.registratinNumber = registratinNumber;
    }

    public Commission() {
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public int getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(int paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getPax() {
        return pax;
    }

    public void setPax(int pax) {
        this.pax = pax;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getRegistratinNumber() {
        return registratinNumber;
    }

    public void setRegistratinNumber(String registratinNumber) {
        this.registratinNumber = registratinNumber;
    }
    
    
}
