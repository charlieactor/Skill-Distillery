package bingo;

import java.util.*;

public class Card {
	String[][] card = new String[5][5];
	
	public Card () {
		this.card = makeNewCard();
	}

	public void printCard(Card thisCard) {
		String[][] myCard = thisCard.card;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < 4) {
					System.out.print(myCard[i][j] + "\t");
				}
				else {
					System.out.print(myCard[i][j] + "\n");
				}
			}
		}
	}
	
	public String[][] makeNewCard() {
		List<String> column = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 0) {
					String marker = Integer.toString(((int)(Math.random()*15)) + 1);
					if (!column.contains(marker)) {
						column.add(marker);
						card[i][j] = marker;
					} else {
						j = j - 1;
					}
				} else if (j == 1) {
					String marker = Integer.toString(((int)(Math.random()*15)) + 16);
					if (!column.contains(marker)) {
						column.add(marker);
						card[i][j] = marker;
					} else {
						j = j - 1;
					}
				} else if (j == 2) {
					String marker = Integer.toString(((int)(Math.random()*15)) + 31);
					if (!column.contains(marker)) {
						column.add(marker);
						card[i][j] = marker;
					} else {
						j = j - 1;
					}
				} else if (j == 3) {
					String marker = Integer.toString(((int)(Math.random()*15)) + 46);
					if (!column.contains(marker)) {
						column.add(marker);
						card[i][j] = marker;
					} else {
						j = j - 1;
					}
				} else if (j == 4) {
					String marker = Integer.toString(((int)(Math.random()*15)) + 61);
					if (!column.contains(marker)) {
						column.add(marker);
						card[i][j] = marker;
					} else {
						j = j - 1;
					}
				}

			}
		}
		card[2][2] = "X";
		return card;
	}

}
