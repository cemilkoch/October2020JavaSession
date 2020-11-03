package week_6;

public class ConstructorConcept3 {

	int x;
	
	public ConstructorConcept3() {
		System.out.println("Invoking the no argument constructor");
	}
	
	// Parameterized Constructor
	public ConstructorConcept3(int number) {
		System.out.println("The " + number + " value has been assigned!");
		x = number;
	}
	
	public static void main(String[] args) {
		ConstructorConcept3 concept3 = new ConstructorConcept3(25);
		System.out.println(concept3.x);
		
		ConstructorConcept3 cc = new ConstructorConcept3();
	}

}
