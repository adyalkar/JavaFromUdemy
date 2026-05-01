package _7_String;

import java.util.Arrays;
import java.util.Comparator;

public class _9_LargestSmallentWord {
	
	public static void main(String[] args) {
		String str = "Anup Chandrabhan Adyalkar";
		method1(str);

       String max =  Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).orElse("");
        System.out.println(max);
	}
	
	public static void method1(String str) {
		
		String largest = "";
		String smallest = "";
		
		int tempL = Integer.MIN_VALUE; 
		int tempS = Integer.MAX_VALUE;
		
		for (String s : str.split(" ")) {
			
			
			if (s.length()>tempL) {
				tempL = s.length(); 
				largest = s;
			} 
		    if (s.length()<tempS) {
				tempS = s.length();
				smallest = s;
			}
		}
		
		System.out.println(largest +" ---- " + smallest);
	}

}
