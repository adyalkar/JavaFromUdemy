package _1_Numbers;

import java.util.ArrayList;

public class _C_IntegerToBinary {
	
	public static void main(String[] args) {
		integerToBinary(25);
		System.out.println();
		secondMethod(25);
	}
	
	public static void integerToBinary(int num) {
		
		ArrayList<Integer> s = new ArrayList<Integer>(); //[1,]
		
		while (num != 0) {
			int R = num % 2 ; // 1 
			s.add(R);
			num = num/2;
		}
		
		for(int i=s.size()-1;i>=0;i--) {
			System.out.print(s.get(i));
		}
	}
	
	public static void secondMethod(int num) {
		System.out.print(Integer.toBinaryString(num));
	}

}
