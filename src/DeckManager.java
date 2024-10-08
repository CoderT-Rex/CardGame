import java.util.ArrayList;

public class DeckManager {
    public static void shuffle(ArrayList<Card> deck) {
        int n = deck.size();
        for (int i = n - 1; i > 0; i--) {
            int j = Main.random.nextInt(i + 1);
            // Swap elements
            Card temp = deck.get(i);
            deck.set(i, deck.get(j));
            deck.set(j, temp);
        }
    }
}
