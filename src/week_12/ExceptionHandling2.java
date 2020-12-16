package week_12;

public class ExceptionHandling2 {

	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println(i);
		}

		myMethod();

	}

	public static void sleepMyCode() throws InterruptedException {
		Thread.sleep(1000);
	}

	static void myMethod() {
		int num1, num2;
		try {

			num1 = 0;
			num2 = 62 / num1;
			System.out.println(num2);
			System.out.println("I am in try block");

		} catch (ArithmeticException e) {
			throw new ArithmeticException("The number value is incorrect");
		}

	}

}
