package UtlityForInterview;

import java.util.Scanner;

public class CalculatorUtility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Simple Calculator");
        System.out.println("=================");
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Select an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        
        System.out.print("Enter operation choice (1/2/3/4): ");
        int choice = scanner.nextInt();
        
        double result = 0;
        
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}

