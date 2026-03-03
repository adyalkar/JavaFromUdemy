package _5_Stream_API;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class _8_longestString {
	
public static void main(String[] args) {
		
		List <Integer> i = List.of(2,3,8,5,2,8,9);
		List <String> str = List.of("Anup","Anup","Chandu","Dhanu","Dhanu","Chandu");

		System.out.println(longestString (str));
		
		
	}
	
	public static String longestString  (List <String> str){
		
		return str.stream().reduce("",(a,b) -> a.length() > b.length() ? a : b);
	}

}
