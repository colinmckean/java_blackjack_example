import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;

public class CardTest {
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
    value = CardValue.values()[0];
    suit = Suit.values()[0];
    value_2 = CardValue.values()[1];
    suit_2 = Suit.values()[1];
    value_3 = CardValue.values()[3];
    suit_3 = Suit.values()[2];
    card = new Card(value, suit);
    card_2 = new Card(value_2, suit_2);
    card_3 = new Card(value_3, suit_3);
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
  public void testGetSuit(){
    assertEquals("HEARTS", card.getSuit().toString());
    assertEquals("SPADES", card_2.getSuit().toString());
    assertEquals("CLUBS", card_3.getSuit().toString());
  }
}