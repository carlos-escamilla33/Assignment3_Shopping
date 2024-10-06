
public class Customer {
	private static int counter = 0;
	
	private String id;
	private Address address;
	private Phone phone;
	private String email;
	
	
	Customer() {
		this.id = Integer.toString(counter ++);
	}
	
	public String getCustomerId() {
		return id;
	}
	
	public Address getAddress() {
		return this.address;
	}
	
	public Phone getPhone() {
		return this.phone;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
