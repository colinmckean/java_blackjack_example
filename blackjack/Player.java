package blackjack;
import java.util.*;

public class Player {

  private String name;
  private ArrayList<Card> hand;
  private int handValue;
  private String cardsInHand = "";
  private int blackjackValue;
  private boolean active;
  private boolean bust;
  private CardValue ace;

  public Player(String name){
    this.hand = new ArrayList<Card>();
    this.name = name;
    active = true;
    ace = CardValue.values()[13];
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
      this.handValue += hand.get(i).getCardValue().ordinal() + 2;
    }
  }

  public int getHandValue(){
    return this.handValue;
  }

  public String revealHand(){
    return cardsInHand;
  }

  public void takeCard(Card card){
    cardsInHand += card.getFriendlyName();
    hand.add(card);
    calculateHandValue();
    setBust();
  }

  public int getBlackjackValue(){
    calculateBlackjackValue();
    return this.blackjackValue;
  }

  public void calculateBlackjackValue(){
    blackjackValue = 0;
    for(int i = 0; i < hand.size(); i++){
      this.blackjackValue += hand.get(i).getBlackJackValue();
    }
  }
  public ArrayList<Card> getHand(){
    return this.hand;
  }
  public boolean getActive(){
    return active;
  }
  public void deactiveActivePlayer(){
    active = false;
  }
  private void setBust(){

    if(getBlackjackValue() > 21){
      checkForAces();
      calculateBlackjackValue();
      if(getBlackjackValue() > 21){
        System.out.println("BUST! with " + this.revealHand());
        this.bust = true;
    }else{
      this.bust = false;
    }
  }
  }

  public boolean checkIfBust(){
   return bust;
 }

//  public String checkIfBlackjack(){
//   if(getBlackjackValue() == 21){
//     this.active = false;
//     return getName() +"blackjack! with " + revealHand();
//   }return "BUST with " + revealHand();
// }
public void checkForAces(){
  for(Card card : this.hand){
      if(card.getCardValue().toString() == "ACE"){
        System.out.println("HELLO?");
        card.setCardValue(ace);
      }
    }
  }
}

