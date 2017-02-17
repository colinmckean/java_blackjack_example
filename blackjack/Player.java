package blackjack;

public class Player {
  private name;
  private ArrayList<Card> hand;

  public Player(String name, Card card){
    this.hand = new ArrayList<Card>();
    hand.add(card);
    this.name = name;
  }
}