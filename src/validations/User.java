package validations;

public class User {
    
    private int credentialId;
    private String email;
    private String oldPassword;
    
    public User(int id, String email, String oldPassword) {
        this.credentialId = id;
        this.email = email;
        this.oldPassword = oldPassword;
    }
    
    public User(User user) {
        this.credentialId = user.credentialId;
        this.email = user.email;
        this.oldPassword = user.oldPassword;
    }

    public int getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(int credentialId) {
        this.credentialId = credentialId;
    }
    
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public boolean isOldPasswordAuthentic(String password) {
        return password.equals(this.getOldPassword());
    }
    
}
