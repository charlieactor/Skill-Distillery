package solutions;

public class BMI4 {
	int heightFeet, heightInches, weight;
	
	java.util.Scanner keyboard = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		BMI4 bmiCalc1 = new BMI4();
		float bmi = bmiCalc1.bmiCalculator();
		System.out.println(bmiCalc1.diagnose(bmi));
	}

	public float bmiCalculator() {
		System.out.print("Please enter a height in feet: ");
		int heightFeet = keyboard.nextInt();
		System.out.print("Please enter the remaining height in inches: ");
		int heightInches = keyboard.nextInt();
		System.out.print("Please enter a weight in pounds: ");
		int weight = keyboard.nextInt();
		keyboard.close();

		float bmi = (weight * 703) / ((heightFeet * 12 + heightInches) * (heightFeet * 12 + heightInches));

		System.out.println("A person " + heightFeet + "'" + heightInches + "\" tall who weighs " + weight
				+ " pounds has a body mass index of " + bmi + " which is ");
		return bmi;
	}

	public String diagnose(float BMI) {
		String diagnosis;
		if (BMI < 18.5) {
			diagnosis = "Underweight.";
		} else if (BMI <= 24.9) {
			diagnosis = "Normal.";
		} else if (BMI <= 29.9) {
			diagnosis = "Overweight.";
		} else {
			diagnosis = "Obese.";
		}
		return diagnosis;
	}
}