package _5_Stream_API;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class _5_findDuplicates {
	
	public static void main(String[] args) {
		
		List <Integer> i = List.of(2,3,8,5,2,8,9);
		List <String> str = List.of("Anup","Anup","Chandu","Dhanu","Dhanu");

		System.out.println(findDuplicates(str));
		
		
	}
	
	public static List<String> findDuplicates (List <String> str){
		
		return str.stream().filter(i -> Collections.frequency(str, i)>1).distinct().collect(Collectors.toList());
	}
}
