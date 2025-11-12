package _3_Collections_Set;

import java.util.HashSet;
import java.util.Set;

public class _2_findIntersectionInArray {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        findIntersection(arr1, arr2);
		
	}
	
	public static void findIntersection (int [] arr1 , int [] arr2) {
		
		Set<Integer> set1= new HashSet();
		Set<Integer> intersection = new HashSet();
		
		for (int num : arr1) {
			set1.add(num);
		}
		
		for(int num1 : arr2) {
			if(set1.contains(num1)) {
				
				intersection.add(num1);

			}
			
		}
		
		System.out.println("Intersection Number :"+ intersection);

	}

}
