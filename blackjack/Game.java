package blackjack;
import java.util.*;

public class Game {
  private ArrayList<Player> players;
  private Player winner;

  public Game(){
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

  public ArrayList<Player> getPlayers(){
    return players;
  }
  public void showAllHands(){
    for(Player player : players){
      System.out.println("\n" + player.getName() + " had " +  player.revealHand());
    }
  }

  
}