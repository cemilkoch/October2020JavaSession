package week_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ListIteratorConcept {

	public static void main(String[] args) {

		ArrayList<String> names;
		names = new ArrayList<>(Arrays.asList("Michael", "John", "Arthur", "Lisa"));

		ListIterator<String> itr = names.listIterator();

		// forward direction
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println();

		// backward direction
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}
