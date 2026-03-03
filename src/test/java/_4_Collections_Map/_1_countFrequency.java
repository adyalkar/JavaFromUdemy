package _4_Collections_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class _1_countFrequency {
	
	public static void main(String[] args) {
		
		int [] numbs = {1,2,3,4,2,3,5,2,4,3,5,7,1};
		
		countFrequency(numbs);
		
		System.out.println("--------------STREAM API--------------------");
		
		List <Integer> list = new ArrayList<>();
		
		for(int x : numbs) {
			list.add(x);
		}
		
		Map<Integer, Long> frequencyMap = list.stream().collect(Collectors.groupingBy(i -> i,Collectors.counting()));
		System.out.println(frequencyMap);
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
