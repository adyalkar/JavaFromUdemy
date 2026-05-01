package _2_Array_And_Matrices;

import java.util.*;

public class _8_SecondLargestNumber {
	
	public static void main(String[] args) {
        int[] arr = {13, 12, 0, 2, 4, -8, 13};

        Set<Integer> list = new HashSet<>();

        for (int x:arr){
            list.add(x);
        }

        Optional secLargest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();

        System.out.println("Second Largest Number "+secLargest.get());

        int num = secondLargest(arr);
        System.out.println(num);
		
	}
	
	public static int secondLargest(int[] arr) {
	    int max = Integer.MIN_VALUE;
	    int second = Integer.MIN_VALUE;

	    for (int num : arr) {
	        if (num > max) {
	            second = max;
	            max = num;
	        } else if (num > second && num != max) {
	            second = num;
	        }
	    }
	    return second;
	}

}
