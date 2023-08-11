package _5_Inheritance;

public class _4_RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_2_Car car = new _2_Car("Toyota", "Corolla", 2021, 4);
        car.displayInfo();
        car.drive();

        System.out.println("\n");

        _3_Motorcycle motorcycle = new _3_Motorcycle("Harley-Davidson", "Roadster", 2020, false);
        motorcycle.displayInfo();
        motorcycle.wheelie();
    }

	}


