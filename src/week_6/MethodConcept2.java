package week_6;

import java.util.Scanner;

public class MethodConcept2 {

	/**
	 * This method prints time with the given hour and minute
	 * 
	 * @param hour
	 * @param minute
	 */
	public static void printTime(int hour, int minute) {
		System.out.print(hour);
		System.out.print(":");
		System.out.println(minute);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hour = scanner.nextInt();
		int minute = scanner.nextInt();

		printTime(hour, minute);

	}

}
