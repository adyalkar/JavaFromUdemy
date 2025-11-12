package _6_Collections_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _6_ReverseList {
	
	public static void main(String[] args) {
		
        List<String> words = Arrays.asList("Java", "Collections", "Stream", "API");
        reverseList(words);

		
	}
	
	public static void reverseList (List <String> str) {
		
//		Collections.reverse(str);
//		
//		System.out.println("Using Collection.reverse : "+ str );
		
		// ✅ 2. Using For Loop manually
        List<String> reverse = new ArrayList<>();

        for (int i = str.size() - 1; i >= 0; i--) {
        	
            reverse.add(str.get(i));
        	        	
        }

        System.out.println("Using For Loop: " + reverse);

	}
	
	

}
