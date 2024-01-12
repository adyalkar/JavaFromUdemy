package _1_Numbers;

public class _5_SumOfDigitInNumber {
	public static void main(String[] args) {
		sumOfDigitInNumber(1234);
	}
	// 1234
	public static void sumOfDigitInNumber(int num) {
		int sum = 0;
		
		while(num!=0) {
			int digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		System.out.println(sum);
	}

}
