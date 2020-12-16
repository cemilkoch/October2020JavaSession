package week_12;

public class ExceptionHandling {

	public static void main(String[] args) {

		int num1, num2;

		try {

			num1 = 9;
			num2 = 62 / num1;
			System.out.println(num2);
			System.out.println("I am in try block");

		} catch (ArithmeticException e) {

			System.out.println("Numbers can not be divisible by 0");

		} catch (Exception e) {
			System.out.println("Exception occured");
		} finally {
			System.out.println("I am in finally block");
		}

		System.out.println("I am out of try-catch");

	}

}
