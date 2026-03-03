package _6_Collections_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class _B_RemoveEvenNum {
	
	public static void main(String[] args) {
		
		 List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

	        Iterator<Integer> iterator = list.iterator();

	        while (iterator.hasNext()) {
	            if (iterator.next() % 2 == 0) {
	                iterator.remove();
	            }
	        }

	        System.out.println(list);
	    }


}
