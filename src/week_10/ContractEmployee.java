package week_10;

public class ContractEmployee extends Person{
	
	@Override
	void position() {
		System.out.println("The position is contract based");
	}
	
	public void benefits() {
		System.out.println("Salary is better, but benefits are less");
	}

}
