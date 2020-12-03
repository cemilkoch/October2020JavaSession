package week_10_2;

public abstract class File {

	private String name;
	static int count;

	// Constructors
	public File() {
		System.out.println("File class constructor");
		count++;
		name = "";
	}

	public File(String name) {
		System.out.println("File class 1 parameter constructor");
		count++;
		this.name = name;
	}

	// Getter and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	abstract void open();

	abstract void close();

}
