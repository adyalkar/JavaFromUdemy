package _1_Numbers;

public class _2_LeapYear {
	public static void main(String[] args) {
		isYearLeapOrNot(2000);
	}
	// Leap : year should be divisible by 4 but not divisible by 100 , Also year divisible by 400
	public static void isYearLeapOrNot(int year) {
		if((year % 4==0 & year % 100 != 0) || year % 400==0) {
			System.out.println("leap");
		}else {
			System.out.println("Not leap");
		}
	}

}
