
public class Customer {
	private static int counter = 0;
	
	private String id;
	private Account account;
	private Address address;
	private Phone phone;
	private String email;
	
	
	public Customer() {
		this.id = Integer.toString(counter ++);
		this.account = new Account();
	}
	
	public Account getAccount() {
		return this.account;
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
