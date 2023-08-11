package _1_OOPS_Concept;

//In Java, a constructor is a special method that has the same name as the class and is used to create and initialize objects of that class.
//Constructors are called automatically when an object is created using the new keyword.

//The main purpose of a constructor is to initialize the object's state or instance variables. When a new object is created, it may need to be initialized with certain default values or values provided by the user. 
//Constructors are used to provide this initialization.

//Constructors can have parameters or they can be parameterless. When a constructor has parameters, they are used to pass values to initialize the instance variables of the object being created. 
//If no constructors are defined in a class, a default constructor is created by the compiler which initializes all the instance variables with their default values.

//Constructors can also be overloaded, which means that multiple constructors can be defined with different parameter lists. 
//This allows for flexibility when creating objects of a class, and enables objects to be created with different initial values depending on the requirements.

//It is important to note that constructors do not have a return type, not even void. The job of a constructor is to initialize the object, not to return a value.

public class _4_Constructor {
	
	private int speed;
	private int makeYear;
	
	
	_4_Constructor(){
		
	}
	
	 _4_Constructor(int speed, int makeYear) {
		super();
		this.speed = speed;
		this.makeYear = makeYear;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getMakeYear() {
		return makeYear;
	}
	
	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}
	
	

}
