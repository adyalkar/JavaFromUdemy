package _4_OOPS_Advanced;

public class _1_Fan {
	
	//state
	private String make;
	private double radius;
	private String color;
	
	private boolean isOn;
	private int speed;
	
	//constructor
	public _1_Fan(String make,double radius,String color) {
		this.make=make;
		this.radius=radius;
		this.color=color;
	}
	
	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void isOn() {
		if (this.speed>0) {
			this.isOn=true;
			System.out.println("the fan is ON");
		}else {
			this.isOn=false;
			System.out.println("the fan is OFF");
		}
	}
	
	//print the state
	public String toString() {
		isOn();
		return String.format("make is %s , radius is %f ,color is %s ,speed is %d , isOn is %b " , make,radius,color,speed,isOn);
	}

}
