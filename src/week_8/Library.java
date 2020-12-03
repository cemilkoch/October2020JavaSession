package week_8;

public class Library {

	public static void main(String[] args) {

		Book book1 = new Book();
		book1.setTitle("Java Fundamentals");
		book1.setAuthor("Michael");
		book1.setPages(400);

		System.out.println("Book Title: " + book1.getTitle());
		System.out.println("Book Author: " + book1.getAuthor());
		System.out.println("Book Pages: " + book1.getPages());

		System.out.println("\n******************\n");

		Book book2 = new Book();
		book2.setTitle("Head First Java");
		book2.setAuthor("Kathy Sierra");
		book2.setPages(540);

		System.out.println("Book Title: " + book2.getTitle());
		System.out.println("Book Author: " + book2.getAuthor());
		System.out.println("Book Pages: " + book2.getPages());

	}

}
