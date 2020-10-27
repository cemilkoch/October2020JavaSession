package week5;

public class ArrayConcept3 {

	public static void main(String[] args) {

		Object employee[] = new Object[5];
		employee[0] = "Tom";
		employee[1] = 25;
		employee[2] = 'M';
		employee[3] = 4200.75;
		employee[4] = true;

		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i]);
		}

		System.out.println("\nFor each Loop: ");
		for (Object temp : employee) {
			System.out.println(temp);
		}

	}

}
