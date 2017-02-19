package blackjack;

public class Card {

  private CardValue cardValue;
  private Suit suit;
  private int blackjackValue;

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

  public void setCardValue(CardValue cardValue){
    this.cardValue = cardValue;
  }

  public void setCardSuit(Suit suit){
    this.suit = suit;
  }

  public int getBlackJackValue(){
    switch (this.getCardValue().toString()) {
      case "ACE":
      this.blackjackValue = 11;
      break;
      case "KING":
      this.blackjackValue = 10;
      break;
      case "QUEEN":
      this.blackjackValue = 10;
      break;
      case "JACK":
      this.blackjackValue = 10;
      break;
      default: 
      this.blackjackValue= this.getCardValue().getCardValue();
      break;
    }
    return blackjackValue;
  }
}
