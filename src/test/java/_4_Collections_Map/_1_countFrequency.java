package _4_Collections_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class _1_countFrequency {
	
	public static void main(String[] args) {
		
		int [] numbs = {1,2,3,4,2,3,5,2,4,3,5,7,1};
		
		countFrequency(numbs);
	}
	
	
	public static void countFrequency (int [] numbs) {
		
		Map <Integer,Integer> freMap = new HashMap<>();
		
		for (int num : numbs) {
			if (freMap.containsKey(num)) {
				freMap.put(num,freMap.get(num)+1);
			} else {
				freMap.put(num, 1);
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : freMap.entrySet()) {
			System.out.println(entry.getKey() + " --> "+ entry.getValue());
		}
		
	}

}
