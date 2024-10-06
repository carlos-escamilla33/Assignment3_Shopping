
public class WebUser extends Customer{
	private static int id = 0;
	// enum defined inside the Customer Class
	public enum UserState {
			New,
			Active,
			Blocked, 
			Banned
	}
	
	private int login_id;
	private String password;
	private UserState state;
	
	WebUser() {
		this.login_id = id ++;
	}
}
