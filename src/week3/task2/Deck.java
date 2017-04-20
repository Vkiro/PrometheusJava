package week3.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> list = new ArrayList<>();

    public Deck() {
        for (int i = 0; i < Rank.values.length; i++) {
            for (int j = 0; j < Suit.values.length; j++) {
                list.add(new Card(Rank.values[i], Suit.values[j]));
            }
        }
    }

    //Перемішує колоду у випадковому порядку
    public void shuffle() {
        Collections.shuffle(list);
    }

    /* * Впорядкування колоди за мастями та значеннями
    * Порядок сотрування:
    * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
    * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
    * Наприклад
    * HEARTS Ace
    * HEARTS King
    * HEARTS Queen
    * HEARTS Jack
    * HEARTS 10
    * HEARTS 9
    * HEARTS 8
    * HEARTS 7
    * HEARTS 6
    * І так далі для DIAMONDS, CLUBS, SPADES */
    public void order() {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (isSmaller(list.get(j), list.get(j + 1))) {
                    Collections.swap(list, j, j + 1);
                }
            }

        }
    }

    private boolean isSmaller(Card first, Card second) {
        if (compareSuits(first.getSuit(), second.getSuit()) == -1) {
            return true;
        } else if (compareSuits(first.getSuit(), second.getSuit()) == 1) {
            return false;
        } else {
            if (compareRank(first.getRank(), second.getRank()) == -1) {
                return true;
            } else if (compareRank(first.getRank(), second.getRank()) == 1) {
                return false;
            } else {
                // Exception
                return false;
            }
        }
    }

    private int compareRank(Rank first, Rank second) {
        if (first.getName().equals(second.getName())) {
            return 0;
        } else if (Arrays.asList(Rank.values).indexOf(first) < Arrays.asList(Rank.values).indexOf(second)) {
            return 1;
        } else {
            return -1;
        }
    }

    private int compareSuits(Suit first, Suit second) {
        if (first.getName().equals(second.getName())) {
            return 0;
        } else if (Arrays.asList(Suit.values).indexOf(first) < Arrays.asList(Suit.values).indexOf(second)) {
            return 1;
        } else {
            return -1;
        }
    }

    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
        return !list.isEmpty();
    }

    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
        return list.remove(list.size() - 1);
    }
}
