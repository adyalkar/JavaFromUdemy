package _2_Primitive_DataTypes;

public class _1_WrapperClass {

	// Introduction :-
	
//	In Java, a wrapper class is a class that provides a way to use primitive data types as objects. 
//	Each primitive data type in Java has a corresponding wrapper class:
//
//		Byte: for byte
//		Short: for short
//		Integer: for int
//		Long: for long
//		Float: for float
//		Double: for double
//		Boolean: for boolean
//		Character: for char
	
//	Wrapper classes are useful in situations where an object is required, 
//	but a primitive data type is being used. 
//	For example, some Java APIs require objects to be passed as arguments, 
//	so using a wrapper class can make it easier to work with these APIs.
	
//	Wrapper classes provide a number of useful methods that allow you to perform 
//	operations on the corresponding primitive data type. 
//	For example, the Integer class has methods like parseInt() and toString(), 
//	which can be used to parse a string into an int or convert an int to a string, respectively.

//	Wrapper classes also provide a way to represent null values.
//	Primitive data types do not have a null value, but wrapper classes can have a null value, 
//	which is represented by the null keyword.
	
	public static void main(String[] args) {
		System.out.println(Byte.SIZE);// In bits
		System.out.println(Byte.BYTES);// In byte
		System.out.println(Short.SIZE);
		System.out.println(Short.BYTES);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		System.out.println(Long.SIZE);
		System.out.println(Long.BYTES);
		System.out.println(Float.SIZE);
		System.out.println(Float.BYTES);
		System.out.println(Double.SIZE);
		System.out.println(Double.BYTES);
		System.out.println(Character.SIZE);
		System.out.println(Character.BYTES);
		
		//Max value and Min Value
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}

}
