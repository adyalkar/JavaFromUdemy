package _1_Numbers;

public class _7_CountDigitInNum {
	public static void main(String[] args) {
		countDigitInNumber(123456789);
	}
	
	
	public static void countDigitInNumber(int num) {
		
		int count = 0;
		while (num!=0) {
			int digit = num % 10;
			count ++;
			num = num /10;
		}
		System.out.println(count);
	}

}
