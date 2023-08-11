package _2_Primitive_DataTypes;

public class _6_Float_Double {

	public static void main(String[] args) {
		
//In Java, float and double are two floating-point data types used to represent real numbers 
//with decimal points. The main difference between the two is the precision and range of values 
//they can represent.
		
//float is a 32-bit single-precision floating-point data type that can represent values in the 
//range of approximately ±3.4 x 10^38 with a precision of 7 decimal digits. 
//To declare a float variable, you can use the keyword float, as follows:
		
		float myFloat = 3.14f;
		
//double is a 64-bit double-precision floating-point data type that can represent values in the 
//range of approximately ±1.7 x 10^308 with a precision of 15 decimal digits. 
//To declare a double variable, you can use the keyword double, as follows:
		
		double myDouble = 3.141592653589793;

//By default, floating-point literals without a suffix are treated as double values, 
//so there is no need to add a suffix to double values.
		
//In general, if you need to represent real numbers with high precision or a large range of values, 
//use double. If memory usage is a concern or if you are dealing with large arrays of real numbers, 
//use float.
		
		double d = 89.298;
		float f = (float)d;//Explicit Casting
		System.out.println(f);//89.298
		
		int i = (int)f;//Explicit Casting
		System.out.println(i);//89
		
		float s = i;// This is valid and possible
		System.out.println(s);//89.0
		
		double a = i;// This is valid and possible
		System.out.println(a);

		// All operators applicable to integer data types are also applicable to float and double.
	}

}
