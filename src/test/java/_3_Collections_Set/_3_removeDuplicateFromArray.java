package _3_Collections_Set;

import java.util.HashSet;
import java.util.Set;

public class _3_removeDuplicateFromArray {
	
	public static void main(String[] args) {
		
		int [] array  = {1,2,2,4,5,3,4};	
		
		removeDuplicates(array);
		
	}
	
	public static void removeDuplicates(int [] numbs) {
		
		HashSet <Integer> set = new HashSet();
		
		for (int num : numbs) {
			
			set.add(num);
		}
		
		System.out.println(set);
		
	}

}
