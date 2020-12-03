package week_10;

public class FTEmployee extends Person {

	@Override
	public void position() {
		System.out.println("The position is full-time");
	}
		
	public void salary() {
		System.out.println("Salary is less when working full-time, but benefits are more");
	}
	
}
