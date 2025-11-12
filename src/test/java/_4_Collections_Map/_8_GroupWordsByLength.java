package _4_Collections_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _8_GroupWordsByLength {
	
	public static void main(String[] args) {
		String str = "My Name is Anup Chandrabhan Adyalkar";
		groupWords(str);
	}
	
	public static void groupWords (String str) {
		
		// Step 1: Create a Map -> key = word length, value = list of words
		Map<Integer, List<String>> finalMap = new HashMap<>();
		
		// Step 2: Split the string into words
		String[] words = str.split(" ");
		
		// Step 3: Iterate through each word
		for (String word : words) {
			
			int length = word.length(); // find the length of the word
			
			// Step 4: Check if this length already exists as a key
			if (!finalMap.containsKey(length)) {
				// If not present, create a new list for this length
				finalMap.put(length, new ArrayList<>());
			}
			
			// Step 5: Add the word to its corresponding length list
			finalMap.get(length).add(word);
		}
		
		// Step 6: Print the grouped result
		for (Map.Entry<Integer, List<String>> entry : finalMap.entrySet()) {
			System.out.println(entry.getKey() + " → " + entry.getValue());
		}
	}
}
