package blackjack;
import java.util.*;

public class Player {
  private String name;
  private ArrayList<Card> hand;
  private int handValue;
  private String cardsInHand = "";

  public Player(String name){
    this.hand = new ArrayList<Card>();
    this.name = name;
  }
  public Player(String name, Card card){
    this.hand = new ArrayList<Card>();
    hand.add(card);
    this.name = name;
    cardsInHand += card.getCardValue().toString();
    cardsInHand += " OF " + card.getSuit().toString();
  }  

  public String getName(){
    return this.name;
  }

  public void calculateHandValue(){
    handValue = 0;
    for(int i = 0; i < hand.size(); i++){
      this.handValue += hand.get(0).getCardValue().ordinal() + 2;
    }
  }

  public int getHandValue(){
    return this.handValue;
  }

  public String revealHand(){
    return cardsInHand;
  }
  public void takeCard(Card card){
    hand.add(card);
    calculateHandValue();
  }

}