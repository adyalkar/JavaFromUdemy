package _4_Collections_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class _2_FirstNonRepeatedChar {
	
	public static void main(String[] args) {
		
		String s = "anupan";
		findFirstNonRepeated(s);
		
	}
	
	public static void findFirstNonRepeated (String s) {
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for (char c : s.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.getOrDefault(c, 0)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()){
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
		
		
	}

}
