package _1_Numbers;

public class _6_SumOfPrimeDigit {
	public static void main(String[] args) {
		sumOfPrimeDigit(1234567);
	}
	// 1234567
	public static void sumOfPrimeDigit(int num) {
		int sum = 0;
		
		while (num!=0) {
			int digit = num % 10;
			if (digit==2 || digit==3 || digit==5 || digit==7 ) {
				sum = sum + digit;
			}
			num = num /10;
		}
		System.out.println(sum);
	}

}
