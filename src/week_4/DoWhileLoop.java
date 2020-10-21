package week_4;

public class DoWhileLoop {

	public static void main(String[] args) {

		int i = 10;

		do {
			System.out.println(i);
			i--;
		} while (i >= 1);

		System.out.println();
		System.out.println("Reversing the array: ");
		int arr[] = { 2, 50, 45, 11, 39 };

		int j = arr.length - 1;

		do {
			System.out.print(arr[j] + " ");
			j--;

		} while (j >= 0);

	}

}
