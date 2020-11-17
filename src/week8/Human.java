package week8;

public class Human {

	private float weight;
	private float height;
	private float bmi;
	
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public void setBmi(float bmi) {
		this.bmi = bmi;
	}
	public float getWeight() {
		return weight;
	}
	public float getHeight() {
		return height;
	}
	public float getBmi() {
		return bmi;
	}
	
	public static float calulateBMI(Human h1) {
		return h1.weight / (h1.height * h1.height);
	}
	
	
	
}
