import static org.junit.Assert.*;
import org.junit.*;
import blackjack.*;
public class PlayerTest {
  
  CardValue two;
  CardValue king;
  CardValue ace;

  Suit hearts;
  Suit spades;
  Suit clubs;
  Suit diamonds;
  

  Card queenOfHearts;
  Card twoOfSpades;
  Card kingOfHearts;
  Card aceOfSpades;

  Player player_1;
  Player player_2;
  Player player_3;

  @Before 
  public void before(){
    hearts = Suit.values()[0];
    spades = Suit.values()[1];

    two = CardValue.values()[0];
    king = CardValue.values()[11];
    ace = CardValue.values()[12];

    queenOfHearts = new Card(value, hearts);
    twoOfSpades = new Card(two, spades);
    kingOfHearts = new Card(king, hearts);
    aceOfSpades = new Card(ace, spades);

    player_1 = new Player("Colin", queenOfHearts);
    player_2 = new Player("Chris", queenOfHearts);
    player_3 = new Player("John");
  }

  @Test
  public void testGetName(){
    assertEquals("Colin", player_1.getName());
    assertEquals("Chris", player_2.getName());
  }

  @Test 
  public void testCalculateHandValue(){
    player_1.calculateHandValue();
    assertEquals(12, player_1.getHandValue());
  }

  @Test
  public void testRevealHand(){
    player_1.revealHand();
    assertEquals("QUEEN OF HEARTS", player_1.revealHand());
  }

  @Test 
  public void testCanTakeAnotherCard(){
    player_3.calculateHandValue();
    assertEquals(0, player_3.getHandValue());

    player_3.takeCard(twoOfSpades);
    assertEquals(2, player_3.getHandValue());

    player_3.takeCard(queenOfHearts);
    assertEquals(14, player_3.getHandValue());
  }

  @Test 
  public void testBlackjackValues(){
    player_3.takeCard(kingOfHearts);
    player_3.takeCard(aceOfSpades);
    assertEquals(21, player_3.getBlackjackValue());
  }
}