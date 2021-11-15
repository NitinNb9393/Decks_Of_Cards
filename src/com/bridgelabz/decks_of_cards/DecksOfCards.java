package com.bridgelabz.decks_of_cards;

public class DecksOfCards {

	public static void main(String[] args) {
		System.out.print("Welcome to Decks of Cards");
		CardsPlay cardsPlay = new CardsPlay();
		cardsPlay.generateUniqueCards();
		cardsPlay.addPlayer();
	}

}
