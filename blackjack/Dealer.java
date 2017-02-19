package blackjack;
import java.util.*;

public class Dealer extends Player{
  public Dealer(){
    super("Dealer");
  }
  public void deal(Deck deck, ArrayList<Player> players){
    for(Player player : players){
      player.takeCard(deck.drawCard());
    }
  }
}
