package week_9;

public interface IEngineer {
	
	double gpa = 3.8; // variables are final by default
	
	static double gpa2 = 3.4;
	
	public double gpa3 = 2.5;
	
	void references();
	
	void backgroundCheck();
	
	void GPA(double gpa);
	
	void experience(String [] arr);
	
	default void projects() {
		System.out.println("Default method and has a body");
	}
	
	default void definition() {
		System.out.println("This method is in IEngineer");
	}
	
	private void method() {
		System.out.println("Private method in interface");
	}
	
	private static void method2() {
		System.out.println("Private method in interface");
	}
	

	
}
