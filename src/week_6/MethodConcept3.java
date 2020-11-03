package week_6;

public class MethodConcept3 {

	/**
	 * 
	 * @param a int
	 * @param b int 
	 * @param c int
	 * @return
	 */
	public static int calculate(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		int number1 = 20;
		int number2 = 25;
		int number3 = 40;

		System.out.println("Sum of numbers : " + calculate(number1, number2, number3));

	}

}
