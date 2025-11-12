package _4_Collections_Map;

import java.util.HashMap;
import java.util.Map;

public class _7_HighestFrequency {
	
	public static void main(String[] args) {
		
		String str = "HelloHH";
		highestFreq(str);
		
	}
	
	public static void highestFreq (String str) {
		
		Map <Character , Integer> highestFreq = new HashMap<>(); 
		
		for(char s : str.toCharArray()) {
			highestFreq.put(s, highestFreq.getOrDefault(s, 0) + 1);
		}
		
		char maxChar = 0 ;
		int maxFreq = 0;
		
		for (Map.Entry<Character, Integer> entry : highestFreq.entrySet()) {
			
			if(entry.getValue() > maxFreq) {
				maxFreq = entry.getValue();
				maxChar = entry .getKey();
			}		 
			
		}
		
		System.out.println(maxChar +" --> "+maxFreq);
		
	}

}
