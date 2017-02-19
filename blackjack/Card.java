package blackjack;

public class Card {
  private CardValue cardValue;
  private Suit suit;

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
