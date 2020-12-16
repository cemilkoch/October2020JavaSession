package week_12;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		
		
		Object no = null;
		ArrayList<String> arr = null;
		
		try {
			System.out.println(arr.toString());
			System.out.println(no.toString());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		int [] intArr = {0, 1, 2};
		
		try {
			System.out.println(intArr[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter an integer: ");
			int number = scanner.nextInt();
			System.out.println(number);
		} catch (InputMismatchException e) {
			System.out.println("Incorrect input");
		}
		
	}

}
