package UtlityForInterview;

import java.util.Scanner;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Prime Number Finder");
        System.out.println("===================");
        
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();
        
        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();
        
        System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + ":");
        
        for (int num = lowerBound; num <= upperBound; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        
        scanner.close();
    }
    
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}

//10  --> 2 3 3.14 --> NP
//11  --> 2 3 3.31 --> P
//12  --> 2 3 3.46 --> NP
