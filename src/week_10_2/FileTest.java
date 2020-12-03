package week_10_2;

public class FileTest {

	public static void main(String[] args) {
		
		XLSFile x1 = new XLSFile();
		x1.open();
		x1.setName("QuarterlySales.xls");
		x1.close();
		System.out.println("File Name " + x1.getName());
		
		System.out.println(XLSFile.count);
		System.out.println(File.count);
		
		JPGFile jpg = new JPGFile();
		jpg.open();
		jpg.setName("GraduationPhoto.jpg");
		jpg.close();
		System.out.println("JPG file name " + jpg.getName());
		
		System.out.println(JPGFile.count);
		
		PDFFile pdf = new PDFFile("Head First Java.pdf");
		pdf.open();
		pdf.close();
		
		System.out.println("Number of files created : " + PDFFile.count);

	}

}
