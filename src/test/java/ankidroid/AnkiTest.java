package ankidroid;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class AnkiTest {
    @Test
    public void itShuoldGiveTheNameOfTheDeck() {
        Deck name = new Deck("dictionary");
        assertEquals("dictionary", name.name);
    }

    @Test
    public void itShouldGiveTheStringdOfForwardAndBackward() {
        Card frontBack = new Card("forward", "backward");
        assertEquals("forward, backward", frontBack.toString());

    }

    @Test
    public void itShouldAddTheCardInTheListOfCards() {
        Deck java = new Deck("java");
        List<Card> cards = new ArrayList<>();
        Card card = new Card("front", "back");
        java.getCardInDeck("front","back");
        cards.add(card);
        assertEquals(cards,java.createCard());
    }
    @Test
    public void itShouldAddMultipleCardsInTheListOfCards() {
        Deck java = new Deck("java");
        List<Card> cards = new ArrayList<>();
        Card card = new Card("front", "back");
        Card anotherCard = new Card("shortcut to constructor","command");
        java.getCardInDeck("front","back");
        java.getCardInDeck("shortcut to constructor","command");
        cards.add(card);
        cards.add(anotherCard);
        assertEquals(cards,java.createCard());
    }

}
