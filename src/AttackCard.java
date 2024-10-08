public class AttackCard extends Card {

    private int damage;
    private int cost;
    private int energyCost;
        public AttackCard(String name, String color, int id, int cardLevel, int damage, int cost, int energyCost) {
            super(name, color, id, cardLevel);
        }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
            if (this.damage > 0) {
            this.damage = damage;
        } else {
                throw new IllegalArgumentException("Damage cannot be negative");
            }
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
            if (this.cost >= 0) {
                this.cost = cost;
            } else {
                throw new IllegalArgumentException("Cost cannot be negative");
            }
    }

    public int getEnergyCost() {
        return energyCost;
    }

    public void setEnergyCost(int energyCost) {
        if (this.energyCost >= 0) {
            this.energyCost = energyCost;
        } else {
            throw new IllegalArgumentException("Cost cannot be negative");
        }
    }
}


