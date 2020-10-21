package week_4;

public class WhileLoop1 {

	public static void main(String[] args) {
		
		
		
		// while(condition){
		//   statement
		// }
		
		// print numbers from 1 to 10
		int i = 1;
		
		while(i<=10) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		
		// print all the numbers 1 to 100
		// if the number is even print the number
		
		int a = 1;
		
		while(a <= 100) {
			if(a % 2 == 0)
				System.out.println(a);
			a++;
		}
		
		
		
		

	}

}
