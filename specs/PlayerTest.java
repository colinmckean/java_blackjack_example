import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;
public class PlayerTest {
  Card card;
  Card card_2;
  Card card_3;
  CardValue value;
  CardValue value_2;
  CardValue value_3;
  Player player_1;
  Player player_2;
  Player player_3;
  @Before 
  public void before(){
    value = CardValue.values()[0];
    card = new Card(value);
    player_1 = new Player("Colin", card);    
    player_2 = new Player("Chris", card);
  }

  @Test
  public void testGetName(){
    assertEquals("Colin", player_1.getName());
    assertEquals("Chris", player_2.getName());

  }
}