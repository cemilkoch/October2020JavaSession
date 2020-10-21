package week_2;

public class BooleanOperators {

	public static void main(String[] args) {
		
		// Boolean == This will store true or false
		
		/*
		 * | or
		 * || or 
		 * & and
		 * && and
		 * == if two variables are equal?
		 * != not equal
		 * ! not
		 * 
		 */
		
		boolean A = false;
		boolean B = true;
		
		System.out.println("A | B = " + (A | B));  // true
		System.out.println("A & B = " + (A & B));  // false
		System.out.println("!A = " + !A);			// t
		System.out.println("A && B = " + (A && B)); // false
		System.out.println("A || B = " + (A || B)); // true
		System.out.println("A == B = " + (A == B)); // false
	}

}
