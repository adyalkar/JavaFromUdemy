package _4_Collections_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _A_GroupNumberEvenOdd {

    public static void main(String[] args) {

        int[] numbs = {1, 2, 4, 3, 5, 6, 1, 8, 9};
        evenOdd(numbs);
    }

    public static void evenOdd(int[] numbs) {

        Map<String, List<Integer>> map = new HashMap<>();

        for (int i : numbs) {

            String evenOrOdd = (i % 2 == 0) ? "Even" : "Odd";

            // ✅ If key doesn't exist, create an empty list
            map.putIfAbsent(evenOrOdd, new ArrayList<>());

            // ✅ Add number to the correct list
            map.get(evenOrOdd).add(i);
        }

        // ✅ Print the final grouped result
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
