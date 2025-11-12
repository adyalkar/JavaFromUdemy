package _4_Collections_Map;

import java.util.*;

public class _G_GroupStringsByLastChar {
    public static void main(String[] args) {
        String[] words = {"hello", "piano", "cello", "data", "panda", "tuna"};
        groupByLastChar(words);
    }

    public static void groupByLastChar(String[] words) {
        // Step 1: Create a map -> last char → list of words
        Map<Character, List<String>> groupedMap = new HashMap<>();

        // Step 2: Iterate over words
        for (String word : words) {
            if (word == null || word.isEmpty()) continue; // skip empty words

            // Step 3: Get last character
            char last = word.charAt(word.length() - 1);

            // Step 4: Add to the map
            groupedMap.computeIfAbsent(last, k -> new ArrayList<>()).add(word);
        }

        // Step 5: Print grouped results
        System.out.println("Grouped by last character:");
        for (Map.Entry<Character, List<String>> entry : groupedMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
