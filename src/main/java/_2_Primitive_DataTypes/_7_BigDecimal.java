package _2_Primitive_DataTypes;

import java.math.BigDecimal;

public class _7_BigDecimal {

	public static void main(String[] args) {
		
// When it comes to perform financial calculations then it is not recommended to go with
// floating point number as these are not accurate.
// Hence to use BigDecimal
		
	//BigDecimal :-
//BigDecimal is a Java class that provides arbitrary-precision decimal arithmetic. 
//It allows you to perform exact calculations with decimal numbers of any size, 
//without the rounding errors that can occur with floating-point data types such as float and double.
	
//BigDecimal provides a wide range of arithmetic operations such as addition, subtraction,
//multiplication, division, and more, as well as advanced functionality such as rounding, scaling, 
//and comparison. It is a powerful tool for working with decimal numbers in Java, 
//especially when precision is crucial.
		
		BigDecimal num1=new BigDecimal("23.23");
		BigDecimal num2=new BigDecimal("23.23");
		
		BigDecimal num3= num1.add(num2);
		System.out.println(num3);
		
		// While performing the operation both number should be BigDecimal
//		num1.subtract(12); ---> This will throw an error
		
		BigDecimal num4 = num1.subtract(new BigDecimal(12));//Converted int into BigDecimal and 
		//then perform the operation
		System.out.println(num4);
		
		

	
	}

}
