package validations;

import javax.swing.JTextField;

/**
 *
 * @author darro
 */
public class Validation {
    
    public static boolean isRegistrationNumber(JTextField input) {
        // \\d+ regular expression to accept only digits
        
        return input.getText().matches("\\d+") && input.getText().length() > 0 && input.getText().length() <= 4;
        /*if (input.getText().matches("\\d+") && input.getText().length() > 0 && input.getText().length() <= 4) {
            return true;
        }*/
    }
    
}
