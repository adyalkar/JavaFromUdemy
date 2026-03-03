package _5_Stream_API;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class _7_MaxandMinElement {
	
public static void main(String[] args) {
		
		List <Integer> i = List.of(2,3,8,5,2,8,9);
		
		System.out.println(max(i));
		System.out.println(min(i));



		
		
	}
	
	public static int max (List <Integer> str){
		
		return str.stream().max(Integer::compare).get();
}
	
	public static int min (List <Integer> str){
		
		return str.stream().min(Integer::compare).get();
}

}
