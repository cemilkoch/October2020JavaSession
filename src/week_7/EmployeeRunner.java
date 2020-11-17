package week_7;

public class EmployeeRunner {

	public static void main(String[] args) {

		Employee jim = new Employee("Jim", "Smith", "905901940", 100);

		System.out.println("First Name: " + jim.getFirstName());
		System.out.println("Last Name: " + jim.getLastName());
		System.out.println("Department Number: " + jim.getDepartNo());

		jim.worker(30);

		System.out.println("*******************");
		Employee john = new Employee();
		john.setFirstName("John");
		john.setLastName("Sweeney");
		john.setSSN("340986790");
		john.setDepartNo(101);

		System.out.println("First Name: " + john.getFirstName());
		System.out.println("Last Name: " + john.getLastName());
		System.out.println("Department Number: " + john.getDepartNo());

		john.worker(25);

	}

}
