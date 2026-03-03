package _7_String;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class _6_RemoveDuplicate {
	
	public static void main(String[] args) {
		
		String str = "sucess";
		removeDuplicate(str);
	}
	
	public static void removeDuplicate (String str) {
		
		char [] ch = str.toCharArray();
		
		String newStr = "";
		
		Set <Character> charSet = new LinkedHashSet<>();
		
		for (char c : ch) {
			charSet.add(c);
		}
		
		for (char c : charSet) {
			newStr+=c;
		}
		
		System.out.println(newStr);
	}

}
