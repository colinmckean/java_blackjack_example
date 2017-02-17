package blackjack;
import java.util.*;

public class Game {
  private ArrayList<Player> players;

  public Game(){
    //some inputs for names
    //dealer, deck of cards.
    players = new ArrayList<Player>();
  }
  
  public void addPlayer(Player player){
    players.add(player);
  }

  public int getNumberOfPlayers(){
    return players.size();
  }
}