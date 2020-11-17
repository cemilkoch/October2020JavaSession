package week_7;

public class BookStoreRunner {

	public static void main(String[] args) {

		BarnesAndNoble store = new BarnesAndNoble("Clifton Route 3", 10000, 100);
		store.workingHours("10 AM", "9 PM");
		store.numOfEmployee(30);
		System.out.println(store.toString());

		BookStore bookStore = new BookStore("Montclair Book Shop", 15000);
		bookStore.workingHours("10 AM", "9 PM");
		bookStore.numOfEmployee(15);

	}

}
