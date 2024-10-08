import java.util.ArrayList;

public class Character {
    private int lvl;
    private String name;
    private String playerClass;
    private String winCondition;
    private ArrayList<Card> deck;

    private int health;

    public Character(int lvl, String name, String playerClass, String winCondition) {
        this.lvl = lvl;
        this.name = name;
        this.playerClass = playerClass;
        this.winCondition = winCondition;
        deck = new ArrayList<>(StarterDeck.starterDeck(this.playerClass));
        switch(playerClass){
            case("Knight"):
                health = 90;
                break;
            case("Rogue"):
                health = 70;
                break;
            case ("Wizard"):
                health = 64;
                break;
            default:
                health = 1;
                break;
        }
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public String getWinCondition() {
        return winCondition;
    }

    public void setWinCondition(String winCondition) {
        this.winCondition = winCondition;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public int getHealth() {
        return health;
    }

    public int loseHealth(int damage){
        health -= damage;
        return health;
    }
}
