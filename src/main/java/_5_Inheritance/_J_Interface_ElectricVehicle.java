package _5_Inheritance;

public interface _J_Interface_ElectricVehicle  {
	void charge();
	
	default void demo() {
		System.out.println("From java 8 onwards , default method is supported in interface");
	}

}
