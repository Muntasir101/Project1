package File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        readFile("src//main//java//File//demo.txt");
    }

    public static void readFile(String filePath) throws IOException {
        // Create a BufferedReader to read the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read each line of the file until the end is reached
            while ((line = reader.readLine()) != null) {
                // Process each line as needed
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Exception is: " + e);
        }
    }
}
