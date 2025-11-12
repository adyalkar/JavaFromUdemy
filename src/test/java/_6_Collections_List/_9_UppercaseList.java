package _6_Collections_List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _9_UppercaseList {
	
	public static void main(String[] args) {
		
        List<String> words = Arrays.asList("java", "stream", "api");
        upperCase(words);

		
	}
	
	public static void upperCase (List <String> words) {
		
		List<String> upper = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upper);
	}

}
