package week8;

public class BasketballPlayer extends Athlete {

	private String team;
	private boolean status;

	public BasketballPlayer(String name, int age, String team, boolean status) {
		super(name, age);
		this.team = team;
		this.status = status;

		System.out.println("Name: " + name + "\nAge: " + age + "\nTeam: " + team);
	}

	@Override
	public void game() {
		if (status) {
			System.out.println(getName() + " is offensive");
		} else {
			System.out.println(getName() + " is defensive");
		}
	}

}
