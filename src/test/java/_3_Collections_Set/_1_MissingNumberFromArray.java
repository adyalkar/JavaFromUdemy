package _3_Collections_Set;

import java.util.Collections;
import java.util.HashSet;

public class _1_MissingNumberFromArray {

    public static void main(String[] args) {

        int[] arr = {2,4,3,9,10,11,15};
        findMissingNumber(arr);
    }

    public static void findMissingNumber(int[] numbs) {

        HashSet<Integer> set = new HashSet<>();

        // Add each number to the set
        for (int num : numbs) {
            set.add(num);
        }

        int max = Collections.max(set);
        int min = Collections.min(set);

        System.out.println("Missing numbers between " + min + " and " + max + ":");

        // Check all numbers in the range min..max
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                System.out.println(i);
            }
        }
    }
}

//
//| When you need...                | Use             |
//| ------------------------------- | --------------- |
//| Unique values only              | `HashSet`       |
//| Unique values + insertion order | `LinkedHashSet` |
//| Unique values + sorted order    | `TreeSet`       |




