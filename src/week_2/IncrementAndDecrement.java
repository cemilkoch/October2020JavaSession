package week_2;

public class IncrementAndDecrement {

	public static void main(String[] args) {

		// Increment
		int a = 1;
		// int b = a + 1;
		// int b = ++a;
		++a; // pre - increment
		System.out.println(a);

		// post increment
		int x, y;
		x = 1;
		y = x++; // first assign and then increase
		System.out.println("y = " + y);
		System.out.println("x = " + x);

		// Decrement
		int m = 10;
		int n = --m; // pre-decrement
		System.out.println("n = " + n);

		int c = 5;
		int d = c--; // post decrement
		System.out.println("d = " + d);
		System.out.println("c = " + c);

		int f = 7; // 7 + 8
		f += 8; // f = f + 8
		System.out.println("f = " + f);
		
		f *= 5;
		System.out.println("f = " + f);
		
		f /= 3;
		System.out.println("f = " + f);
		
	}

}
