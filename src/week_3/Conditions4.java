package week_3;

import java.util.Scanner;

public class Conditions4 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*********************");
		System.out.println("1. Addition " + 
						   "\n2. Subtraction " +
						   "\n3. Multiplication " +
						   "\n4. Division");
		System.out.println("**********************");
		System.out.println("Please select a math operator");
		
		String operator = scanner.nextLine();
		
		System.out.println("Enter first number");
		int a = scanner.nextInt();
		
		System.out.println("Enter second number");
		int b = scanner.nextInt();
		
		
		switch (operator) {
		case "1":
			System.out.println("Addition: " + (a + b));
			break;
		case "2":
			System.out.println("Subtraction: " + (a - b));
			break;
		case "3":
			System.out.println("Multiplication: " + (a * b));
			break;
		case "4":
			System.out.println("Division: " + (a / b));
		default:
			System.out.println("Invalid math operator");
		}

	}

}
