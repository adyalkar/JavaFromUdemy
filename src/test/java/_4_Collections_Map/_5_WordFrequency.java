package _4_Collections_Map;

import java.util.HashMap;
import java.util.Map;

public class _5_WordFrequency {
	
	public static void main(String[] args) {
		String sentence = "I love Java and I love coding";
        countWordFrequency(sentence);
	}
	
	public static void countWordFrequency(String str) {
		
		Map <String , Integer > map = new HashMap<>();
		
		String [] strArray = str.split(" ");
		
		for (String s : strArray) {
			if (map.containsKey(s)) {
				map.put(s,map.getOrDefault(s, 0)+1 );
			} else {
				map.put(s, 1);
			}
		}
		
		   System.out.println("Word frequency in the sentence:");
	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + " → " + entry.getValue());
	        }
		
	}

}
