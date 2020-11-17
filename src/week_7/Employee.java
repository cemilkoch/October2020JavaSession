package week_7;

public class Employee {

	// class fields

	private String firstName;
	private String lastName;
	private String SSN;
	private int departNo;

	public Employee() {
		this.firstName = "";
		this.lastName = "";
		this.SSN = "";
		this.departNo = 0;
	}

	public Employee(String firstName, String lastName, String SSN, int departNo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
		this.departNo = departNo;
	}

	public void worker(int hourlyRate) {
		System.out.println(firstName + " " + lastName + " is earning hourly " + hourlyRate);
	}

	// create an information method to get information
	// create getters

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSSN() {
		return SSN;
	}

	public int getDepartNo() {
		return departNo;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public void setDepartNo(int departNo) {
		this.departNo = departNo;
	}


	
	
	

}
