package labs;

import java.util.Scanner;

public class Mileage {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double milesDriven, fuelConsumed;
		System.out.print("How many miles have you driven? ");
		milesDriven = keyboard.nextDouble();
		System.out.print("\nHow much gas have you consumed (in gallons)? ");
		fuelConsumed = keyboard.nextDouble();
		
		System.out.println("You are getting " + ( milesDriven / fuelConsumed )
				 + " miles per gallon");

	}

}
