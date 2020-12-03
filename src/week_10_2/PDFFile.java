package week_10_2;

public class PDFFile extends File {

	public PDFFile(String name) {
		super(name);
	}

	@Override
	void open() {
		System.out.println("Opening the PDF using Skim");
	}

	@Override
	void close() {
		System.out.println("Closing the PDF");
	}

}
