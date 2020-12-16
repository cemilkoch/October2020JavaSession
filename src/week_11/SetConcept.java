package week_11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetConcept {

	public static void main(String[] args) {
		// Items will not be same as they are inserted
		Set<String> animals = new HashSet<>();

		// Items will be same as they are inserted
		animals = new LinkedHashSet<>();

		// Items is sorted in natural order alphabetically
		animals = new TreeSet<>();

		animals.add("Dog");
		animals.add("Cat");
		animals.add("Bird");
		animals.add("Snake");
		animals.add("Fish");
		animals.add("Dog");
		animals.add("Cat");

		System.out.println(animals);

		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Melon");
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Melon");
		System.out.println(fruits);

		Set<String> fSet = new LinkedHashSet<>(fruits);
		System.out.println(fSet);

	}

}
