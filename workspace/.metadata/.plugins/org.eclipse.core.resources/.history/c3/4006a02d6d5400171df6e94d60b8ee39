package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

import com.skilldistillery.cards.players.Dealer;
import com.skilldistillery.cards.players.Player;
import com.skilldistillery.cards.players.UserPlayer;

public class GameDriver {

	public static void main(String[] args) {
		playGame();
	}

	public static void playGame() {
		Scanner kb = new Scanner(System.in);
		String entry = "";
		String dealerEntry = "";
		String again = "";
		Dealer dealer = new Dealer();
		Player user = new UserPlayer();

		do {

			dealer.Shuffle();

			dealer.deal(user, dealer);

			printHand(user, "User");
			printDealerShowing(dealer, "Dealer");

			outer: do {
				// Game loop to determine if user has decided to stay
				do {

					System.out.println();
					System.out.println("Would you like to hit or stay?");
					entry = kb.next();
					if (!entry.equalsIgnoreCase("hit") && !entry.equalsIgnoreCase("stay")) {
						System.out.println("Please choose either hit or stay.");
					} else if (entry.equalsIgnoreCase("hit")) {
						System.out.println();
						user.setHand(dealer.hit());
						checkAceValue(user);
						if (user.getNewTotal() > 21) {
							printHand(user, "User");
							break outer;
						}
						printHand(user, "User");

					} else {
						System.out.println();
						System.out.println("You've decided to stay.");
						System.out.println();
						checkAceValue(user);
						printHand(user, "User");
						printDealerShowing(dealer, "Dealer");

					}

				} while (entry.equalsIgnoreCase("hit"));
				System.out.println();
				System.out.println("Dealer flips over his other card: ");

				do {
					printBothHands(user, dealer);
					dealerEntry = dealer.determineWhatToDo();

					if (dealerEntry.equals("hit")) {
						System.out.println();
						System.out.println("Dealer decided to " + dealerEntry);
						System.out.println();
						dealer.setHand(dealer.hit());
						checkAceValue(dealer);
						if (dealer.getNewTotal() > 21) {
							printHand(dealer, "Dealer");
							break outer;
						}
					}
					else {
						System.out.println();
						System.out.println("Dealer decided to " + dealerEntry);
					}

					System.out.println();
					checkAceValue(dealer);
					printHand(dealer, "Dealer");

				} while (dealerEntry.equals("hit"));

			} while (((checkAceValue(user) < 21) && (checkAceValue(dealer) < 21))
					&& (entry.equalsIgnoreCase("hit") && dealerEntry.equals("hit")));

			winCheck(user, dealer);
			
			user.resetHand();
			dealer.resetHand();
			
			if (dealer.getDeck().getDeck().size() < 15) {
				dealer.newDeck();
			}
			
			System.out.println("Would you like to play again? Y/N");
			again = kb.next();
		} while (again.equalsIgnoreCase("y"));
	}
	
	public static int checkAceValue(Player player) {
		for (int i = 0; i < player.getHand().size(); i++) {
			if (player.getHand().get(i).getRank().value() == 11){
				if (player.getTotal() > 21) {
					int playerTotal = player.getTotal();
					player.setTotal(playerTotal - 10);
					return player.getNewTotal();
				}
			}
		}
		player.setTotal(player.getTotal());
		return player.getTotal();
	}

	public static void printBothHands(Player user, Player dealer) {
		System.out.println("User hand: " + user.getHand().toString());
		checkAceValue(user);
		System.out.println("Your current total: " + user.getNewTotal());
		System.out.println("Dealer's hand: " + dealer.getHand().toString());
		checkAceValue(dealer);
		System.out.println("Dealer's current total: " + dealer.getNewTotal());
	}

	public static void printHand(Player player, String name) {
		System.out.println(name + "'s hand: " + player.getHand().toString());
		checkAceValue(player);
		System.out.println(name + "'s current total: " + player.getNewTotal());
	}

	public static void printDealerShowing(Player player, String name) {
		System.out.println(name + "'s showing card: " + player.getHand().get(0).toString());
		System.out.println(name + "'s showing total: " + player.getHand().get(0).getRank().value());
	}

	public static void winCheck(Player user, Player dealer) {
		checkAceValue(user);
		checkAceValue(dealer);
		if (user.getNewTotal() > 21) {
			System.out.println("You busted, YOU LOSE!");
		} else if (dealer.getNewTotal() > 21) {
			System.out.println("Dealer busted, YOU WIN!");
		} else if (user.getNewTotal() > dealer.getNewTotal()) {
			System.out.println("You win!");
		} else if (user.getNewTotal() < dealer.getNewTotal()) {
			System.out.println("Dealer wins.");
		} else {
			if (user.getHand().size() < dealer.getHand().size()) {
				System.out.println("YOU WIN! You have the same score as the dealer, but in fewer cards.");
			} else if (user.getHand().size() > dealer.getHand().size()) {
				System.out.println("YOU LOSE. You have the same score as the dealer, but in more cards.");
			} else {
				System.out.println("DRAW. Not a draw!!");
			}
		}
	}
}
