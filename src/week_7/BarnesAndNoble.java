package week_7;

public class BarnesAndNoble extends BookStore {

	// if a child class extends parent class, parent constructor must be invoked
	// to invoke parent constructor super keyword must be used
	// inheritance creates is-a relationship

	private int storeNumber;

	public BarnesAndNoble(String storeName, int numberOfBooks, int storeNumber) {
		super(storeName, numberOfBooks);
		this.storeNumber = storeNumber;
	}

	@Override
	public void workingHours(String open, String close) {
		System.out.println("Barnes and Noble opening and closing hours:");
		System.out.println(open + " - " + close);
	}

	@Override
	public void numOfEmployee(int employee) {
		System.out.println("Barnes and Nobles employee amount: " + employee);
	}

	public void storeInformation() {
		System.out.println("Barnes and Nobles store number : " + storeNumber);
	}

	@Override
	public String toString() {
		return "Barnes and Nobles store information " + storeNumber;
	}

}
