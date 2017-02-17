import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;

public class CardTest {
  Card card;
  Card card_2;
  CardValue value;
  CardValue value_2;
  Player player_1;
  Player player_2;

  @Before
  public void before(){
    value = CardValue.values()[0];
    value_2 = CardValue.values()[1];
    card = new Card(value);
    card_2 = new Card(value_2);
    player_1 = new Player("Colin", card);
    player_2 = new Player("Big Boss", card_2);
  }

  @Test
  public void testCardHasValue(){
    // + 2;
    assertEquals(0, card.getCardValue().ordinal());
  }

  @Test
  public void testCardHasName(){
    assertEquals("TWO", card.getCardValue().toString());
  }

  @Test
  public void testPlayerHand(){
    assertEquals(2, player_1.getHandValue());
    assertEquals(3, player_2.getHandValue());
  }


}