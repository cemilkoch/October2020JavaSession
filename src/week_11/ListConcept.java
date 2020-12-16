package week_11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListConcept {

	public static void main(String[] args) {
		
		List<String> values = new ArrayList<>();
		
		values = new LinkedList<>();
		values.add("John");
		values.add("Smith");
		values.add("Jackson");
		values.add("Lisa");
		
		for (String string : values) {
			System.out.println(string);
		}
		
		values = new Vector<>();
		values.add("Ahmet");
		System.out.println(values);

	}

}
