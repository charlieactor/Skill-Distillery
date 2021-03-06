package labs;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		double yourBMI = bmiPrinter();

		if (yourBMI < 18.5) {
			System.out.println("Underweight.");
		}
		else if (yourBMI >= 18.5 && yourBMI < 25.0) {
			System.out.println("Normal.");
		}
		else if (yourBMI >= 25.0 && yourBMI < 30.0) {
			System.out.println("Overweight.");
		}
		else {
			System.out.println("Obese.");
		}

	}
	public static double bmiPrinter() {
		Scanner keyboard = new Scanner(System.in);
		int height, heightFeet, weight;


		System.out.println("How tall are you?");
		System.out.print("Feet: ");
		heightFeet = keyboard.nextInt();
		System.out.print("Inches: ");
		height = keyboard.nextInt();
		System.out.print("What is your weight in pounds?");
		weight = keyboard.nextInt();

		height += heightFeet * 12;

		keyboard.close();

		int bmi = (( weight * 703 ) / ( height * height ) );

		return bmi;
	}
}
