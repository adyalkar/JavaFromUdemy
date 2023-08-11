package _5_Inheritance;

public class _6_Ex_OverLoading {
	
	 public int add(int a, int b) {
	        return a + b;
	    }

	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }
	    
	    public int multiply(int a, int b) {
	        return a * b;
	    }

	    public double multiply(double a, double b) {
	        return a * b;
	    }
	    
	    public static void main(String[] args) {
	    	_6_Ex_OverLoading calculator = new _6_Ex_OverLoading();
	    	int sum_1=calculator.add(10, 20);
	    	System.out.println("Addition of 2 digits : " + sum_1);
	    	
	    	int sum_2=calculator.add(10, 20, 30);
	    	System.out.println("Addition of 3 digits : " + sum_2);
	    	
	    	int Multiply_1=calculator.multiply(10, 20);
	    	System.out.println("Multiplication of 2 digits : " + Multiply_1);
	    	
	    	double Multiply_2=calculator.multiply(20.5, 30.5);
	    	System.out.println("Multiplication of 2 double digits : " + Multiply_2);
			
		}

}
