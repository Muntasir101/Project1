package Excpetions;

import java.io.File;
import java.io.FileReader;

public class FileNotFoundExceptions {
    public static void main(String[] args)  {
        try {

            // Following file does not exist
            File file = new File("E://file.txt");

            FileReader fr = new FileReader(file);
        } catch (Exception e) {
            System.out.println ("Exception is: " +e);
        }
    }
}
