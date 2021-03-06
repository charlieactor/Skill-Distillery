package examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		
		try {
			System.out.print("Please enter an int: ");
			num1 = keyboard.nextInt();
			System.out.print("Please enter another int: ");
			num2 = keyboard.nextInt();
		}
		catch (InputMismatchException ime) {
			System.err.println("Must input an int");
		}
		
		int result = 0;
		keyboard.close();
		
		try {
			result = num1/num2;
		}
		catch (ArithmeticException e) {
			System.err.println("Cannot divide by zero");
		}
		
		System.out.println(num1 + " / " + num2 + " = " + result);
		
	}
}
