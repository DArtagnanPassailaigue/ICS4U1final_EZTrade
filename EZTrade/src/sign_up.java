import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class sign_up {
    public static boolean isPasswordEffective(String password) {
        // Check for at least 8 characters
        if (password.length() < 8) {
            return false;
        }
        
        if (password.contains(" ")){
            return false;
        }

        // Check for at least 1 capital letter
        boolean hasUpperCase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
                break;
            }
        }
        if (!hasUpperCase) {
            return false;
        }

        // Check for at least 1 special character
        String specialCharacters = ".!?!_-\\|$@&*";
        boolean hasSpecialCharacter = false;
        for (char c : password.toCharArray()) {
            if (specialCharacters.contains(String.valueOf(c))) {
                hasSpecialCharacter = true;
                break;
            }
        }
        return hasSpecialCharacter;
    }
    
    public static boolean isValidCardNumber(String creditCardNumber) {
        // Remove any spaces or non-digit characters
        String cleanedNumber = creditCardNumber.replaceAll("[^0-9]", "");

        // Reverse the credit card number
        StringBuilder reversedNumber = new StringBuilder(cleanedNumber).reverse();

        int sum = 0;
        boolean doubleDigit = false;

        for (int i = 0; i < reversedNumber.length(); i++) {
            int digit = Character.getNumericValue(reversedNumber.charAt(i));

            // Double every second digit
            if (doubleDigit) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }

            // Accumulate the sum
            sum += digit;

            // Toggle the doubleDigit flag for the next iteration
            doubleDigit = !doubleDigit;
        }

        // The credit card number is valid if the sum is a multiple of 10
        return sum % 10 == 0;
    }
    
    public static boolean isValidExpiryDate(String expiryDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/yy");
        dateFormat.setLenient(false);

        try {
            // Parse the date, and if successful, consider it a valid date
            Date parsedDate = dateFormat.parse(expiryDate);
            
            // Check if the expiry date is before the year 2024
            Calendar cal = Calendar.getInstance();
            cal.setTime(parsedDate);
            int expiryYear = cal.get(Calendar.YEAR);

            if (expiryYear < 2024) {
                return false; // Deny expiry dates before the year 2024
            }
            
            return true;
        } catch (ParseException e) {
            // If parsing fails, it's not a valid date
            return false;
        }
    }
}
