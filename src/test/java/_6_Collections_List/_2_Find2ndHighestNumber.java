package _6_Collections_List;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _2_Find2ndHighestNumber {
	
	public static void main(String[] args) {
		
		List <Integer> numbs = Arrays.asList(10,10,9,8,4,8,3,9);

		secondHighestNum(numbs);
	}
	
	public static void secondHighestNum (List <Integer> numbs) {
		
		// Remove Duplicate
		
		List <Integer> distint = numbs.stream().distinct().collect(Collectors.toList());
		
		// Do Sorting 
		Collections.sort(distint);
		
		System.out.println(distint);

		Collections.reverse(distint);
		
		System.out.println(distint);
		
		System.out.println("second Highest Number : "+ distint.get(1));

		
//		System.out.println("second Highest Number : "+ distint.get(numbs.size()-2));  -- > It not reverse
		
		// Stream API
		
		 int secondHighest = distint.stream()
	                .sorted(Comparator.reverseOrder())
	                .skip(1)
	                .findFirst().orElseThrow(null);

	        System.out.println("Second highest: " + secondHighest);
	        
//	        🧩 Concept:
//
//	        	sorted(reverseOrder()) → sorts descending.
//
//	        	skip(1) → skips the first (max) element.
//
//	        	findFirst() → returns the next one.
	}

}
