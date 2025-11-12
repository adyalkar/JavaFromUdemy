package _6_Collections_List;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _8_DuplicateElement {
	
	public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6,3);
        duplicateElement(list);

		
	}

	public static void duplicateElement (List <Integer> numbs) {
		
		Set <Integer> seenMore = new HashSet<>();
		Set <Integer> seenOnce = new HashSet<>();

		
		for (int i : numbs) {
			if (!seenOnce.add(i)) {
				seenMore.add(i);
				
			}
		}
		
		System.out.println(seenMore);
		
		//Using stream API
		
		Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = numbs.stream()
                .filter(n -> !seen.add(n))
                .collect(Collectors.toSet());

        System.out.println("Duplicates: " + duplicates);
		
	}
}
