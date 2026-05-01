package _7_String;

import java.util.*;
import java.util.stream.Collectors;

public class _4_FirstNonRepeatedCHar {
	
	public static void main(String[] args) {
		
		String s ="aabbcc";


        Map<Character,Long>lh= s.chars().mapToObj(x->(char)x)
                        .collect(Collectors.groupingBy(x->x,LinkedHashMap::new,Collectors.counting()));

//        Map<Object, List<Character>> lh= s.chars().mapToObj(x->(char)x)
//                .collect(Collectors.groupingBy(x->x));

        System.out.println(lh);
        boolean isFound=false;

        for (Map.Entry<Character,Long> entry : lh.entrySet()) {
            if(entry.getValue()==1){
                System.out.println("First Non Repeated Char is : "+entry.getKey());
                isFound = true;
                break;
            }
        }

        if (!isFound) {
        	System.out.println("There is no Non Repeated Char in the String");
        }

//Another way to find first non repeated char using stream
       Character c= s.chars().mapToObj(x->(char)x)
                .collect(Collectors.groupingBy(x->x,LinkedHashMap::new,Collectors.counting()))
                        .entrySet().stream()
                        .filter(x->x.getValue()==1)
                                .findFirst().orElse(null).getKey();

        System.out.println(c);

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
