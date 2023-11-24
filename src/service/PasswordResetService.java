
package service;

import adventurewatersportsdesktop.DashboardWindow;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;
import service.interfaces.IPasswordReset;
import system.HttpStatusCode;

public class PasswordResetService implements IPasswordReset {
    
    
    

    @Override
    public boolean reset(int credentialId, String password) {
        String api = "http://18.119.160.201/update_account_password?Credential_id=" + credentialId + "&new_password=" + password;
        
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
