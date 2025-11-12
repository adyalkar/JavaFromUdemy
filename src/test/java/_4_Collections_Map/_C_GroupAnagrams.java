package _4_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _C_GroupAnagrams {

    public static void main(String[] args) {

        String[] str = {"cat", "tac", "act", "dog", "god"};

        groupAnagrams(str);
    }

    public static void groupAnagrams(String[] str) {

        // Step 1: Create Map -> key = sorted word, value = list of anagrams
        Map<String, List<String>> map = new HashMap<>();

        // Step 2: Loop through each word
        for (String s : str) {

            // Step 3: Convert word to char array and sort it
            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            // Step 4: Convert back to string (sorted word = key)
            String sortedKey = new String(chars);

            // Step 5: If key doesn’t exist, add empty list
            map.putIfAbsent(sortedKey, new ArrayList<>());

            // Step 6: Add original word to that key’s list
            map.get(sortedKey).add(s);
        }

        // Step 7: Print the final grouped result
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
