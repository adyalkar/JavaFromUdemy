package _1_Numbers;

public class _4_ExtractNumber {
	
	public static void main(String[] args) {
		extractNumberAndPrintInConsole(675);
	}
	
	//675
	public static void extractNumberAndPrintInConsole(int num) {
		
		while(num!=0) {
			int digit = num % 10;	// 5 7  6
			System.out.println(digit);	//5  7  6
			num = num / 10 ; 	//67 6 0
		}
		
	}

}
