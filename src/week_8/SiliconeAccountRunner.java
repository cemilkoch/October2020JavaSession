package week_8;

public class SiliconeAccountRunner {

	public static void main(String[] args) {

		SiliconeAccount account1 = new SiliconeAccount();
		account1.setEmail("adam@gmail.com");
		account1.setFirstName("Adam");
		account1.setPassword("adam1234");

		System.out.println(account1.getAccountInformation());

		SiliconeAccount account2 = new SiliconeAccount();
		account2.setAccountInformation("cemil@gmail.com", "Cemil", "qwert1234");
		System.out.println(account2.getAccountInformation());

	}

}
