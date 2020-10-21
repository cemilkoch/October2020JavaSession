package week_3;

import java.util.Scanner;

public class Conditions3 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a grade in letter format (A - F)");
		
		String grade = scanner.nextLine();
		
		// A == Awesome
		// B == Good
		// C == Not bad
		// other letters == Failed
		
		switch (grade.toUpperCase()) {
		case "A":
			System.out.println("Awesome");
			break;
			
		case "B":
			System.out.println("Good");
			break;
		
		case "C":
			System.out.println("Not Bad");
			break;

		default:
			System.out.println("Failed");
			break;
		}
		

	}

}
