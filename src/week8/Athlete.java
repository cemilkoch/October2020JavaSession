package week8;

public class Athlete {

	// All athletes run
	// All athletes play

	private String name;
	private int age;
	
	public Athlete() {
		
	}

	public Athlete(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void run() {
		System.out.println("Athlete is running...");
	}
	
	public void game() {
		System.out.println("Athlete is playing...");
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
