package UtlityForInterview;

import java.io.*;
import java.util.Scanner;

public class FileManipulationUtility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
//        System.out.println("File Manipulation Utility");
//        System.out.println("=========================");
        
//        System.out.print("Enter source file path: ");
        String sourceFilePath = "C:\\Users\\adyalkar\\Desktop\\sorceFile.txt";
        
//        System.out.print("Enter destination file path: ");
        String destFilePath = "C:\\Users\\adyalkar\\Desktop\\destinationFile.txt";
        
        try {
            copyFile(sourceFilePath, destFilePath);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        
        scanner.close();
    }
    
    private static void copyFile(String sourcePath, String destPath) throws IOException {
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
        
        try (InputStream inputStream = new FileInputStream(sourceFile);
             OutputStream outputStream = new FileOutputStream(destFile)) {
            
            byte[] buffer = new byte[1024];
            int bytesRead;
            
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        }
    }
}
