package _1_Numbers;

public class _1_EvenOddNumber {

	public static void main(String[] args) {
		isNumOddOrEven(10);
	}
	
	public static void isNumOddOrEven(int num) {
		if (num<=0) {
			System.out.println("Invalid number");
		}else if (num%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
}
