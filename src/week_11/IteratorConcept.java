package week_11;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorConcept {

	public static void main(String[] args) {

		ArrayList<Integer> integers = new ArrayList<>();

		for (int i = 1; i < 11; i++)
			integers.add(i);

		System.out.println(integers);

		Iterator<Integer> itr = integers.iterator();

		// hasNext() check if there is an element
		while (itr.hasNext()) {

			int i = itr.next();

			// move to next element
			System.out.println(i);

			// Remove odd numbers
			if (i % 2 != 0) {
				itr.remove();
			}

		}

		System.out.println(integers);

	}

}
