package _3_Array;

import java.util.Arrays;

public class _5_VariableArgument {
	
	public int sum(int ... numbers) {// here numbers is treated as an Array
		int sum=0;
		for(int i:numbers) {
			sum+=i;
		}		
		return sum;
	}
	
	public static void main(String[] args) {
	_5_VariableArgument obj = new _5_VariableArgument();
	System.out.println(obj.sum(1,2,3));	
	System.out.println(obj.sum(1,2,3,4));	
	
	}

}
