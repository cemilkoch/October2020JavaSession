package week_4;

public class ForLoop2 {

	public static void main(String[] args) {

		// Write a program to calculate sum of all numbers between 1 to 5(included)

		// System.out.println(1 + 2 + 3 + 4 + 5);

		int add = 0;

		for (int i = 1; i < 6; i++) {
			// add = add + i;
			add += i;
		}

		System.out.println("Addition is : " + add);
	}

}
