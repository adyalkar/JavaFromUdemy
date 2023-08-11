package _2_Primitive_DataTypes;

public class _5_Integer_Pre_Post_Operator {

	public static void main(String[] args) {
	
//		In Java, pre-increment and post-increment are two types of increment operators 
//		that are used to increase the value of a variable by 1. 
//		The difference between the two is when the increment operation is performed with respect to 
//		the value of the variable.
		
//		Pre-increment: 
//		The pre-increment operator ++ is written before the variable name. 
//		It increments the value of the variable and returns the new value. Here's an example:
		
		int a = 5;
		int b = ++a; // a is incremented by 1 and then assigned to b
		System.out.println("a = " + a); // output: a = 6
		System.out.println("b = " + b); // output: b = 6
		
//		Post-increment: 
//		The post-increment operator ++ is written after the variable name. 
//		It increments the value of the variable but returns the old value. Here's an example:
		
		int c = 5;
		int d = c++; // c is assigned to d and then incremented by 1
		System.out.println("c = " + c); // output: c = 6
		System.out.println("d = " + d); // output: d = 5
		
//		Pre-decrement: 
//		The pre-decrement operator -- is written before the variable name. 
//		It decrements the value of the variable and returns the new value. Here's an example:
		
		int e = 5;
		int f = --e; // e is decremented by 1 and then assigned to f
		System.out.println("e = " + e); // output: e = 4
		System.out.println("f = " + f); // output: f = 4
		
//		Post-decrement: 
//		The post-decrement operator -- is written after the variable name. 
//		It decrements the value of the variable but returns the old value. Here's an example:
		
		int g = 5;
		int h = g--; // g is assigned to h and then decremented by 1
		System.out.println("g = " + g); // output: g = 4
		System.out.println("h = " + h); // output: h = 5


		
		



	}

}
