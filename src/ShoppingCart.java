import java.time.*;

public class ShoppingCart {
	private LocalDate created;
	
	
	public ShoppingCart() {
		this.created = LocalDate.now();
	}
	
	public LocalDate getDateCreated() {
		return this.created;
	}
}
