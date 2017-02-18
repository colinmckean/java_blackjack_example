package blackjack;
import java.util.*;

public class Game {
  private ArrayList<Player> players;
  private Player winner;

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

  public String compaareHands(){
    this.winner =  players.get(0);
    for(Player player : players){
      if(player.getHandValue() > winner.getHandValue()){
        this.winner = player;
      }
    }
    return displayResult(winner);
  }

  public String displayResult(Player player){
    return player.getName() + " won with " + player.revealHand();
  }

  
}