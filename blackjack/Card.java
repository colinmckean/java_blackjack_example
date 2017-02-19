package blackjack;

public class Card {
  protected CardValue cardValue;
  protected Suit suit;

  public Card(CardValue cardValue, Suit suit){
    this.cardValue = cardValue;
    this.suit = suit;
  }

  public CardValue getCardValue(){
    return cardValue;
  }
  public Suit getSuit(){
     return suit;
   }

   public String getFriendlyName(){
    return "\n" + this.cardValue.toString() + " OF " + this.suit.toString();
   }
}
