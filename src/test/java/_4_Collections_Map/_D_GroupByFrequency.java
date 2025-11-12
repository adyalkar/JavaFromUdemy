package _4_Collections_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _D_GroupByFrequency {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4};

        groupByFrequency(arr);
    }

    public static void groupByFrequency(int[] arr) {

        // Step 1: Count frequency of each number
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create new map (frequency → list of numbers)
        Map<Integer, List<Integer>> groupMap = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            // If frequency not present, create a new list
            groupMap.putIfAbsent(frequency, new ArrayList<>());

            // Add number under that frequency
            groupMap.get(frequency).add(number);
        }

        // Step 3: Print grouped output
        for (Map.Entry<Integer, List<Integer>> entry : groupMap.entrySet()) {
            System.out.println("Frequency " + entry.getKey() + " → " + entry.getValue());
        }
    }
}
