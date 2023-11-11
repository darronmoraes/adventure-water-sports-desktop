package models;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private String contactNo;
    private String address;
    private Credential credential;

    public User(int id, String firstName, String lastName, String gender, String contactNo, String address, Credential credential) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.contactNo = contactNo;
        this.address = address;
        this.credential = credential;
    }

    public User(String firstName, String lastName, String gender, String contactNo, String address, Credential credential) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.contactNo = contactNo;
        this.address = address;
        this.credential = credential;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    public String capitalize(String string) {
        return string.substring(0,1).toUpperCase() + string.substring(1);
    }
}
