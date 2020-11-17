package week_7;

public class OverloadingConcept {

	// Overloading is using same method name but different parameters

	public void login() {
		System.out.println("0 parameters login method");
	}

	public void login(String username) {
		System.out.println("Login with " + username);
	}

	public void login(String username, String pasword) {
		System.out.println("Login with " + username);
		System.out.println("Login with " + pasword);
	}

	public static void main(String[] args) {

		OverloadingConcept oc = new OverloadingConcept();
		oc.login();
		oc.login("admin");
		oc.login("admin", "admin123");

	}

}
