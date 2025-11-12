package _6_Collections_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _3_CommonEleBetweenTwoList {
	
	public static void main(String[] args) {
		 List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5,5);
	     List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
	     
	     commonElement(list1,list2);
	     
	}
	
	public static void commonElement (List<Integer> list1 , List<Integer> list2) {
		
		List <Integer> common = new ArrayList<>();
		
		for (int i : list1) {
			if (list2.contains(i)) {
				common.add(i);
			}
		}
		
		Set <Integer> commonSet = new HashSet<>(common);

		System.out.println(commonSet);
		
		// Stream API
		
		List<Integer> commonStream = list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());  // Concept: filter(list2::contains) checks which elements of list1 are present in list2.
		
		System.out.println(commonStream);
	}

}
