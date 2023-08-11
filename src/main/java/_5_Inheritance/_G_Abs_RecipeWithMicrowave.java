package _5_Inheritance;

//Concrete Class

public class _G_Abs_RecipeWithMicrowave extends _E_Abs_Recipe {

	@Override
	void preparation() {
		System.out.println("Get the Raw material");
		System.out.println("Switch ON the microwave");
		
	}

	@Override
	void doDish() {
		System.out.println("Do the actual dish");
		
	}

	@Override
	void cleanUp() {
		System.out.println("Clean up all the utensils");
		System.out.println("Switch OFF the microwave");		
	}

}
