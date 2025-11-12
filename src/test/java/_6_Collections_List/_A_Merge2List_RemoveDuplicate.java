package _6_Collections_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _A_Merge2List_RemoveDuplicate {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);
        
        mergeAndRemove(list1,list2);
		
	}
	
	public static void mergeAndRemove (List <Integer> list1 , List <Integer> list2) {
		
		List <Integer> newList = new ArrayList<>(list1);
		
		for (int i : list2) {
			if (!newList.contains(i)) {
				
				newList.add(i);
				
			}
		}
		
		Set <Integer> newSet = new HashSet<>(newList);
		
		System.out.println(newSet);
		
		//Stream API
		
		List<Integer> merged = Stream.concat(list1.stream(), list2.stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(merged);  // [1, 2, 3, 4, 5, 6]
		
	}

}
