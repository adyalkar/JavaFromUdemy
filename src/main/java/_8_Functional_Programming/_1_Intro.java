package _8_Functional_Programming;

import java.util.List;

public class _1_Intro {
		
	public static void main(String[] args) {
		List<String> list = List.of("Apple","Ball","Cat","Dog");
//		PrintBasic(list);
		PrintWithFP(list);
	}
	
	public static void PrintBasic (List<String> list) {
		for(String l : list) {
			System.out.println(l);
		}
	}
	
	public static void PrintWithFP (List<String> list) {
		list.stream().forEach(element->System.out.println(element));
	}

}
