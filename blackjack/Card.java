package blackjack;

public class Card {
  private CardValue cardValue;

  public Card(CardValue cardValue){
    this.cardValue = cardValue;
  }

  public CardValue getCardValue(){
    return cardValue;
  }
}
