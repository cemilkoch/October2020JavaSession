package week_4;

import java.util.Scanner;



public class WhileLoop2 {

	public static void main(String[] args) {
		
		// Fibonacci numbers
		// starts with 0 and 1
		// sequence 0, 1, 1, 2, 3, 5, 8, 13 ...
		Scanner scanner = new Scanner(System.in);
		int limit = scanner.nextInt();
		
		int num1 = 0;
		int num2 = 1;
		
		int i = 1;
		while(i <= limit) {
			if(i == limit) {
				System.out.print(num1);
				break;
			}
			
			System.out.print(num1 + ", ");  
			int temp = num1 + num2; 
			num1 = num2; 
			num2 = temp; 
			i++;
		}
		
		
		

	}

}
