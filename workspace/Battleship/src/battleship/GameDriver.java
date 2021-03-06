package battleship;

import java.util.Scanner;

public class GameDriver {
	public static void main(String[] args) {
		int playerGuess;
		Scanner kb = new Scanner(System.in);

		Ship[] shipArr = new Ship[7];
		Ship shipOne = new Ship("Ship One", 5, 5);

		for (int i = 0; i < shipOne.getLength(); i++) {
			shipArr[i] = shipOne;
		}

		do {

			System.out.println("Please enter a coordinate 1-7: ");
			playerGuess = kb.nextInt();
			
			if (shipArr[playerGuess].equals(shipOne)) {
				System.out.println("Direct hit!!");
				shipArr[playerGuess] = null;
			}
			else if(shipArr[playerGuess].equals(null)) {
				System.out.println("Huge miss, and you should feel bad");
			}
			

		} while (shipArr[0] != null || shipArr[1] != null || shipArr[2] != null ||
				shipArr[3] != null || shipArr[4] != null || shipArr[5] != null ||
				shipArr[6] != null);
		kb.close();
	} 
}
