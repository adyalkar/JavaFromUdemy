package _5_Inheritance;

public class _D_Downcasting_2 extends _C_Downcasting_1 {
	
	@Override
    void record_1() {
        System.out.println("Override Records_1 from Downcasting_1");
    }

    void record_2() {
        System.out.println("Records_2 from Downcasting_2");
    }
    
    public static void main(String[] args) {
    	//Upcasting 
    	_C_Downcasting_1 superr=new _D_Downcasting_2();
    	
    	//Downcasting
    	_D_Downcasting_2 sub=(_D_Downcasting_2) superr;
    	
    	//Downcasting : This is safe downcasting
    	//here Checking if the object is an instance of _D_Downcasting_2
    	if(superr instanceof _D_Downcasting_2) {
    		_D_Downcasting_2 subb=(_D_Downcasting_2) superr;
    		subb.record_1();
    		subb.record_2();
    		subb.demo();
    	}
    	
    	
		//Downcasting is similar to creating an object of sub class wrt subclass
	}

}
