package com.github.codertrex.cardgame.card;
public class Ability {

    public enum EffectType {
        NONE,
        ATTACK,
        DEFENSE;
    }

    private Ability.EffectType effectType;
    private int effectAmount;
    private int cost;
    private int energy;

    private Ability(EffectType effectType, int effectAmount, int cost, int energy){
        this.effectType = effectType;
    }

    public static Ability none(){
        return new Ability(EffectType.NONE, 0, 0,0);
    }

    public static Ability attack(int amount, int cost, int energy) {
        return new Ability(EffectType.ATTACK, amount, cost, energy);
    }

    public static Ability defense(int amount, int cost, int energy) {
        return new Ability(EffectType.DEFENSE, amount, cost, energy);
    }

    public EffectType getEffectType(){
        return effectType;
    }
    public int getEffectAmount(){
        return effectAmount;
    }
    public int getCost() {
        return cost;
    }
    public int getEnergy() {
        return energy;
    }
}
