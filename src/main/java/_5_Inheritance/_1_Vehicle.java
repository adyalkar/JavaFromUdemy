package _5_Inheritance;

//Base class (Superclass) - Vehicle

public class _1_Vehicle {
	
	private String brand;
	private String model;
	private int year;

    public _1_Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

}
