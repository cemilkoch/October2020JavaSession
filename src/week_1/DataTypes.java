package week_1;

public class DataTypes {

	public static void main(String[] args) {

		// Primitive Data Types

		// int == numeric 4 bytes

		int i = 10;

		// int is data type
		// i variable name
		// = assignment operator
		// 10 is value

		i = 20;
		System.out.println(i);

		i = 30;

		System.out.println(i);

		// byte numeric type -128 to 127
		byte b1 = 10;
		byte b2 = 25;
		byte number = 127;

		System.out.println(number);

		byte largestNumber = Byte.MAX_VALUE;
		System.out.println(largestNumber);

		// short is 2 bytes
		short s1 = 1100;
		short largestShort = Short.MAX_VALUE;
		System.out.println(largestShort);

		// long is 8 bytes
		long l1 = 1000000;
		System.out.println(l1);

		// float 4 bytes
		float f1 = 10.55f;
		float f2 = (float) 10.55;

		// double 8 bytes
		double d1 = 23.4555555;

		// char 2 bytes

		char c1 = 'a';
		System.out.println(c1);
		char c2 = '@';
		char c3 = '1';
		char c4 = 67;
		System.out.println(c4);

		// boolean 1 byte true or false
		boolean b11 = true;
		boolean b22 = false;

		// String
		String string = "Hello World!";
		System.out.println(string);

	}

}
