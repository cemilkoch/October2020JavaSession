package week_7;

public class BookStore {

	// class fields
	private String storeName;
	private int numberOfBooks;

	// Constructor
	public BookStore(String storeName, int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
		this.storeName = storeName;
		System.out.println("Store name: " + storeName + "\nBook numbers: " + numberOfBooks);
	}

	public void workingHours(String open, String close) {
		System.out.println("Open: " + open + "\nClose: " + close);
	}

	public void numOfEmployee(int numOfEmployee) {
		System.out.println(numOfEmployee + " employees are working in this store.");
	}

}
