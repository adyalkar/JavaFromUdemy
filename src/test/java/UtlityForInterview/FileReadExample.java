package UtlityForInterview;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("C:\\Users\\adyalkar\\Desktop\\PRF_TestCases.txt");

            int character;
            while ((character = inputStream.read()) != -1) {
                System.out.print((char) character);
            }

            inputStream.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
