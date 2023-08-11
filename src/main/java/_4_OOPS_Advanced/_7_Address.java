package _4_OOPS_Advanced;

public class _7_Address {
	private String line1;
	private String city;
	private int pinCode;
	
	public _7_Address(String line1, String city, int pinCode) {
		super();
		this.line1 = line1;
		this.city = city;
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "_7_Address [line1=" + line1 + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	
	

}
