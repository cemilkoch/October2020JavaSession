package week_3;

public class StringConcatination {

	public static void main(String[] args) {

		// Combining two strings together (+)
		String firstName = "Michael";
		String lastName = "Jackson";

		System.out.println(firstName + " " + lastName);

		String str = 20 + 40 + "Java" + 70 + 60;
		System.out.println(str);

		int x = 100;
		int y = 200;

		String m = "Hello";
		String n = " world";

		System.out.println(x + y); // 300
		System.out.println(m + n); // Hello world
		System.out.println(x + m + n); // 100Hello world
		System.out.println(x + y + m + n); // 300Hello world
		System.out.println(m + n + x + y); // Hello world100200

	}

}
