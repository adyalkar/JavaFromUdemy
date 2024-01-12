package _8_Functional_Programming;

import java.util.List;

public class _3_SumOfNum {
	
	public static void main(String[] args) {
		List <Integer> num = List.of(3,2,6,5,4,8);
		int sum = normalSum(num);
		System.out.println("Normal Sum : "+ sum);
		
		int sumWithFP = sumWithFP(num);
		System.out.println("sumWithFP : "+ sumWithFP);
		
		int sumOfOddNum = sumOfOddNum(num);
		System.out.println("sumOfOddNum : "+ sumOfOddNum);
		
		ExactWorkingOfReduce(num);

	}
	
	
	public static int normalSum(List<Integer> n) {
		int sum = 0;
		for(int number : n) {
			sum=sum+number; // Value of sum changes called Mutation
		}
		
		return sum;
	}
	
	// In a Normal way of doing coding is called structural Programming.
	//In the above code , value of sum variable is changing with a loop which is called 
	//Mutation.
	
	// In the Functional Programming we avoid mutation of variable.
	//Here we simply give instruction "What to do"
	
	// In structural Programming with "What to do" we also need to instruct "How to do(here we have declare sum variable)"
	
	public static int sumWithFP(List<Integer> n) {
		int sum = n.stream()
		           .reduce(0,(num1,num2)->num1+num2);// Logic is to reduce many number to  one number
		
		return sum ;
	}
	
	
	public static int sumOfOddNum(List<Integer> n) {
		int sum =n.stream()
					 .filter(element->element%2 == 1)
					 .reduce(0,(num1,num2)->num1+num2);
		
		return sum;
	}
	
	public static int ExactWorkingOfReduce(List<Integer> n) {
		
		return n.stream()
		           .reduce(0,(num1,num2)->
		           {System.out.println(num1 + " "+ num2);
		           return num1+num2;
		           });		
	}

}
