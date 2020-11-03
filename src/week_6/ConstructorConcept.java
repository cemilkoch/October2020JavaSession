package week_6;

public class ConstructorConcept {

	// Special method used to initialize objects
	// It has to be same name with the class name
	// No return type
	// 1- Default Constructor
	// 2- No argument constructor
	// 3- Parameterized Constructor

	int x;

	public ConstructorConcept() {
		x = 10;
	}

	public static void main(String[] args) {

		ConstructorConcept cc = new ConstructorConcept();
		System.out.println(cc.x);
	}

}
