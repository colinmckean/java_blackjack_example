import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;

public class CardTest {
  Card card;
  CardValue value;

  @Before
  public void before(){
    value = CardValue.values()[10];
    card = new Card(value);
  }

  @Test
  public void testCardHasValue(){
    assertEquals(10, card.getCardValue().ordinal());
  }

  @Test
  public void testCardHasName(){
    assertEquals("QUEEN", card.getCardValue().toString());
  }
}