import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;

public class CardTest {
  Card card;
  CardValue value;

  @Before
  public void before(){
    value = CardValue.values()[0];
    card = new Card(value);
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


}