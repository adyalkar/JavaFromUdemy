package _6_Collections_List;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _4_FindEvenAndSortDescending {
	
	
	public static void main(String[] args) {
		
	    List<Integer> list1 = Arrays.asList(3, 4, 5, 6, 7,10,11,2,0);
	    evenAndDescending(list1);

		
	}
	
	public static void evenAndDescending(List<Integer> list1) {
		
		List <Integer> even = list1.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
						
		even.sort(Comparator.reverseOrder());
		
		System.out.println(even);
		
		List<Integer> evens = list1.stream()
                .filter(n -> n % 2 == 0)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
		
		System.out.println(evens);

	}


}
