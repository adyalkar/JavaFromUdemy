package _5_Inheritance;

//Concrete Class
public class _F_Abs_RecipeWithManual extends _E_Abs_Recipe {

	@Override
	void preparation() {
		System.out.println("Get the Raw material");
		System.out.println("Get the Utensils");		
	}

	@Override
	void doDish() {
		System.out.println("Do the actual dish");		
	}

	@Override
	void cleanUp() {
		System.out.println("Clean up all the utensils");		
	}

}
