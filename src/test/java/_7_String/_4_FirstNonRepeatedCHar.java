package _7_String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class _4_FirstNonRepeatedCHar {
	
	public static void main(String[] args) {
		
		String s ="success";

		firstNonRepeated(s);
		
	}
	
	public static void firstNonRepeated (String str) {
		
		char [] ch = str.toCharArray();
		
		Map <Character , Integer> map = new HashMap<>();
		
		for (char c : ch) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			
			if(entry.getValue() == 1) {
				System.out.println("First Non reapeated Char is : "+entry.getKey());
				break;
			}
			
		}
		
		
	}

}
