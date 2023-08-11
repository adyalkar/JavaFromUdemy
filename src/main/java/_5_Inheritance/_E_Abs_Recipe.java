package _5_Inheritance;

//abstract class
abstract class _E_Abs_Recipe {
	//Initial preparation
	//Actual dish preparation
	//cleanup
	
	abstract void preparation ();
	abstract void doDish ();
	abstract void cleanUp ();
	
	public  void execute() {
		preparation ();
		doDish ();
		cleanUp ();		
	}
}
