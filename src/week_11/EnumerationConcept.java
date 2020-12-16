package week_11;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationConcept {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();

		for (int i = 1; i < 11; i++)
			v.add(i);
		System.out.println(v);

		Enumeration<Integer> en = v.elements();

		// checking if there is element
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

	}

}
