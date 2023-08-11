package _5_Inheritance;

public class _8_Ex_OverRidingRunner extends _7_Ex_OverRiding {
	
	private int radius;

    public _8_Ex_OverRidingRunner(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    // Method overriding with a different implementation
    @Override
    public void draw(int x, int y) {
        System.out.println("Circle " + super.name + " with radius " + radius + " is drawn at coordinates (" + x + ", " + y + ")");
        super.demo();
    }
    
    public static void main(String[] args) {
    	_7_Ex_OverRiding _7_ = new _7_Ex_OverRiding("Generic Shape");
    	_8_Ex_OverRidingRunner _8_ = new _8_Ex_OverRidingRunner("Circle", 5);

        _7_.draw(10, 20); //super class  // Output: Generic Shape is drawn at coordinates (10, 20)
        _8_.draw(30, 40); //sub class // Output: Circle with radius 5 is drawn at coordinates (30, 40)
	}

}
