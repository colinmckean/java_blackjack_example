import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;

public class GameTest {
  Card card;
  Card card_2;
  Card card_3;
  CardValue value;
  CardValue value_2;
  CardValue value_3;
  Player player_1;
  Player player_2;
  Player player_3;
  Suit suit;
  Suit suit_2;
  Suit suit_3;
  Game game = new Game(); 

  @Before
  public void before(){
    value = CardValue.values()[0];
    suit = Suit.values()[0];
    value_2 = CardValue.values()[9];
    suit_2 = Suit.values()[1];
    value_3 = CardValue.values()[3];
    suit_3 = Suit.values()[2];
    card = new Card(value, suit);
    card_2 = new Card(value_2, suit_2);
    card_3 = new Card(value_3, suit_3);
    player_1 = new Player("Colin", card);
    player_2 = new Player("Big Boss", card_2);
    player_3 = new Player("Little Boss", card_3);
  }

  @Test
  public void testCanAddPlayers(){
    game.addPlayer(player_1);
    game.addPlayer(player_2);
    game.addPlayer(player_3);
    assertEquals(3, game.getNumberOfPlayers());
  }

  @Test
    public void testGameResult(){
    game.addPlayer(player_1);
    game.addPlayer(player_2);
    player_1.calculateHandValue();
    player_2.calculateHandValue();
    assertEquals("Big Boss won with JACK", game.compaareHands());
  }

}