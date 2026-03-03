package _7_String;

import java.util.HashMap;
import java.util.Map;

public class _3_CountFreq {
	
	public static void main(String[] args) {
		
		String s ="success";
		
		countFreq(s);
		
	}
	
	public static void countFreq (String str) {
		
		Map <String , Integer> count = new HashMap<>();
		
		String [] strArray = str.split("");
		
		for (String s : strArray) {
			count.put(s,count.getOrDefault(s, 0)+1);
		}
		
		System.out.println(count);
	}

}
