package _1_Numbers;

public class _E_IsArmstronNumber {
	
	public static void main(String[] args) {
		
		System.out.println(isArmstrong(153));


        int num = 1634;
        int temp = num;
        int digitCount = 0;
        int sum = 0;

// Count digits
        while (temp != 0) {
            digitCount++;
            temp = temp / 10;
        }

// Reset temp
        temp = num;

// Calculate sum of powers
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digitCount);
            temp = temp / 10;

        }

// Check Armstrong
        if (sum == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
		
	}
	
	public static boolean isArmstrong(int num) {
		
		int sum =0 ;
		
		while (num !=0) {
			
			int digit = num % 10;
			sum = sum + (digit * digit * digit);
			num = num /10;
			
		}
		
		System.out.println(sum);
		return num == sum;
	}




}
