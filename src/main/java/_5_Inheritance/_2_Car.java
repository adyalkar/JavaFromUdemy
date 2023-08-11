package _5_Inheritance;

//Sub-Class
public class _2_Car extends _1_Vehicle {
	private int numDoors;

    public _2_Car(String brand, String model, int year, int numDoors) {
        super(brand, model, year);
        this.numDoors = numDoors;
    }

    // Additional method specific to Car
    public void drive() {
        System.out.println("Car is driving...");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }

}
