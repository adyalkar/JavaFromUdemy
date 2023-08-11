package _4_OOPS_Advanced;

// This is Object Composition
public class _5_Customer {
	private String name;
	private _7_Address homeAddress;
	private _7_Address workAddress;
	
	public _5_Customer(String name, _7_Address homeAddress) {
		super();
		this.name = name;
		this.homeAddress = homeAddress;
	}
	

	public _7_Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(_7_Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public _7_Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(_7_Address workAddress) {
		this.workAddress = workAddress;
	}


	@Override
	public String toString() {
		return "_5_Customer [name=" + name + ", homeAddress=" + homeAddress + ", workAddress=" + workAddress + "]";
	}
	
	
	
	


}
