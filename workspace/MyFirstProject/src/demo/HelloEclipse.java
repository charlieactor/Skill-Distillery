package demo;

import java.util.Scanner;

public class HelloEclipse {
	public static void main(String[] args) {
		float f = 3.14f;
		System.out.println(f);
		float f2 = 3.14f;
		System.out.println(f2);
		System.out.println("Hello Eclipse");
		int x = 42;
		System.out.println(x);
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a number: ");
		x = kb.nextInt();
		kb.close();
	}
}
