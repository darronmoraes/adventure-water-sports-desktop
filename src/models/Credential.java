package models;

import system.Constants;

public class Credential {

    private int id;
    private String email;
    private String password;

    public Credential(int id, String email) {
        this.id = id;
        this.email = email;
    }

    public Credential(String email) {
        this.email = email;
        this.password = setInitialPassword();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String setInitialPassword() {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz01234566789!@#$%&*";
        char[] password = new char[Constants.DEFAULT_PASSWORD_LENGTH];

        for (int i = 0; i < Constants.DEFAULT_PASSWORD_LENGTH; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }

        return new String(password);
    }


}
