package _7_String;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _6_RemoveDuplicate {
	
	public static void main(String[] args) {
		
		String str = "sucess";

        Set<Character> charSet = new LinkedHashSet<>();
       List<Character> ch =  str.chars().mapToObj(c ->(char)c)
                        .filter(c->charSet.add(c)).collect(Collectors.toList());

        System.out.println(ch);

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
