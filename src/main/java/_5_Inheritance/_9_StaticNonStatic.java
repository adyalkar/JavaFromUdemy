package _5_Inheritance;

public class _9_StaticNonStatic {
	
	// Static variable
    static int staticVariable;

    // Instance variable
    int instanceVariable;

    // Static method
    static void staticMethod() {
        System.out.println("Static method called");
        System.out.println("Static variable : "+ staticVariable);
        // System.out.println(instanceVariable); // Error: Cannot access instance variable in static method
    }

    // Instance method
    void instanceMethod() {
        System.out.println("Instance method called");
        System.out.println("Static variable : "+ staticVariable);
        System.out.println("Instance variable: " + this.instanceVariable); // Using 'this' keyword to refer to the instance variable
    }
    
    public static void main(String[] args) {
    	_9_StaticNonStatic.staticVariable = 10;

    	_9_StaticNonStatic myObj1 = new _9_StaticNonStatic();
        myObj1.instanceVariable = 20;

        _9_StaticNonStatic.staticMethod(); // Output: Static method called
        myObj1.instanceMethod(); // Output: Instance method called, Instance variable: 20
    }
		
	}


