package week_9;

public class EngineerRunner {

	public static void main(String[] args) {
		
		
		IEngineer computerEngineer = new ComputerEngineer(true, false);
		computerEngineer.backgroundCheck();
		computerEngineer.references();
		computerEngineer.GPA(3.6);
		
		String [] cExperiences = {"Apple", "Verizon", "Google"};
		computerEngineer.experience(cExperiences);
		
		
		System.out.println("\n*******************\n");
		// IEngineer qAEngineer = new QAEngineer(true, false);
		QAEngineer qAEngineer = new QAEngineer(true, false);
		
		String [] qExperiences = {};
		String [] references = {"Bill Gates", "Elon Musk"};
		
		qAEngineer.experience(qExperiences);
		qAEngineer.referencesList(references);
		qAEngineer.work();
		
		computerEngineer.projects(); // overidden default method 
		IWorking.method(); // static method
		computerEngineer.definition(); // default method in interface

	}

}
