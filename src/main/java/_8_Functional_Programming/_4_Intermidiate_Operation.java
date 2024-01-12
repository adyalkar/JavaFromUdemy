package _8_Functional_Programming;

import java.util.List;
import java.util.stream.IntStream;

public class _4_Intermidiate_Operation {
	

	public static void main(String[] args) {
		List <Integer> num = List.of(3,2,6,5,4,8,6,4);
		List<String> list = List.of("Apple","Ball","Cat","Dog");

		
		//Sorted
		num.stream().sorted().forEach(e->System.out.println(e));
		
		System.out.println("*******************************************");
		
		//Distint  ---> Gives unique value with actual order
		num.stream().distinct().forEach(e->System.out.println(e));
		
		System.out.println("*******************************************");

		
		//Map 
		num.stream().distinct().map(e->e*e).forEach(e->System.out.println(e));
		
		System.out.println("*******************************************");
	
		//Print square of first 10 number
		IntStream.range(1, 11).map(e->e*e).forEach(e->System.out.println(e));
		
		System.out.println("*******************************************");
		
		//Print the lower case of list
		list.stream().map(e->e.toLowerCase()).forEach(e->System.out.println(e));


	}

}
