package week8;

public class FootballPlayer extends Athlete {

	private String team;

	public FootballPlayer(String name, int age, String team) {
		super(name, age);
		this.team = team;
		System.out.println("Name: " + name + "\nAge: " + age + "\nTeam: " + team);
	}

	@Override
	public void run() {
		System.out.println(getName() + " is running...");
	}

	@Override
	public void game() {
		System.out.println(getName() + " is playing football...");
	}

}
