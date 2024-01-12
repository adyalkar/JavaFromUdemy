package _1_Numbers;

public class _3_CreditCardIssue {
	public static void main(String[] args) {
		creditCardIssue(765);
	}
	
	public static void creditCardIssue(int creditScore) {
		if(creditScore<=400 && creditScore<600) {
			System.out.println("Silver");
		}else if(creditScore<=600 && creditScore<800) {
			System.out.println("Gold");
		}else if(creditScore<=800 && creditScore<850) {
			System.out.println("Platinum");
		}else if(creditScore<400 || creditScore>850) {
			System.out.println("Invalid");
		}
	}

}
