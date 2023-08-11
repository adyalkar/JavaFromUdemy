package _5_Inheritance;

public class _M_Interface_Runner {
	
	public static void main(String[] args) {
		
		//Upcasting
		_I_Interface_Vehicle car = new _K_Interface_Car(12.5);
		_I_Interface_Vehicle bicycle = new _L_Interface_Bicycle();
		
		car.start();
        System.out.println("Car fuel efficiency: " + car.getFuelEfficiency());
		car.stop();
        
        bicycle.start();
        System.out.println("Bicycle fuel efficiency: " + bicycle.getFuelEfficiency());
        bicycle.stop();
        
        
        //Downcasting
        if (car instanceof _J_Interface_ElectricVehicle) {
        	_J_Interface_ElectricVehicle electricCar = (_J_Interface_ElectricVehicle) car;
            electricCar.charge();
            electricCar.demo();
        } else {
            System.out.println("The car is not an electric vehicle.");
        }
        
        if (bicycle instanceof _J_Interface_ElectricVehicle) {
        	_J_Interface_ElectricVehicle electricBicycle = (_J_Interface_ElectricVehicle) bicycle;
        	electricBicycle.charge();
        } else {
            System.out.println("The bicycle is not an electric vehicle.");
        }
        
        //Exception in thread "main" java.lang.ClassCastException: class _5_Inheritance._L_Interface_Bicycle cannot be cast to class _5_Inheritance._J_Interface_ElectricVehicle (_5_Inheritance._L_Interface_Bicycle and _5_Inheritance._J_Interface_ElectricVehicle are in unnamed module of loader 'app')
    	//at _5_Inheritance._M_Interface_Runner.main(_M_Interface_Runner.java:29)
        
        	_J_Interface_ElectricVehicle electricBicycle = (_J_Interface_ElectricVehicle) bicycle;
        	electricBicycle.charge();
       
		
	}

}
