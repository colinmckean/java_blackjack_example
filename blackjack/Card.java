package blackjack;

public class Card {
  int value;
  public Card(){
    value = 10;
  }
  public int getHandStrength(){
    return value;
  }
}
