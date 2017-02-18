package blackjack;
import java.util.*;

public class Player {
  private String name;
  private ArrayList<Card> hand;
  private int handValue;
  private String cardsInHand = "";

  public Player(String name, Card card){
    this.hand = new ArrayList<Card>();
    hand.add(card);
    this.name = name;
    cardsInHand += card.getCardValue().toString();
  }

  public String getName(){
    return this.name;
  }

  public void calculateHandValue(){
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
}