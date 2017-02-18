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
  Suit suit;
  Suit suit_2;
  Suit suit_3;

  @Before 
  public void before(){
    suit = Suit.values()[0];
    value = CardValue.values()[0];
    card = new Card(value, suit);
    player_1 = new Player("Colin", card);    
    player_2 = new Player("Chris", card);
  }

  @Test
  public void testGetName(){
    assertEquals("Colin", player_1.getName());
    assertEquals("Chris", player_2.getName());
  }

  @Test 
  public void testCalculateHandValue(){
    player_1.calculateHandValue();
    assertEquals(2, player_1.getHandValue());
  }

  @Test
  public void testRevealHand(){
    player_1.revealHand();
    assertEquals("TWO OF HEARTS", player_1.revealHand());
  }
}