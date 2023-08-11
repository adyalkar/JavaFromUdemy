package _5_Inheritance;

//Implementation class
public class _K_Interface_Car implements _I_Interface_Vehicle, _J_Interface_ElectricVehicle {
	
	//State
	private boolean isRunning;
    private double fuelEfficiency;
    
    //constructor
	public _K_Interface_Car( double fuelEfficiency) {
		this.fuelEfficiency = fuelEfficiency;
	}

	@Override
	public void charge() {
		System.out.println("Charging the electric car.");
		
	}

	@Override
	public void start() {
		isRunning = true;
        System.out.println("Car started.");
		
	}

	@Override
	public void stop() {
		isRunning = false;
        System.out.println("Car stopped.");
		
	}

	@Override
	public double getFuelEfficiency() {
		 return fuelEfficiency;
	}

}
