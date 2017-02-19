package blackjack;
import java.util.*;

public class Dealer extends Player{
  public Dealer(){
    super("Dealer");
  }
  public void deal(Deck deck){
    deck.drawCard();
    deck.drawCard();
  }
}
