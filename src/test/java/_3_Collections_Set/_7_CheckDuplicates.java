package _3_Collections_Set;
import java.util.HashSet;

public class _7_CheckDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};

        if (hasDuplicates(arr)) {
            System.out.println("Yes, duplicates exist in the array.");
        } else {
            System.out.println("No duplicates found in the array.");
        }
    }

    public static boolean hasDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            // If add returns false, it means the number is already in the set
            if (!set.add(num)) {
                return true; // duplicate found
            }
        }
        return false; // no duplicates
    }
}


//Step	Number	Set Before	add()Result	Duplicate?
//1	      1	      {}	    true	     No
//2	      2	      {1}	    true	     No
//3	      3	     {1,2}	    true	     No
//4	      1	    {1,2,3}	    false	   ✅ Yes duplicate
 