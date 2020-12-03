package week_10;

public abstract class Person {

	abstract void position();
	
	void healthInsurance() {
		System.out.println("If the position is FT, there will be health insurance");
		System.out.println("If the position is Contract, there will be no insurance");
	}
	
}
