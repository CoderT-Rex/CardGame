import java.util.ArrayList;

public class StarterDeck {


    public static ArrayList<Card> starterDeck(String playerClass){
        ArrayList<Card> starterDeck = new ArrayList<Card>();

        int numberOfBasicDefends;
        int numberOfBasicAttacks;

        // Add class-specific cards
        if (playerClass.equals("Knight")) {
            for(int numberOfSwordStrikes = 2; numberOfSwordStrikes != 0; numberOfSwordStrikes--)
                starterDeck.add(CardDatabase.SwordStrike);
            for(int numberOfShields = 2; numberOfShields != 0; numberOfShields--)
                starterDeck.add(CardDatabase.Shield);
            numberOfBasicAttacks = 3;
            numberOfBasicDefends = 3;
        }
        else if (playerClass.equals("Rogue")) {
            for(int numberOfBackstabs = 2; numberOfBackstabs != 0; numberOfBackstabs--)
                starterDeck.add(CardDatabase.Backstab);

//           for(int numberOfHides = 1; numberOfHides != 0; numberOfHides--) This line can be added if more than
//           one hide is needed later on.
            starterDeck.add(CardDatabase.Hide);

            for(int numberOfSmokeBombs = 2; numberOfSmokeBombs != 0; numberOfSmokeBombs--)
                starterDeck.add(CardDatabase.SmokeBomb);

            numberOfBasicAttacks = 3;
            numberOfBasicDefends = 2;
        }
        else if (playerClass.equals("Wizard")) {
            for (int numberOfFirebolts = 3; numberOfFirebolts != 0; numberOfFirebolts--)
                starterDeck.add(CardDatabase.Firebolt);

//           for(int numberOfFireballs = 1; numberOfFireballs != 0; numberOfFireballs--) This line can be added if more than
//           one Fireball is needed after testing.
            starterDeck.add(CardDatabase.Fireball);

            numberOfBasicAttacks = 1;
            numberOfBasicDefends = 4;
        }
        //These default values should never be called
        else {
            numberOfBasicDefends = 4;
            numberOfBasicAttacks = 4;
        }
        // Add basic cards to all decks
        while (numberOfBasicAttacks != 0) {
            starterDeck.add(CardDatabase.Strike);
            numberOfBasicAttacks--;
        }
        while (numberOfBasicDefends != 0) {
            starterDeck.add(CardDatabase.Defend);
            numberOfBasicDefends--;
        }
        return starterDeck;
    }
}
