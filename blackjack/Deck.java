package blackjack;

import java.util.*;

public class Deck{
  private ArrayList<Card> deck;

  public Deck(){
    this.deck = new ArrayList<Card>();

    for (int i = 0; i < 13; i++){
      CardValue value = CardValue.values()[i];
      for (int j=0; j < 4; j++){
        Card card = new Card(value, Suit.values()[j]);
        this.deck.add(card);
      }
    }
    Collections.shuffle(deck);
  }

  public int getDeckSize(){
    return deck.size();
  }
  public Card drawCard(){
    Card card = deck.get(0);
    deck.remove(0);
    return card;
  }

}