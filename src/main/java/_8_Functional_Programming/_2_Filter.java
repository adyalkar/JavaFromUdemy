package _8_Functional_Programming;

import java.util.List;

public class _2_Filter {
	
	public static void main(String[] args) {
		List <Integer> num = List.of(3,2,6,5,4,8);
		List<String> list = List.of("Apple","Bat","Cat","Dog");

		filterOddNum(num);
		System.out.println("-------------------------");
		filterEvenNum(num);
		System.out.println("-------------------------");
		filterString(list);
	}
	
	public static void filterOddNum(List<Integer> n) {
		n.stream()
		 .filter(element-> element%2 != 0)
		 .forEach(element -> System.out.println(element));
	}
	
	public static void filterEvenNum(List<Integer> n) {
		n.stream()
		 .filter(element-> element%2 == 0)
		 .forEach(element -> System.out.println(element));
	}
	
	public static void filterString(List<String> s) {
		s.stream()
		 .filter(element-> element.endsWith("at"))
		 .forEach(element -> System.out.println(element));
	}

}
