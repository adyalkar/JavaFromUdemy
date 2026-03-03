package _7_String;

public class _2_isPalindrome {
	
	public static void main(String[] args) {
		String str1 = "madamw";
		boolean x = isPalindrome2(str1);
		System.out.println(x);
	}
		
		
	
	public static boolean isPalindrome (String str1) {
		
		String rev = "";
		
		for (int i = str1.length()-1;i>=0;i--) {	
			rev +=str1.charAt(i);
		}
		
		return rev.equalsIgnoreCase(str1);
		

		
	}
	
public static boolean isPalindrome2 (String str1) {
		
		StringBuilder sb = new StringBuilder(str1);
		String reverse = sb.reverse().toString();
		
		if(str1.equalsIgnoreCase(reverse)) {
			return true;
			
		} else {
			return false;
		}
		
		

		
	}

}
