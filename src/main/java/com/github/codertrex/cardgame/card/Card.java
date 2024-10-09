package com.github.codertrex.cardgame.card;
public class Card {
    
    private String name;
    private CardClass cardClass;
    private Ability ability;
    private int id;
    private int cardLevel;

    public Card(String name, CardClass cardClass, Ability ability, int id, int cardLevel) {
        this.name = name;
        this.cardClass = cardClass;
        this.ability = ability;
        this.id = id;
        this.cardLevel = cardLevel;
    }

    public String getName() {
        return name;
    }

    public CardClass getCardClass(){
        return cardClass;
    }

    public Ability getAbility() {
        return ability;
    }

    public int getId() {
        return id;
    }

    public int getCardLevel() {
        return cardLevel;
    }

}
