import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class login_class {
    // Method to validate user login credentials
    public static String login(String username, String password, String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Iterate through each line in the file
            while ((line = reader.readLine()) != null) {
                // Split the line into parts using a comma as the delimiter
                String[] parts = line.split(",");
                // Check if the line contains three parts (username, password, and additional info)
                if (parts.length == 3) {
                    // Extract stored username and password from the parts array
                    String storedUsername = parts[0].trim();
                    String storedPassword = parts[1].trim();
                    // Compare entered username and password with stored credentials
                    if (username.equals(storedUsername) && password.equals(storedPassword)) {
                        // Return the additional info (first number in this case)
                        return parts[2].trim();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the IOException appropriately (log, show error message, etc.)
        }

        return null; // Invalid login
    }
}
