package _1_Numbers;

public class _A_PalindromeNumber {
	
	public static void main(String[] args) {
		isPalindromeNumber(88876);
	}
	
	public static void isPalindromeNumber(int num) {
		
		int reverseNum = 0;
		int temp = num;
		
		while (num != 0) {
			int digit = num % 10;
			reverseNum = reverseNum * 10 + digit;
			num = num /10 ;			
		}
		
		System.out.println(reverseNum);
		System.out.println(num);
		
		if (temp == reverseNum) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}

}
