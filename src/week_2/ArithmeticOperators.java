package week_2;


public class ArithmeticOperators {

	public static void main(String[] args) {

		int a = 10;
		int b = 25;

		double x = 10.5;
		double y = 20.5;

		// Addition +
		System.out.println("Addition");
		System.out.println("a + b = " + (a + b));
		System.out.println("x + y = " + (x + y));

		// Subtraction -
		System.out.println("\nSubtraction"); // \n newline
		System.out.println("a - b = " + (a - b));
		System.out.println("x - y = " + (x - y));

		// Multiplication *
		System.out.println("\nMultiplication");
		System.out.println("a * b = " + (a * b));
		System.out.println("x * y = " + (x * y));

		// Division /
		System.out.println("\nDivision");
		System.out.println("a / b = " + (a / b));
		System.out.println("x / y = " + (x / y));

		// Modulus == remainder %
		System.out.println("\nModulus");
		System.out.println("a % b = " + (a % b));
		System.out.println("x % y = " + (x % y));
		
		// Arithmetic with two different data Types
		System.out.println("\na + x = " + (a + x));
		
		// Power of a number
		System.out.println("2 ^ 3 = " + Math.pow(2, 3));
		

	}

}
