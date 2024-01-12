package UtlityForInterview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteration {

	public static void main(String[] args) {
//		List<String> words = List.of("Apple","Bat","Cat");
//		List <String> wordsAl = new ArrayList<>(words);
		
		ArrayList<String> wordsAl = new ArrayList<String>();
		wordsAl.add("Apple");
		wordsAl.add("Bat");
		wordsAl.add("Cat");
	    
		
		
		
		// with Enhanced for loop
		for (String wordNew : wordsAl) {
			if(wordNew.endsWith("at")) {
				wordsAl.remove(wordNew);
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
		
		//With Functional Programming
				wordsAl.removeIf(e->e.endsWith("at"));
				
				System.out.println("Remove with Functional Programming : "+wordsAl);

	}
	
	
	

}
