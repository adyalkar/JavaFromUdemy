package _4_Collections_Map;

import java.util.HashMap;
import java.util.Map;

public class _3_DuplicateCharacters {
	
	public static void main(String[] args) {
		
		String str = "Anuupee";
		findDuplicates(str);
		
	}
	
	public static void findDuplicates (String str) {
		
		Map <Character , Integer> dupliChar = new HashMap<> ();
		
		for (char c: str.toCharArray()) {
			if (dupliChar.containsKey(c)) {
				dupliChar.put(c, dupliChar.getOrDefault(c, 0)+1);
			} else {
				dupliChar.put(c,1);
			}
		}
		
		for (Map.Entry<Character,Integer> entry : dupliChar.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() +" --> "+ entry.getValue());
			}
		}
		
	}

}
