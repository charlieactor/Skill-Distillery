package labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    public static void main(String[] args) {
        List<Card> deck = new ArrayList<>(52);

        for (Rank r : Rank.values()) {
            for (Suit s : Suit.values()) {
                deck.add(new Card(s, r));
            }
        }

        for (Card card : deck) {
            System.out.println(card);
        }
        System.out.println();
        System.out.println("^^^ Unshuffled ^^^");
        System.out.println();
        Collections.shuffle(deck);
        System.out.println("vvv Shuffled vvv");
        System.out.println();
        for (Card card: deck) {
        	System.out.println(card);
        }
        
    }

}