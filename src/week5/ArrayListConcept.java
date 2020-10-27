package week5;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListConcept {

	public static void main(String[] args) {

		// String Array List
		ArrayList<String> nameList = new ArrayList<>();

		// Int Array List
		ArrayList<Integer> intList = new ArrayList<>();

		nameList.add("Steve");
		nameList.add("Mehmet");
		nameList.add("Michael");
		nameList.add("Lucy");

		System.out.println(nameList);

		nameList.add(3, "Ilhan");

		System.out.println(nameList);

		// Changing element in array list
		nameList.set(2, "Jack");

		System.out.println(nameList);

		// Removing element from array list
		nameList.remove("Steve");
		nameList.remove(3);

		System.out.println(nameList);

		// print all the element using for each
		for (String temp : nameList) {
			System.out.println(temp);
		}

		// get() method
		System.out.println(nameList.get(2));

		// Sort Method to sort alphabetically
		Collections.sort(nameList, Collections.reverseOrder());

		System.out.println("\nAfter sorting:");

		System.out.println(nameList);

		intList.add(10);
		intList.add(5);
		intList.add(50);
		intList.add(3);
		intList.add(9);
		intList.add(15);

		Collections.sort(intList);
		System.out.println("Min value for intList :: " + intList.get(0));
		System.out.println("Max value for intList :: " + intList.get(intList.size() - 1));

	}

}
