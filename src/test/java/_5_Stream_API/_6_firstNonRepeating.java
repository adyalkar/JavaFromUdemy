package _5_Stream_API;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class _6_firstNonRepeating {

public static void main(String[] args) {
		
		List <Integer> i = List.of(2,3,8,5,2,8,9);
		List <String> str = List.of("Anup","Anup","Chandu","Dhanu","Dhanu");

		Optional<String> result = firstNonRepeating(str);
		
		result.ifPresent(System.out::println);
		System.out.println(firstNonRepeating(str).get());


		
		
	}
	
	public static Optional<String> firstNonRepeating (List <String> str){
		
		return str.stream().filter(i -> Collections.frequency(str, i) == 1).findFirst();
}
}