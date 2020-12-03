package week_9;

public class ComputerEngineer implements IEngineer {

	private boolean reference;
	private boolean backgroundCheck;
	
	
	//Constructor 
	public ComputerEngineer(boolean reference, boolean backgroundCheck) {
		this.reference = reference;
		this.backgroundCheck = backgroundCheck;
	}

	@Override
	public void references() {
		if (reference) {
			System.out.println("The applicant has references");
		}else {
			System.out.println("The applicant does not have references");
		}
	}
	
	@Override
	public void backgroundCheck() {
		if (backgroundCheck) {
			System.out.println("The applicant has criminal record");
		}else {
			System.out.println("The applicant does not have a criminal record");
		}
	}

	@Override
	public void GPA(double gpa) {
		System.out.println("GPA score : " + gpa);
	}

	@Override
	public void experience(String[] arr) {
		if (arr.length == 0) {
			System.out.println("The applicant doesn't have any experience");
		}else {
			System.out.println("The applicant has worked in companies below:");
			for (String string : arr) {
				System.out.println(string);
			}
		}
	}
	
	@Override
	public void projects() {
		System.out.println("Overriden method in computer engineer");
	}
	
}
