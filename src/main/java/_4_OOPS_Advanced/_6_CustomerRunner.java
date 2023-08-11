package _4_OOPS_Advanced;

public class _6_CustomerRunner {

	public static void main(String[] args) {
		_7_Address homeAddress = new _7_Address("Manish Nagar", "Nagpur", 440015);
		_7_Address workAddress = new _7_Address("Rabale", "Mumbai", 400700);

		_5_Customer customer = new _5_Customer("Anup",homeAddress);
		customer.setWorkAddress(workAddress);
		// workAddress is not set then it will be "null" in toString method
		
		System.out.println(customer);
		

	}

}
