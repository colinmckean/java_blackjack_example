package blackjack;
import java.util.*;

public class Player {
  private String name;
  private ArrayList<Card> hand;
  private int handValue;

  public Player(String name, Card card){
    this.hand = new ArrayList<Card>();
    hand.add(card);
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public int getHandValue(){
    for(Card card : hand){
      handValue += card.getCardValue().ordinal() + 2;
    }
    return handValue;
  }
}