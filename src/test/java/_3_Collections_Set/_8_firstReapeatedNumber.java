package _3_Collections_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class _8_firstReapeatedNumber {
	
	public static void main(String[] args) {
		
        int[] arr = {1, 2, 3, 2,3,1};
        firstRepeatedNumber(arr);
		
	}
	
	public static void firstRepeatedNumber(int [] arr) {
		
		LinkedHashSet <Integer> linkedSet = new LinkedHashSet<>();
		
		LinkedHashSet <Integer> result = new LinkedHashSet<>();
		
		for (int num : arr) {
			if(!linkedSet.add(num)) {
				
				result.add(num);
				
			}
		}
		
		List<Integer> list = new ArrayList<>(result);
		Integer first = list.get(0);  // Now you can get index 0
		System.out.println("First element: " + first);
	}

}
