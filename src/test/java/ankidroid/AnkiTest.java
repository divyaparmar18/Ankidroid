package ankidroid;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class AnkiTest {
    @Test
    public void itShuoldGiveTheNameOfTheDeck(){
        Deck name = new Deck("dictionary");
        assertEquals("dictionary",name.name);
    }
    @Test
    public void itShouldGiceTheStringdOfForwardANdBackward(){
        Card frontBack = new Card("forward","backward");
        assertEquals("forward , backward",frontBack.toString());

    }
}
