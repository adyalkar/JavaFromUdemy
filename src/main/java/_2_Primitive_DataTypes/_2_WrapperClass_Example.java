package _2_Primitive_DataTypes;

public class _2_WrapperClass_Example {

	public static void main(String[] args) {
		//Example-1:
		
		// Create a object of Integer class
		Integer myInt = new Integer(42);
		System.out.println(myInt);
		
		//Call different methods of Integer Class
		int i = myInt.intValue();
		System.out.println(i);
		
		String s=myInt.toString();
		System.out.println(s);
		
//		In this example, we create an Integer object with the value 42. 
//		We then use the intValue() method to get the int value of the object, 
//		and the toString() method to convert the object to a string.
		
		//Example-2:
		
		String numberAsString = "24";
		int number = Integer.parseInt(numberAsString);
		System.out.println(number);
		
//In this example, we use the Integer.parseInt() method to convert the string "24" to an int

		//Example-3:
		
		double myDouble = 3.14;
		String doubleAsString = Double.toString(myDouble);
		System.out.println(doubleAsString);
		
//In this example, we use the Double.toString() method to convert the double value 3.14 to a string.

		//Example-4:
		
		char c = '7';
		if (Character.isDigit(c)) {
		    System.out.println(c + " is a digit");
		}else {
			System.out.println("c is not a digit");
		}
		
			    
//In this example, we use the Character.isDigit() method to check if the character '7' is a digit. 
//		Since it is a digit, the message "7 is a digit" is printed.
		
		//Example-5:
		
		int compare=Integer.compare(13, 12);
		System.out.println(compare);
			
	}
	}


