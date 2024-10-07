import java.time.LocalDate;

public class Account {
	private static int counter = 0;
	
	private String id;
	private Address billing_address;
	private boolean is_closed;
	private LocalDate open;
	private LocalDate closed;
	private ShoppingCart shoppingCart;
	
	public Account() {
		this.id = Integer.toString(counter ++);
		this.open = LocalDate.now();
		this.is_closed = false;
		this.shoppingCart = new ShoppingCart();
	}
	
	public ShoppingCart getShoppingCart() {
		return this.shoppingCart;
	}
	
	public Address getBillingAddress() {
		return this.billing_address;
	}
	
	public boolean getIsClosed() {
		return this.is_closed;
	}
	
	public LocalDate getDateOpen() {
		return this.open;
	}
	
	public LocalDate getDateClosed() {
		return this.closed;
	}
	
	public void setBillingAddress(Address billingAddress) {
		this.billing_address = billingAddress;
	}
	
	public void setIsClosed(boolean isClosed) {
		this.is_closed = isClosed;
	}
	
	public void setDateClosed(LocalDate dateClosed) {
		this.closed = dateClosed;
	}
	
}
