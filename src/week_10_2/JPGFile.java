package week_10_2;

public class JPGFile extends File {

	@Override
	void open() {
		System.out.println("Opening JPG file using Image Viewer");
	}

	@Override
	void close() {
		System.out.println("Closing the JPG file");
	}

}
