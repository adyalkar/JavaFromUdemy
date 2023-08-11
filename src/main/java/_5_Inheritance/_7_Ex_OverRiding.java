package _5_Inheritance;

//Super class
public class _7_Ex_OverRiding {
	
	 protected String name;
	 //In Java, private fields are accessible only within the class 
	 //where they are declared and not in any subclasses.

	    public _7_Ex_OverRiding(String name) {
	        this.name = name;
	    }

	    // Method in the superclass with arguments
	    public void draw(int x, int y) {
	        System.out.println(name + " is drawn at coordinates (" + x + ", " + y + ")");
	    }
	    
	    public void demo() {
	    	System.out.println("Example of Super Keyword");
	    }
	
	

}
