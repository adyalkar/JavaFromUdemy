package _1_Numbers;

public class _E_IsArmstronNumber {
	
	public static void main(String[] args) {
		
		System.out.println(isArmstrong(153)); 
		
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
