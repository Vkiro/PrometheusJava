package week3.task2;

import org.junit.Test;

public class DeckTest {
    Deck deck = new Deck();
    @Test
    public void shuffle() throws Exception {
        deck.shuffle();
    }

    @Test
    public void order() throws Exception {
        deck.shuffle();
        deck.order();
    }

    @Test
    public void hasNext() throws Exception {
        System.out.println(deck.hasNext());
    }

    @Test
    public void drawOne() throws Exception {
        for (int i = 0; i < 36; i++) {
            deck.drawOne();
        }
    }

}