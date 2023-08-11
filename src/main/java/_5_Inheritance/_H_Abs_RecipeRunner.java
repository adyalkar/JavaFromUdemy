package _5_Inheritance;

public class _H_Abs_RecipeRunner {

	public static void main(String[] args) {
		_F_Abs_RecipeWithManual manual = new _F_Abs_RecipeWithManual();
		_G_Abs_RecipeWithMicrowave microwave = new _G_Abs_RecipeWithMicrowave();
		manual.execute();
		System.out.println("-------------------------------------");
		microwave.execute();

	}

}
