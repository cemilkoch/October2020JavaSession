package week_8;

public class HumanRunner {

	public static void main(String[] args) {
		
		Human human = new Human();
		human.setHeight(1.82f);
		human.setWeight(75);
		human.setBmi(Human.calulateBMI(human));
		
		System.out.println("Person has " + human.getWeight() 
		+ " kg and is " + human.getHeight() + " cm in height and has BMI of " 
		+ human.getBmi() );
	}

}
