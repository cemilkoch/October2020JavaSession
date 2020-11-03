package week_6;

public class ConstructorConcept4 {

	int modelYear;
	String modelName;

	public ConstructorConcept4(int modelYear, String modelName) {
		this.modelYear = modelYear;
		this.modelName = modelName;
	}

	public static void main(String[] args) {
		ConstructorConcept4 concept4 = new ConstructorConcept4(2016, "Toyota");
		System.out.println(concept4.modelYear + " " + concept4.modelName);
	}

}
