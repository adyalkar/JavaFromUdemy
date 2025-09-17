package _2_Array_And_Matrices;

public class _3_sumOfPositiveNegativeNumber {
	
    public static void main(String[] args) {

       int [] arr = {10, 12 , 0 , 2 , 4 , -8 , -2};
       
       sumOfNum(arr);

    }
    
 // Method to find and print the sum of positive and negative numbers
    public static void sumOfNum (int [] numbs) {
    	
        // Variable to store sum of negative numbers
    	int nSum = 0;

        // Variable to store sum of positive numbers
    	int pSum = 0;
    	
        // Loop through all elements of the given array
    	for (int i = 0 ; i < numbs.length ; i++ ) {
    		
            // If the number is zero, skip the current iteration
    		if (numbs[i] == 0) continue;
    		
            // If the number is negative, add it to nSum
    		else if (numbs[i] < 0) {
    			nSum += numbs[i];
    		}
    		
            // If the number is positive, add it to pSum
    		else if (numbs[i] > 0) {
    			pSum += numbs[i];
    		}
    	}
    	
        // Print the total sum of positive numbers
    	System.out.println(" Positive Sum :" + pSum);

        // Print the total sum of negative numbers
    	System.out.println(" Negative Sum :" + nSum);

    }

}
