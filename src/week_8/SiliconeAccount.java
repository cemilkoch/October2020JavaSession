package week_8;

public class SiliconeAccount {

	private String email;
	private String firstName;
	private String password;

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setPassword(String password) {
		if (password.length() < 8) {
			System.out.println("Password must be at least 8 characters");
		} else {
			this.password = password;
		}
	}

	public String getAccountInformation() {
		return "username: " + this.email + " | " + "firstname: " + this.firstName + " | " + "password: "
				+ this.password;
	}
	
	public void setAccountInformation(String email, String firstname, String password) {
		this.email = email;
		this.firstName = firstname;
		setPassword(password);
	}

}
