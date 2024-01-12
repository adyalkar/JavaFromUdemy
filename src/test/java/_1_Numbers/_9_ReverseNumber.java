package _1_Numbers;

public class _9_ReverseNumber {
	
	public static void main(String[] args) {
		reverseNumber(637378);
	}
	
	public static void reverseNumber(int num) {
		
		int reverseNum = 0;
		
		while(num != 0) {
			
			int digit = num % 10;
			reverseNum = reverseNum * 10 + digit ;
			num = num / 10 ;
		}
		
		System.out.println(reverseNum);
	}

}
