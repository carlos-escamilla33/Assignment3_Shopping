
public class Customer {
	private static int counter = 0;
	private int id;
	private String address;
	private String phone;
	private String email;
	
	
	Customer() {
		this.id = counter ++;
	}
	
	public int getCustomerId() {
		return id;
	}
}
