package week_9;

public class QAEngineer implements IEngineer, IWorking {

	private boolean reference;
	private boolean backgroundCheck;
	
	// Constructor
	public QAEngineer(boolean reference, boolean backgroundCheck) {
		this.reference = reference;
		this.backgroundCheck = backgroundCheck;
	}
	
	@Override
	public void work() {
		System.out.println("QA Applicant is working");
	}
	

	@Override
	public void references() {
		if (reference) {
			System.out.println("The applicant has references");
		} else {
			System.out.println("The applicant does not have references");
		}

	}

	@Override
	public void backgroundCheck() {
		if (backgroundCheck) {
			System.out.println("The applicant has criminal record");
		} else {
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
		} else {
			System.out.println("The applicant has worked in companies below:");
			for (String string : arr) {
				System.out.println(string);
			}
		}
	}
	
	
	public void referencesList(String[] arr) {
		if (arr.length == 0) {
			System.out.println("The Applicant does not have any references");
		}else {
			System.out.println("Applicant reference list: ");
			for (String string : arr) {
				System.out.println(string);
			}
		}
	}
	

	

}
