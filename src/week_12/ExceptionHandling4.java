package week_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandling4 {

	public static void main(String[] args) throws IOException {

		String line = readLines("/Users/cemilkoc/Desktop/untitled_folder/Untitled.txt");
		System.out.println(line);

	}

	static String readLines(String fileName) throws FileNotFoundException {

		File file = new File(fileName);
		Scanner fileReader = null;
		String txt = "";
		try {
			
			fileReader = new Scanner(file);
			while (fileReader.hasNextLine()) {
				txt += fileReader.nextLine() + "\n";
			}
			
			return txt;
			
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("File not found.");
		} finally {
			fileReader.close();
		}

	}

}
