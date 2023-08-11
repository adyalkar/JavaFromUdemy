package UtlityForInterview;

import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Password Strength Checker");
        System.out.println("=========================");
        
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        
        int length = password.length();
        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasLowercase = !password.equals(password.toUpperCase());
        boolean hasDigits = password.matches(".*\\d.*");
        boolean hasSpecialChars = !password.matches("[A-Za-z0-9]*");
        
        int strength = 0;
        
        if (length >= 8) {
            strength++;
        }
        if (hasUppercase) {
            strength++;
        }
        if (hasLowercase) {
            strength++;
        }
        if (hasDigits) {
            strength++;
        }
        if (hasSpecialChars) {
            strength++;
        }
        
        String strengthLabel;
        
        switch (strength) {
            case 0:
                strengthLabel = "Very Weak";
                break;
            case 1:
                strengthLabel = "Weak";
                break;
            case 2:
                strengthLabel = "Moderate";
                break;
            case 3:
                strengthLabel = "Strong";
                break;
            case 4:
            case 5:
                strengthLabel = "Very Strong";
                break;
            default:
                strengthLabel = "Unknown";
                break;
        }
        
        System.out.println("Password Strength: " + strengthLabel);
        
        scanner.close();
    }
}

