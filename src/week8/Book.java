package week8;

public class Book {

	private String title;
	private String author;
	private int pages;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public int getPages() {
		return pages;
	}

	public void updateInformation(String title, String author, int pages) {
		this.title = title;
		this.author = author;
		this.pages = pages;
	}

}
