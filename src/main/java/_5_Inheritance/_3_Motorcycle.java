package _5_Inheritance;

//Sub-Class

public class _3_Motorcycle extends _1_Vehicle {
	private boolean hasSideCar;

    public _3_Motorcycle(String brand, String model, int year, boolean hasSideCar) {
        super(brand, model, year);
        this.hasSideCar = hasSideCar;
    }

    // Additional method specific to Motorcycle
    public void wheelie() {
        System.out.println("Motorcycle is doing a wheelie!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + hasSideCar);
    }
	

}
