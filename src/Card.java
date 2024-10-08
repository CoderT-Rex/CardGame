public class Card {
    private String name;
    private String color;
    private int id;
    private int cardLevel;

    public Card(String name, String color, int id, int cardLevel) {
        this.name = name;
        this.color = color;
        this.id = id;
        this.cardLevel = cardLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public int getCardLevel() {
        return cardLevel;
    }

    public void setCardLevel(int cardLevel) {
        this.cardLevel = cardLevel;
    }
}
