package cc;

import java.util.Scanner;


public class Caesar {
	static String e, word;
	static int shift;

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like to encrypt or decrypt: E or D:  ");
		e = kb.next();
		System.out.println("Enter the word you'd like to E or D:  ");
		kb.nextLine();
		word = kb.nextLine();
		System.out.println("Enter the amount in which you'd like to shift by: ");
		shift = kb.nextInt();
		
		Cypher test = new Cypher(e, word, shift);
		test.encrypt();
		kb.close();
	}

}