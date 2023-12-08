
package service;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import service.interfaces.IPasswordReset;
import system.Constants;

public class PasswordResetService implements IPasswordReset {
    
    @Override
    public boolean reset(int credentialId, String password) {
        String idPathParam = "?Credential_id=";
        String passwordPathParam = "&new_password=";
        String api = Constants.URL + Constants.RESET_PASSWORD_ENDPOINT + idPathParam + credentialId + passwordPathParam + password;
        
        try {
            URL url = new URL(api);
            HttpURLConnection connect = (HttpURLConnection) url.openConnection();
            connect.setRequestMethod("PUT");
            //connect.setRequestProperty("Content-Type", "application/json");
            connect.setDoOutput(true);
            
            int responseCode = connect.getResponseCode();
            
            if (responseCode == 200) {
                Logger.getLogger(PasswordResetService.class.getName()).log(Level.SEVERE, null, "Success");
                System.out.println("Success");
                return true;
            } else {
                return false;
            }
            
        } catch (IOException | JSONException ex) {
            Logger.getLogger(PasswordResetService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
}
