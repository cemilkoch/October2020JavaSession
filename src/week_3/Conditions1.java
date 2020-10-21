package week_3;

public class Conditions1 {

	public static void main(String[] args) {

		/*
		 * FIZZBUZZ if number is divisible by 3 print FIZZ if number is divisible by 5
		 * print BUZZ if number is divisible by 5 and 3 print FIZZBUZZ else print the
		 * number itself
		 */

		int number = 13;

		if (number % 3 == 0 && number % 5 == 0) {
			System.out.println("FIZZBUZZ");
		} else if (number % 3 == 0) {
			System.out.println("FIZZ");
		} else if (number % 5 == 0) {
			System.out.println("BUZZ");
		} else {
			System.out.println(number);
		}

	}

}
