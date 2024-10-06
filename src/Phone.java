
public class Phone {
	private String areaCode;
	private String phoneNumber;
	
	Phone(String areaCode, String phoneNumber) {
		this.areaCode = areaCode;
		this.phoneNumber = phoneNumber;
	}
	
	public String getAreaCode() {
		return this.areaCode;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
