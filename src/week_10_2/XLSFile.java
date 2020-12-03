package week_10_2;

public class XLSFile extends File{

	public XLSFile() {
		super();
	}
	
	@Override
	void open() {
		System.out.println("Opening the XLS File using MS Excel");
	}

	@Override
	void close() {
		System.out.println("Closing the XLS File");
	} 
	
}
