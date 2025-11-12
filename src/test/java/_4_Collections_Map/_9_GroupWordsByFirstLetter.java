package _4_Collections_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _9_GroupWordsByFirstLetter {
	
	public static void main(String[] args) {
		
		String str = "Anup Dhanu Apple Dreagon Chandu Chiku Elephant Esha";
		groupWordsByLetter(str);
		
	}
	
	public static void groupWordsByLetter (String str) {
		
		Map <Character , List <String>> map = new HashMap<>();
		
		String [] strArray = str.split(" ");
		
		for (String word : strArray ) {
			char firstChar = word.toLowerCase().charAt(0);
			
			if (!map.containsKey(firstChar)) {
				map.put(firstChar, new ArrayList<String>());
			}
			
			map.get(firstChar).add(word);
		}
		
		for (Map.Entry<Character , List <String>> entry : map.entrySet()) {
			System.out.println(entry.getKey() +" --> "+ entry.getValue());
		}
	}

}
