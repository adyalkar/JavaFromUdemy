package _1_OOPS_Concept;

public class _3_EncapsulationRunner {

	public static void main(String[] args) {

		_3_Encapsulation pulser = new _3_Encapsulation();
		_3_Encapsulation activa = new _3_Encapsulation();
		
		pulser.start();
		activa.start();
		
		// set the initial speed
		pulser.setSpeed(100);
		activa.setSpeed(20);
		
		System.out.println("Initial Speed of pulser : "+pulser.getSpeed());//100
		System.out.println("Initial Speed of activa : "+activa.getSpeed());//20
		
		// get the initial speed and increase it by 100
		
		int finalPulserSpeed = pulser.getSpeed() + 100 ;//200
		int finalActivaSpeed = activa.getSpeed() +100 ;//120
		
		pulser.setSpeed(finalPulserSpeed);//200
		activa.setSpeed(finalActivaSpeed);//120
		
		System.out.println("Final Speed of pulser : "+pulser.getSpeed());//200
		System.out.println("Final Speed of activa : "+activa.getSpeed());//120
		
		// Increase speed using creating separate Method
		pulser.increaseSpeed(20);
		activa.increaseSpeed(20);
		
		System.out.println("Final Speed of pulser using separate Method : "+pulser.getSpeed());//220
		System.out.println("Final Speed of activa using separate Method: "+activa.getSpeed());//140
		
		pulser.stop();
		activa.stop();
		
		pulser.setMakeYear(2010);
		activa.setMakeYear(2012);
		
		System.out.println("Make year of pulser : "+pulser.getMakeYear());
		System.out.println("Make year of activa : "+activa.getMakeYear());

	}

}
