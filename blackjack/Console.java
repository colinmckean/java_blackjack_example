import blackjack.*;
import java.util.Scanner;

public class Console {

    Scanner input;
    int numOfPlayers;
    Game game;
    Dealer dealer;
    Deck deck;

    public void start() {
        game = new Game();
        dealer = new Dealer();
        getNumberOfPlayers();
        deck = new Deck();
        playGame();
    }

    public void playGame(){
        game.addPlayer(dealer);
        getPlayersName();
        for(int i = 0; i < 2; i ++){
        dealer.deal(deck, game.getPlayers());
    }
        System.out.println(game.compaareHands());
        game.showAllHands();
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
}