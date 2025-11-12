package _6_Collections_List;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _5_LongestString {
	
	public static void main(String[] args) {
		
        List<String> words = Arrays.asList("Java", "Collections", "Stream", "API");
        longestString(words);

		
	}
	
	public static void longestString (List<String> str) {
		
		int i = 0;
		String actualString = null ;
		
		for (String s : str) {
			
			if (s.length() >= i) {
				i = s.length();
				actualString = s;

			}				
		}
		
		System.out.println("Longest String : "+ actualString);
		
		//Stream API
		
		String longest = str.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null);

        System.out.println("Longest: " + longest);
		
	}

}
