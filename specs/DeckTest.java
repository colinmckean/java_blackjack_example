import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;

public class DeckTest {
  Deck deck;

  @Before
  public void before(){
    deck = new Deck();
  }
  @Test
  public void testDeckSize(){
    assertEquals(52, deck.getDeckSize());
  }

  @Test
  public void testDeckReducesCountOnDraw(){
    deck.drawCard();
    assertEquals(51, deck.getDeckSize());
  }
}