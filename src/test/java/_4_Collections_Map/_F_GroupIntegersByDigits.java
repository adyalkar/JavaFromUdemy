package _4_Collections_Map;

import java.util.*;

public class _F_GroupIntegersByDigits {
    public static void main(String[] args) {

        int[] numbers = {3, 25, 100, 5, 4000, 89, 7};
        groupByDigitCount(numbers);
    }

    public static void groupByDigitCount(int[] numbers) {
        // Step 1: Create a Map -> key: digit count, value: list of numbers
        Map<Integer, List<Integer>> groupedMap = new HashMap<>();

        // Step 2: Iterate over each number
        for (int num : numbers) {

            // Step 3: Find number of digits
            int digits = String.valueOf(Math.abs(num)).length(); // handles negative numbers too

            // Step 4: Add to map (create list if not already present)
            groupedMap.computeIfAbsent(digits, k -> new ArrayList<>()).add(num);
            
//            If the key (digit count) doesn’t exist, a new ArrayList is created and put in the map.
//
//            Then add(num) appends the number to the list for that key.
        }

        // Step 5: Print results
        System.out.println("Grouped by number of digits:");
        for (Map.Entry<Integer, List<Integer>> entry : groupedMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
