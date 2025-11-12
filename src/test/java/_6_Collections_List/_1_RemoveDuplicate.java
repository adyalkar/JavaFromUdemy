package _6_Collections_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _1_RemoveDuplicate {
	
	public static void main(String[] args) {
		
		List <Integer> numbs = Arrays.asList(10,9,8,4,8,3,9);
		removeDuplicate(numbs);
		
	}
	
	public static void removeDuplicate (List <Integer> numbs) {
		
		// By Stream API
		
		List<Integer> uniqueList = numbs.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueList);
        
        // Convert to Set
		
		Set <Integer> newSet = new HashSet<>(numbs);
		
		System.out.println(newSet);
		
		
		
	}

}
