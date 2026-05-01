package _3_Collections_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _4_findNonRepeatedNuminArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 2, 3, 4, 4};
		findNonReapeatedNum(arr);
		
	}
	
	public static void findNonReapeatedNum (int [] numbs) {
		
		// Set to keep track of numbers that appeared exactly ONCE
        Set<Integer> seenOnce = new HashSet<>();

        // Set to keep track of numbers that appeared MORE than once
        Set<Integer> seenMore = new HashSet<>();

		
		for (int num : numbs) {
			
			if(!seenOnce.add(num)) {
				
				seenMore.add(num);						
		}
				
		}
        System.out.println("Seen Once : "+seenOnce);
        System.out.println("Seen More: "+seenMore);
		seenOnce.removeAll(seenMore);
		
		System.out.println(seenOnce);
		
	}

}

//Array = {1, 2, 2}
//
//num = 1 → seenOnce.add(1) returns true → !true = false → skip if
//
//num = 2 → seenOnce.add(2) returns true → !true = false → skip if
//
//num = 2 again → seenOnce.add(2) returns false → !false = true → enter if, so add 2 to seenMore.
