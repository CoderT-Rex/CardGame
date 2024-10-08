public class DefenseCard extends Card {
    private int defence;
    private int cost;
    private int energyCost;
    public DefenseCard(String name, String color, int id, int cardLevel, int defense, int cost, int energyCost) {
        super(name, color, id, cardLevel);
    }
    public int getDefence() {
        return defence;
    }

    public int getCost() {
        return cost;
    }

    public int getEnergyCost() {
        return energyCost;
    }

}