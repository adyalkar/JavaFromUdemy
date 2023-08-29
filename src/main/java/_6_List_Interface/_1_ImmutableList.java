package _6_List_Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class _1_ImmutableList {
	public static void main(String[] args) {
		List <String> words = List.of("Apple","Ball","Cat"); // static List or Immutable List
		
		System.out.println(words.size());
		System.out.println(words.isEmpty());
		
		//words.add(3, "Dog");    //java.lang.UnsupportedOperationException
		System.out.println(words);
		System.out.println(words.get(2));
		System.out.println(words.contains("Apple"));
		System.out.println(words.indexOf("Dog"));  // -1 since it is not present
		
		// Convert to Mutable List
		
		List <String> wordArrayList = new ArrayList<>(words);
		wordArrayList.add(1,"Dog");
		System.out.println(wordArrayList);

		List <String> wordLinkedList = new LinkedList<>(words);
		wordLinkedList.add(2,"Elephant");
		System.out.println(wordLinkedList);
		
		List <String> wordVector = new Vector<>(words);
		wordVector.add(3,"Fan");
		wordVector.add("GUN");
		wordVector.add("Hello");
		System.out.println(wordVector);
		
		

	}
	

}
