package week_10;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		Person person = new FTEmployee();
		person.healthInsurance();
		person.position();
		
		Person person2 = new ContractEmployee();
		person2.position();
		
		FTEmployee person3 = new FTEmployee();
		person3.salary();
		person3.position();
		
		ContractEmployee person4 = new ContractEmployee();
		person4.benefits();
		person4.position();
		
		// Employee person5 = new ContractEmployee(); it won't compile
		
		
	}

}
