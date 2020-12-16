package week_11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

public class MapConcept {

	public static void main(String[] args) {

		// Keys will not be in inserted order
		Map<Integer, String> employees = new HashMap<>();

		// Keys remain in inserted order
		// employees = new LinkedHashMap<>();

		// Keys are sorted in natural order
		employees = new TreeMap<>();

		employees.put(59, "Robert");
		employees.put(49, "Tim");
		employees.put(65, "Sammy");
		employees.put(70, "Tom");
		employees.put(30, "Michael");

		System.out.println("Employees : " + employees);

		for (Integer key : employees.keySet()) {
			System.out.println(key + " : " + employees.get(key));
		}

		System.out.println("\nLooping with entrySet:");
		Set<Map.Entry<Integer, String>> keySet = employees.entrySet();
		for (Map.Entry<Integer, String> entry : keySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
