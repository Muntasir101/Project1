package File;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        writeFile("src//main//java//File//demo.txt","New Text");
    }
    public static void writeFile(String filePath, String content) throws IOException {
        // Create a BufferedWriter to write to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Write the content to the file
            writer.write(content);
        } catch (IOException e) {
            // Handle any errors that may occur during writing
            throw e; // Rethrow the exception to be handled by the caller
        }
    }
}
