package week_2;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "I love Python";
		String str2 = "and I hate Java";

		System.out.println(str + " " + str2);

		// length() is used to find the length
		System.out.println(str.length());

		// charAt()
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(8));

		// indexOf() == to find character index
		System.out.println(str2.indexOf("I"));
		System.out.println(str2.indexOf("a", 3));
		System.out.println(str2.lastIndexOf("a"));

		// trim() is used to remove white space before and after a string
		String str3 = "         Hello World        ";
		System.out.println(str3);
		System.out.println(str3.trim());

		// replace is used to replace characters
		String date = "01-01-2005";
		System.out.println(date.replace("-", "/"));

		String name = "my name is CEMIL";
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());

		// substring to get specific character(s) from current string
		String account = "Your total is $2500";
		System.out.println(account.indexOf("$"));
		System.out.println(account.substring(14));
		System.out.println(account.substring(5, 10));

		// split()
		String language = "Java-Python-Ruby-Groovy"; // JavaPythonRubyGroovy
		String languges[] = language.split("-");
		for (String string : languges) {
			System.out.print(string);
		}

		System.out.println();
		
		String libraries = "textxXseleniumxXjavaxXtestng"; // textseleniumjavatestng
		
		
		// startsWith - endsWith
		String str4 = "Hello Java";
		System.out.println(str4.startsWith("Hello"));
		System.out.println(str4.endsWith("va"));

	}

}
