package _5_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _4_CountTheFrequency {
	
	public static void main(String[] args) {
		
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        freqCount(words);

		
	}
	
	public static void freqCount (List <String> words) {
		
		Map <String , Long> count = words.stream().collect(Collectors.groupingBy(x -> x , Collectors.counting()));
		
		System.out.println(count);
		
	}
	

}
