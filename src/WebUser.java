
public class WebUser extends Customer{
	private static int id = 0;
	
	private String login_id;
	private String password;
	private UserState state;
	
	public WebUser() {
		this.login_id = Integer.toString(id ++);
		this.state = UserState.Active;
		this.password = null;
	}
	
	public String getLoginId() {
		return this.login_id;
	}
	
	public UserState getState() {
		return this.state;
	}
	
	public void setState(UserState state) {
		this.state = state;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
