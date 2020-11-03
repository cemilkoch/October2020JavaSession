package week_6;

public class MethodConcept {

	// void method == no return
	public static void newLine() {
		System.out.println();
	}

	// void method == no return
	public static void threeLine() {
		newLine();
		newLine();
		newLine();
	}

	// non-void method
	public static String google() {
		return "Google is a company in Cali";
	}

	// non static
	// non-void
	public String kaplan() {
		return "Kaplan is a language school";
	}

	public static void main(String[] args) {

		MethodConcept mc = new MethodConcept();
		System.out.println(mc.kaplan());

		// String company = google();
		System.out.println(google());

		System.out.println("First Line");
		threeLine();
		System.out.println("Second Line");
	}

}
