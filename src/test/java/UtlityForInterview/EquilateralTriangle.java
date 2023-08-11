package UtlityForInterview;

public class EquilateralTriangle {
    public static void main(String[] args) {
        int rows = 3; // Number of rows in the triangle

        for (int i = 1; i <= rows; i++) {
            // Print spaces before stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" "); // Print a space
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*"); // Print a star
            }

            // Move to the next line
            System.out.println(); // Print a newline character
        }
    }
}
