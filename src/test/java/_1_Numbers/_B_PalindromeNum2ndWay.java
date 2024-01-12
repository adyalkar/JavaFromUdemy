package _1_Numbers;

public class _B_PalindromeNum2ndWay {
	
	public static void main(String[] args) {
		isPalindromeNum(54367);
	}
	
	public static void isPalindromeNum(int num) {
		
		String numString = Integer.toString(num);
		StringBuffer sb = new StringBuffer(numString);
		String reverseNum = sb.reverse().toString();
		System.out.println(reverseNum);
		System.out.println(reverseNum.equals(numString) ? "Palindrome" : "Not Palindrome");
		
	}

}
