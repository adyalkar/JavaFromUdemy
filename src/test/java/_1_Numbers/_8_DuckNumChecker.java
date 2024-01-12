package _1_Numbers;

import java.util.ArrayList;

//001627 ---> Not a duck number
//383808 ---> Duck Number

public class _8_DuckNumChecker {
	
	public static void main(String[] args) {
		duckNumChecker(9827);
	}
	
	public static void duckNumChecker(int num) {
		boolean isDuckNumber = false;
		
		while(num!=0) {
			
			int digit = num % 10;
			if(digit == 0) {
				isDuckNumber = true;
				break;
			}
			num = num/10;
		}
		
		if(isDuckNumber) {
			System.out.println("Duck Number");
		}else {
			System.out.println("Not a Duck Number");
		}
		
		
	}

}
