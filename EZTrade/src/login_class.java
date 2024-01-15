import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 22isr
 */
public class login_class {
    public static boolean login(String username, String password, String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String storedUsername = parts[0].trim();
                    String storedPassword = parts[1].trim();

                    if (username.equals(storedUsername) && password.equals(storedPassword)) {
                        return true; // Successful login
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the IOException appropriately (log, show error message, etc.)
        }

        return false; // Invalid login
    }
}
