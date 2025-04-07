package com.paimon.Practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Card {
    private String suit;
    private String rank;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

class Deck {
    private List<Card> cards;
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public Deck() {
        cards = new ArrayList<>();
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                cards.add(new Card(rank, suit));
            }
        }
        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.isEmpty() ? null : cards.remove(0);
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public void printCards() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.printCards();
        System.out.println("Drawing five cards:");
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.drawCard());
        }

        System.out.println("\nRemaining cards in the deck:");
        deck.printCards(); // Print remaining cards in the deck

    }
}
