package _1_OOPS_Concept;
//Encapsulation: Encapsulation is the practice of hiding the implementation 
//details of an object from the outside world. It is achieved in Java by using access modifiers 
//such as private, protected, and public.

public class _3_Encapsulation {

	private int speed;
	private int makeYear;
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed < 0) {
			System.out.println("Invalid speed");
		}else {
		this.speed = speed;
		}
	}

	public int getMakeYear() {
		return makeYear;
	}

	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}

	void start() {
		System.out.println("Bike has started");
	}
	
	void stop() {
		System.out.println("Bike is stopped");
	}
	
	public void increaseSpeed(int byHowMuch) {
		this.speed = this.speed + byHowMuch;
	}
	
	
}
