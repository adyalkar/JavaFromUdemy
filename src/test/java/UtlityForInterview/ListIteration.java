package UtlityForInterview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteration {

	public static void main(String[] args) {
		List<String> words = List.of("Apple","Bat","Cat");
		List <String> wordsAl = new ArrayList<>(words);
	
		// with Enhanced for loop
		for (String word : wordsAl) {
			if(word.endsWith("at")) {
				wordsAl.remove(word);
			}
		}
		
		System.out.println("Remove with enhanced for loop : "+wordsAl);
		
		//With Iterator
		
		Iterator <String> wordsIt = wordsAl.iterator();
		while(wordsIt.hasNext()) {
			if (wordsIt.next().endsWith("at")) {
				wordsIt.remove();			
			}
		}
		System.out.println("Remove with Iterator : "+wordsAl);


	}

}
