package ankidroid;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private final List<Card> cards = new ArrayList<>();
    public String name;

    public Deck(String name) {
        this.name = name;
    }

    public void addCard(String front, String back){
        Card card = new Card(front,back);
        cards.add(card);
    }

    public List<Card> getCards(){
        return cards;
    }
}


