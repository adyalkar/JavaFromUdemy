package _5_Stream_API;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class _3_DuplicateElementFromList {
	
	public static void main(String[] args) {
		
		List <Integer> i = Arrays.asList(2,3,5,1,7,9,10,2,3);
		duplicateNumber(i);

	}
	
	public static void duplicateNumber (List <Integer> i) {
		
		 Set <Integer> duplicateNum = new HashSet<>();
		 
		 List <Integer> newList = i.stream().filter(x -> ! duplicateNum.add(x)).collect(Collectors.toList());
		 
		 System.out.println(newList);
	}
	

}
