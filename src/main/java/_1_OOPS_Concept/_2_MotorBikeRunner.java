package _1_OOPS_Concept;

public class _2_MotorBikeRunner {

	public static void main(String[] args) {
	_2_MotorBike pulser = new _2_MotorBike();
	_2_MotorBike activa = new _2_MotorBike();
	
	pulser.start();
	activa.start();	
	
	// state of an object may change in its life time
	pulser.speed= 100;
	activa.speed= 80;
 
	System.out.println("When pulser started :"+pulser.speed);
	System.out.println("When activa started :"+activa.speed);

//	//Due to taffic speed changed 
	pulser.speed= 20;
	activa.speed= 0;
	
	System.out.println("change in pulser speed due to traffic :"+pulser.speed);
	System.out.println("change in activa speed due to traffic :"+activa.speed);

	pulser.stop();
	activa.stop();
	
	}

}
