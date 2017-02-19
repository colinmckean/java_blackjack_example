import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;

public class CardTest {
  Card twoOfHearts;
  Card aceOfSpades;
  Card jackOfClubs;

  CardValue two;
  CardValue five;
  CardValue ace;
  CardValue jack;

  Suit hearts;
  Suit spades;
  Suit clubs;
  Suit diamonds;

  @Before
  public void before(){
    two = CardValue.values()[0];
    five = CardValue.values()[3];
    jack = CardValue.values()[9];
    ace = CardValue.values()[12];
    hearts = Suit.values()[0];
    spades = Suit.values()[1];
    clubs = Suit.values()[2];
    diamonds = Suit.values()[3];
    twoOfHearts = new Card(two, hearts);
    aceOfSpades = new Card(ace,spades);
    jackOfClubs = new Card(jack, clubs);
  }

  @Test
  public void testCardHasValue(){
    // + 2;
    assertEquals(0, twoOfHearts.getCardValue().ordinal());
  }

  @Test
  public void testCardHasName(){
    assertEquals("TWO", twoOfHearts.getCardValue().toString());
    assertEquals("JACK", jackOfClubs.getCardValue().toString());
  }
  
  @Test
  public void testGetSuit(){
    assertEquals("HEARTS", twoOfHearts.getSuit().toString());
    assertEquals("SPADES", aceOfSpades.getSuit().toString());
    assertEquals("CLUBS", jackOfClubs.getSuit().toString());
  }

  @Test
  public void testGetFriendlyName(){
    assertEquals("\nTWO OF HEARTS", twoOfHearts.getFriendlyName());
  }
}