package _6_Collections_List;

import java.util.Arrays;
import java.util.List;

public class _7_SumOfElement {
	
	public static void main(String[] args) {
		
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        sum(nums);

		
	}
	
	public static void sum (List <Integer> numbs) {
		
		int sum = 0 ;
		
		for (int i : numbs) {
			sum += i ;
		}
		
		System.out.println(sum);
		
		int sumStream = numbs.stream()
                .mapToInt(Integer::intValue)   // mapToInt() converts stream to primitive int for arithmetic.
                .sum();

        System.out.println("Sum: " + sumStream);
		
	}

}
