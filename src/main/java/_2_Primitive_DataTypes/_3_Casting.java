package _2_Primitive_DataTypes;

public class _3_Casting {

	public static void main(String[] args) {
//We can not initialize larger value to smaller data types and if want to do so then 
// need to do Explicit casting.
		
		// Example-1:
		int i = 10;
		short s = (short)i;// Explicit Casting
		System.out.println(s);//10
		
		// Example-2:
		double d = 45.32;
		int j = (int)d;
		System.out.println(j);//45
		
		// Example-3:
		short b = 11;
		long l = b;// Implicit casting as we can store smaller value into larger container
		System.out.println(l);
		
		// Example-4:
		long bigNumber = 1234567890123456789L;
		int smallNumber = (int) bigNumber;
		System.out.println(smallNumber);  // output: -1402352363
		
//In this example, we declare a long variable bigNumber with a very large value. 
//We then cast it to an int using explicit casting, and store the result in the int variable 
//smallNumber. However, since the value of bigNumber is too large to be represented accurately as 
//an int, the result of the cast is a different value (-1402352363).
		
	}

}
