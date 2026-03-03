package _7_String;

public class _8_countDigitLetterSpecialChar {
	
	public static void main(String[] args) {
		String str = " Anup Chandrabhan Adyalkar 9665669508 $%^&*";
		count(str);
		
	}
	
	public static void count (String str) {
		
		int digit = 0;
		int letter = 0;
		int special =0 ;
		
		for (char c : str.toCharArray()) {
			if (Character.isDigit(c)) digit ++ ;
			else if (Character.isLetter(c)) letter ++;
			else special ++;
		}
		
		System.out.printf(" Letter = %d , digit = %d and Special = %d" , letter ,digit , special);
	}

}
