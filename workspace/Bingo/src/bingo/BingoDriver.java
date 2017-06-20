package bingo;

import java.util.Scanner;

public class BingoDriver {
	public static void main(String[] args) {
		BingoHopper playingBingo = new BingoHopper();
		Scanner kb = new Scanner(System.in);
		Card myCard = new Card();
		
		System.out.println("Time to play bingo! Here's your bingo board: ");
		myCard.printCard(myCard);
		
		do {
			System.out.println("The next number is: ");
			playingBingo.shuffleBalls();
			playingBingo.pullWinner();
			
		} while (true);
		
		
	}
}
