package _3_Array;

import java.util.Arrays;

public class _1_Basics {

	public static void main(String[] args) {
		// Declaration and Initialization:
		int [] number = {2,4,6,8};
		String [] name = new String[4];//Declaration = Definition
		name[0]="Anup";
		name[1]="Kalpana";
		name[2]="Chandu";
		name[3]="Shruti";
		
	//	person[] person = new person[4];//Array of an object whose default value is "null"
		
		//Accessing an Array
		int num1 = number[0];
		System.out.println("Number 1 : "+ num1);
		
		String name3 = name[2];
		System.out.println("Name 3 : "+ name3 );
		//System.out.println("ArrayIndexOutOfBoundsException : "+ name[5] );
		
		//Getting content of an array
		System.out.println("number : "+ number );//[I@6504e3b2 --> This is memory location
		System.out.println("number : "+ Arrays.toString(number));
		System.out.println("name : "+ Arrays.toString(name));
		
		// Looping through an Array
		int sum = 0;
		for(int i=0;i<=number.length-1;i++) {// Normal for loop
			sum=sum+number[i];
		}
		System.out.println("Final Sum : "+sum);
		
		for(String x:name) {// with enhanced for loop
			System.out.println(x);
		}
		
		// Declaration and initialization of a 2D array
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

		// Accessing elements of a 2D array
		int element = matrix[1][2]; // Accessing the element at row 1, column 2

		System.out.println("element : "+element);

	}

}
