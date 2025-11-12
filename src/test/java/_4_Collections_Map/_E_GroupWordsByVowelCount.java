package _4_Collections_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _E_GroupWordsByVowelCount {

    public static void main(String[] args) {

        String[] words = {"apple", "orange", "kiwi", "pear", "banana"};

        groupByVowelCount(words);
    }

    public static void groupByVowelCount(String[] words) {

        // Step 1: Create Map -> key = vowel count, value = list of words
        Map<Integer, List<String>> map = new HashMap<>();

        // Step 2: Loop through each word
        for (String word : words) {

            // Step 3: Find how many vowels are in this word
            int count = countVowels(word);

            // Step 4: If that vowel count is not in map, create new list
            map.putIfAbsent(count, new ArrayList<>());

            // Step 5: Add the word to that group
            map.get(count).add(word);
        }

        // Step 6: Print the grouped result
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    // Helper method: Count vowels in a word
    public static int countVowels(String word) {
        int count = 0;
        word = word.toLowerCase();
        for (char c : word.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) { // if c is a vowel
                count++;
            }
        }
        return count;
    }
}
