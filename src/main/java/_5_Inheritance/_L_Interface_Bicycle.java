package _5_Inheritance;

public class _L_Interface_Bicycle implements _I_Interface_Vehicle{

	@Override
	public void start() {
		System.out.println("Bicycle started.");		
	}

	@Override
	public void stop() {
        System.out.println("Bicycle stopped.");
		
	}

	@Override
	public double getFuelEfficiency() {
        return Double.POSITIVE_INFINITY; // Infinite fuel efficiency (no fuel required for a bicycle)

	}

}
