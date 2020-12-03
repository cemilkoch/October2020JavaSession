package week_8;

public class AthleteRunner {

	public static void main(String[] args) {
		System.out.println("Football player:");
		FootballPlayer ronaldo = new FootballPlayer("Ronaldo", 35, "Juventus");
		ronaldo.game();
		ronaldo.run();

		System.out.println("\n**************\n");
		System.out.println("Bastekball player:");
		BasketballPlayer kevin = new BasketballPlayer("Kevin Durant", 32, "Brooklyn Nets", true);
		kevin.game();
		kevin.run();
		
		System.out.println("\n**************\n");
		//upcasting
		Athlete athlete = new FootballPlayer("Messi", 35, "Barcelona");
		athlete.game();
		athlete.run();
	}

}
