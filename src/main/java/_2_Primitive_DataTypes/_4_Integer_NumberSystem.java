package _2_Primitive_DataTypes;

public class _4_Integer_NumberSystem {

	public static void main(String[] args) {
		
		
//		Java supports different number systems such as decimal (base 10), 
//		binary (base 2), octal (base 8), and hexadecimal (base 16).

//		To represent numbers in different number systems in Java, we can use the following prefixes:

//		0b or 0B for binary numbers
//		0 for octal numbers
//		0x or 0X for hexadecimal numbers

		int eight = 010;// Octal Representation : Anything starting with "0" is octal representation
		System.out.println(eight);//8
		
		int sixteen = 0x10;// Hexadecimal Representation : Anything starting with "0x" is Hexadecimal representation
		System.out.println(sixteen);//16
		
		int fifteen = 0XF;
		System.out.println(fifteen);
		
		int ten = 0XA;
		System.out.println(ten);
		

		
		int decimal = 42;
//		int binary = 0b101010;
		int octal = 052;
		int hexadecimal = 0x2A;

		System.out.println(decimal);     // output: 42
//		System.out.println(binary);      // output: 42
		System.out.println(octal);       // output: 42
		System.out.println(hexadecimal); // output: 42
		
		//int binary = 0b101010; // this syntax requires Java 7 or later
//		int binaryOldSyntax = 0b101010; // older syntax, works in Java 6 and earlier



	}

}
