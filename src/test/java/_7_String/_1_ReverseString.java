package _7_String;

public class _1_ReverseString {
	
	public static void main(String[] args) {
	
		String name = "Anup";
		reverseSTring2(name);
	}
	
	public static void reverseSTring (String str) {
		
		String [] strArray= str.split("");
		String reverseString = "";
		
		for (int i = strArray.length-1 ; i >=0 ; i--) {
			
			reverseString+=strArray[i];
						
		}
		
		System.out.println("Reverse String is : "+ reverseString);
	}
	
public static void reverseSTring2 (String str) {
		
		StringBuilder word = new StringBuilder(str);
		StringBuilder reverseWord = word.reverse();
		
		
		
		System.out.println("Reverse String is : "+ reverseWord);
	}
	

}
