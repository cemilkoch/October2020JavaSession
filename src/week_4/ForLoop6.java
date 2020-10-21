package week_4;

public class ForLoop6 {

	public static void main(String[] args) {

		// 1 - 20 (Included)
		// Print all the numbers
		// if number is is divisible by 5 print hey!

		for (int i = 1; i <= 20; i++) {
			if (i % 5 == 0) {
				System.out.println("hey!");
			}else {
				System.out.println(i);
			}
		}
		
	}

}
