package _1_OOPS_Concept;

public class _4_ConstructorRunner {

	public static void main(String[] args) {

		_4_Constructor pulser = new _4_Constructor(100,2010);
		_4_Constructor activa = new _4_Constructor(20,2012);
		_4_Constructor defaultConstructor = new _4_Constructor();
		
		System.out.println("Base speed of pulser : "+ pulser.getSpeed());
		System.out.println("Base speed of pulser : "+ activa.getSpeed());
		
		System.out.println("Make year of pulser : "+ pulser.getMakeYear());
		System.out.println("Make year of pulser : "+ activa.getMakeYear());
	}

}
