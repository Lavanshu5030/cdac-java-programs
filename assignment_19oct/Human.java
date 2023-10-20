package assignment_19oct;

public class Human {
	private double height;
	private double weight;
	private double bmi;
	
	public Human(double weight, double height){
		this.height = height;
		this.weight = weight;
		calculateBMI();
	}
	
	public void setHeight(double h) {
		this.height = h;
		calculateBMI();
	}
	
	public void setWeight(double w) {
		this.weight = w;
		calculateBMI();
	}
	
	public double getBmi() {
		return bmi;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	private void calculateBMI() {
	     if (height <= 0 || weight <= 0) {
	            bmi = 0; // Handle invalid values gracefully
	        } else {
	            bmi = weight / (height * height);
	        }
	    }
	
	public void print() {
		System.out.println("Height of human:" + getHeight());
		System.out.println("Weight of human:" + getWeight());
		System.out.println("BMI of human:" + getBmi());
	}
	   

}
