import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;

public class CardTest {
  Card card;

  @Before
  public void before(){
    card = new Card();
  }

  @Test
  public void testCardHasValue(){
    assertEquals(10, card.getHandStrength());
  }
}