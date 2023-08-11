package _5_Inheritance;

public class _B_Upcasting_2 extends _A_Upcasting_1{
	
	@Override
    void record_1() {
        System.out.println("Override Records_1 from Upcasting_1");
    }

    void record_2() {
        System.out.println("Records_2 from Upcasting_2");
    }
	
    public static void main(String[] args) {
    	_B_Upcasting_2 _2_ = new _B_Upcasting_2();
    	_2_.record_1(); // "Override Records from Upcasting_1"
    	_2_.record_2(); // "Records from Upcasting_2"
    	_2_.demo();
    	
    	System.out.println("------------------------------------------------");
    	
    	_A_Upcasting_1 demo = new _A_Upcasting_1();
    	demo.demo();

    	System.out.println("------------------------------------------------");

         // Upcasting: Assigning _B_Upcasting_2 object to _A_Upcasting_1 reference
    	_A_Upcasting_1 _1_= new _B_Upcasting_2();

         _1_.record_1(); // "Override Records from Upcasting_1"
         _1_.demo(); 
        // _1_.record_2(); //The method record_2() is undefined for the type _A_Upcasting_1
     }
	
}
