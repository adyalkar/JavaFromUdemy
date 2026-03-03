package _6_Collections_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _6_ReverseList {
	
	public static void main(String[] args) {
		
        List<String> words = Arrays.asList("Java", "Collections", "Stream", "API");
        reverseList(words);

		
	}
	
	public static void reverseList (List <String> str) {
		
//		Collections.reverse(str);
//		
//		System.out.println("Using Collection.reverse : "+ str );
		
		// ✅ 2. Using For Loop manually
        List<String> reverse = new ArrayList<>();

        for (int i = str.size() - 1; i >= 0; i--) {
        	
            reverse.add(str.get(i));
        	        	
        }

        System.out.println("Using For Loop: " + reverse);

	}
	
//	 List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//
//     int left = 0;
//     int right = list.size() - 1;
//
//     while (left < right) {
//         int temp = list.get(left);
//         list.set(left, list.get(right));
//         list.set(right, temp);
//         left++;
//         right--;
//     }
	
	

}
