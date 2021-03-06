import java.util.Scanner;

public class tictactoe {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String p1 = "", p2 = "";
		int i, i2, turn = 2;
		String[][] ttt = new String[3][3];
		String playAgain = "";

		do {

			do {
				System.out.print("Player 1: Choose whether you will be X or O: ");
				p1 = keyboard.next();
				if (p1.equalsIgnoreCase("X")) {
					p2 = "O";
				} else if (p1.equalsIgnoreCase("O")) {
					p2 = "X";
				} else {
					System.out.println("That wasn't an X or an O! Try again.");
				}
			} while (!p1.equalsIgnoreCase("X") && !p1.equalsIgnoreCase("O"));

			boardInit(ttt);
			printBoard(ttt);

			outer: for (int j = 0; j < 9; j++) {
				if (turn % 2 == 0) {
					System.out.print("Player 2, pick your coordinates. \nFirst coordinate: ");
					i = keyboard.nextInt();
					System.out.print("\nSecond coordinate: ");
					i2 = keyboard.nextInt();
					if (!ttt[i][i2].equals("*")) {
						System.out.println("That place is already taken, please try again.");
						j--;
						continue outer;
					}

					while (ttt[i][i2].equals("*")) {
						ttt[i][i2] = p2;
						break;
					}
					printBoard(ttt);
					turn++;

				} else {
					System.out.print("Player 1, pick your coordinates. \nFirst coordinate: ");
					i = keyboard.nextInt();
					System.out.print("\nSecond coordinate: ");
					i2 = keyboard.nextInt();
					if (!ttt[i][i2].equals("*")) {
						System.out.println("That place is already taken, please try again.");
						j--;
						continue outer;
					}
					while (ttt[i][i2].equals("*")) {
						ttt[i][i2] = p1;
						break;
					}
					printBoard(ttt);
					turn++;
				}
				if (winner(ttt) == true) {
					System.out.print("Game over");
					break outer;
				}
			}
			System.out.print("\nWould you like to play again? (Y/N) ");
			playAgain = keyboard.next();
		} while (playAgain.equalsIgnoreCase("y"));
	}

	public static void boardInit(String[][] ttt) {
		for (int i = 0; i < ttt.length; i++) {
			for (int j = 0; j < ttt[i].length; j++) {
				ttt[i][j] = "*";
			}
		}
	}

	public static void printBoard(String[][] ttt) {
		for (int i = 0; i < ttt.length; i++) {
			for (int j = 0; j < ttt[i].length; j++) {
				System.out.print(ttt[i][j] + " | ");
			}
			System.out.println("\n___________");
		}
	}

	public static Boolean winner(String[][] ttt) {
		Boolean win = false;

		if (ttt[0][0] == ttt[1][1] && ttt[1][1] == ttt[2][2] && !ttt[2][2].equals("*")) {
			System.out.println(ttt[0][0] + " wins!");
			win = true;
			return win;
		} else if (ttt[0][0] == ttt[0][1] && ttt[0][1] == ttt[0][2] && !ttt[0][2].equals("*")) {
			System.out.println(ttt[0][0] + " wins!");
			win = true;
			return win;
		} else if (ttt[1][0] == ttt[1][1] && ttt[1][1] == ttt[1][2] && !ttt[1][2].equals("*")) {
			System.out.println(ttt[1][0] + " wins!");
			win = true;
			return win;
		} else if (ttt[2][0] == ttt[2][1] && ttt[2][1] == ttt[2][2] && !ttt[2][2].equals("*")) {
			System.out.println(ttt[2][0] + " wins!");
			win = true;
			return win;
		} else if (ttt[0][1] == ttt[1][1] && ttt[1][1] == ttt[2][1] && !ttt[2][1].equals("*")) {
			System.out.println(ttt[0][1] + " wins!");
			win = true;
			return win;
		} else if (ttt[0][0] == ttt[1][0] && ttt[1][0] == ttt[2][0] && !ttt[2][0].equals("*")) {
			System.out.println(ttt[0][0] + " wins!");
			win = true;
			return win;
		} else if (ttt[2][0] == ttt[1][1] && ttt[1][1] == ttt[0][2] && !ttt[0][2].equals("*")) {
			System.out.println(ttt[2][0] + " wins!");
			win = true;
			return win;
		} else if (ttt[0][2] == ttt[1][2] && ttt[1][2] == ttt[2][2] && !ttt[2][2].equals("*")) {
			System.out.println(ttt[0][2] + " wins!");
			win = true;
			return win;
		} else {
			return win;
		}

	}
}
