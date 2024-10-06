
public class Customer {
	private static int counter = 0;
	
	private String id;
	private Account account;
	private WebUser webUser;
	private Address address;
	private Phone phone;
	private String email;
	
	
	public Customer() {
		this.id = Integer.toString(counter ++);
		this.account = new Account();
		this.webUser = null;
	}
	
	public Customer(WebUser webUser) {
		this.id = Integer.toString(counter ++);
		this.account = new Account();
		this.webUser = webUser;
	}
	
	public Account getAccount() {
		return this.account;
	}
	
	public WebUser getWebUser() {
		return this.webUser;
	}
	
	public void setWebUser(WebUser webUser) {
		this.webUser = webUser;
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
