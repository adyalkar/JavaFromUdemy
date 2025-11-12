package _5_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _2_EvenNumberFromList {
	
	public static void main(String[] args) {
	List <Integer> i = Arrays.asList(2,3,5,1,7,9,10);
	evenNumber(i);

}
	
	public static void evenNumber(List <Integer> i ) {
		
		List <Integer> newList = i.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		
		System.out.println(newList);
	}
}
