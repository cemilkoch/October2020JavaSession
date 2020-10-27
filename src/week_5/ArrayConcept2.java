package week_5;

import java.util.Arrays;

public class ArrayConcept2 {

	public static void main(String[] args) {

		int intArr[] = { 15, 66, 25, 22, 37 };

		Arrays.sort(intArr);
		
		for (int i : intArr) {
			System.out.println(i);
		}

		int indexNum = Arrays.binarySearch(intArr, 37);
		
		System.out.println("Index number of 37 " + indexNum);
	}

}
