import blackjack.*;
import java.util.*;

public class Console {

    Scanner input;
    int numOfPlayers;
    Game game;
    Dealer dealer;
    Deck deck;
    ArrayList<Player> players;
    ArrayList<Player> winners;
    Player activePlayer;
    public void start() {
        game = new Game();
        dealer = new Dealer();
        getNumberOfPlayers();
        deck = new Deck();
        winners = new ArrayList<Player>();
        playGame();
    }

    public void playGame(){
        game.addPlayer(dealer);
        getPlayersName();
        for(int i = 0; i < 2; i ++){
            dealer.deal(deck, game.getPlayers());
        }
        showDealersFirstCard();
        giveOptionsToPlayers();
        giveOptionsToDealer(players.get(0));
        whoWon();
        //System.out.println(game.compaareHands());
        showWinningHands();
    }

    public void getNumberOfPlayers(){
        System.out.print("Please enter number of players: ");
        input = new Scanner(System.in);
        numOfPlayers = input.nextInt();
    }

    public void getPlayersName(){
        for(int i = 0; i < numOfPlayers; i++){
            System.out.print("Please enter a name: ");
            input = new Scanner(System.in);
            String name = input.nextLine();
            Player player = new Player(name);
            game.addPlayer(player);
        }
    }

    public void showDealersFirstCard(){
        players = game.getPlayers();
        ArrayList<Card> dealersHand = players.get(0).getHand();
        System.out.print("Dealer has :" +dealersHand.get(0).getFriendlyName());
        input = new Scanner(System.in);
        input.nextLine();
    }
    public void giveOptionsToPlayers(){
        for(int i = 1; i < players.size(); i++){
            activePlayer = players.get(i);
            twistOrStick(activePlayer);
        }
    }

    public void twistOrStick(Player activePlayer){
        // System.out.println(activePlayer.checkIfBlackjack());
        while(activePlayer.checkIfBust() != true && activePlayer.getActive() == true){

            System.out.println("\n" + activePlayer.getName() + " You have :" + activePlayer.revealHand());
            System.out.print("enter t to twist or x to stick:");
            input = new Scanner(System.in);
            char answer = input.next().charAt(0);
            if(answer == 't'){
                dealer.giveOneCard(deck, activePlayer);
            }else{
                activePlayer.deactiveActivePlayer();
            }
        }
    }
    public void giveOptionsToDealer(Player activePlayer){
       while(activePlayer.checkIfBust() != true && activePlayer.getActive() == true){
           System.out.println("\n" + activePlayer.getName() + " You have :" + activePlayer.revealHand());
           System.out.print("enter t to twist or x to stick:");
           input = new Scanner(System.in);
           char answer = input.next().charAt(0);
           if(answer == 't'){
               dealer.giveOneCard(deck, activePlayer);
           }else{
               activePlayer.deactiveActivePlayer();
           }
       }
   }
    public void whoWon(){        
        for(int player = 1; player < players.size(); player++){
            if(players.get(player).getBlackjackValue() <= 21){
                winners.add(players.get(player));
            }else if(players.get(0).checkIfBust() == false){
                winners.add(players.get(0));
            }else{
                System.out.println("no winners");
            }

        

    //if dealer has 21 or under and is higher than everyone else or equal to everyone else, dealer wins. if player is under 21 and higher they are a winner.
        //If the dealer goes bust, all players who are left in the game win. Otherwise players with higher point totals than the dealer win, while players with lower totals than the dealer lose.
    }
}

    public void showWinningHands(){
      for(Player player : winners){


        System.out.println("\n" + player.getName() + " won with " +  player.revealHand() + "\n TOTAL: " + player.getBlackjackValue());
      }
  }
}