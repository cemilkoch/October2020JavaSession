package week_4;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			if (i >= 3) {
				break; // exits the loop
			}
		}
		
		System.out.println("Odd numbers:");
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				continue; // skips the next statements
			}
			System.out.println(i);
		}
	
	}

}
