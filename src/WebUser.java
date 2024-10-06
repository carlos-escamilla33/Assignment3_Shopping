
public class WebUser extends Customer{
	private static int id = 0;
	// enum defined inside the Customer Class
	public enum UserState {
			New,
			Active,
			Blocked, 
			Banned
	}
	
	private String login_id;
	private String password;
	private UserState state;
	
	public WebUser() {
		this.login_id = Integer.toString(id ++);
		this.state = UserState.Active;
	}
	
	public String getLoginId() {
		return this.login_id;
	}
	
	public UserState getState() {
		return this.state;
	}
}
