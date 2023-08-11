package _4_OOPS_Advanced;

public class _2_FanRunner {

	public static void main(String[] args) {
		_1_Fan fan=new _1_Fan("Usha",0.234,"white");
		System.out.println(fan);// here fan is off 
		fan.setSpeed(30);
        System.out.println(fan);//here fan is ON
		fan.setSpeed(0);
        System.out.println(fan);//here fan is ON



	}

}
