package week_5;

public class ArrayConcept {

	public static void main(String[] args) {

		// Array : Create a single variable, store multiple values

		// Limitations:
		// 1. static array : size is fixed
		// 2. cannot store different data types

		int a[] = new int[4];
		a[0] = 10; // lowest
		a[1] = 20;
		a[2] = 30;
		a[3] = 40; // highest

		// length
		System.out.println(a.length);

		// print specific value from array
		System.out.println(a[0]);
		System.out.println(a[3]);
		// System.out.println(a[4]); ArrayIndexOutofBoundsException

		// regular loop
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("\nFor Each Loop: ");
		// for each loop
		for (int number : a) {
			System.out.println(number);
		}

		double d[] = new double[2];
		d[0] = 14.33;
		d[1] = 15.32;

		double d2[] = { 14.33, 15.32 };

		// Can you pass negative number as an array size?
		// int [] array = new int [-6];
		// java.lang.NegativeArraySizeException

		String str[] = new String[4];
		str[0] = "Java";
		str[1] = "Python";
		str[2] = "Groovy";
		str[3] = "SQL";

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("Java"))
				System.out.println("I hate " + str[i]);
			else
				System.out.println("I love " + str[i]);
		}
	}

}
