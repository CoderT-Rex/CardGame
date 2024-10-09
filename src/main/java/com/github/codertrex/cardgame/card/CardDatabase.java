package com.github.codertrex.cardgame.card;

import static com.github.codertrex.cardgame.card.CardClass.*;

public class CardDatabase {
    //Basic Cards
    public static final Card STRIKE         = new Card("Strike",        NORMIE, Ability.attack(  6, 0, 1),  1, 0);
    public static final Card DEFEND         = new Card("Defend",        NORMIE, Ability.defense( 5, 0, 1),  2, 0);

    //Knight Cards
    public static final Card SWORD_STRIKE   = new Card("Sword Strike",  KNIGHT, Ability.attack(  8, 0, 1),  3, 1);
    public static final Card SHIELD         = new Card("Shield",        KNIGHT, Ability.defense( 8, 0, 1),  4, 1);

    //Rogue Cards
    public static final Card BACKSTAB       = new Card("Backstab",      ROGUE, Ability.attack(   1, 0, 1),  8,  13);
    public static final Card HIDE           = new Card("Hide",          ROGUE, Ability.none(),                                 14, 1);
    public static final Card SMOKE_BOMB     = new Card("Smoke Bomb",    ROGUE, Ability.none(),                                 15, 1);

    //Wizard Cards
    public static final Card FIREBOLT       = new Card("Firebolt",      WIZARD, Ability.attack( 13, 0, 1),  23, 1);
    public static final Card FIREBALL       = new Card("Fireball",      WIZARD, Ability.attack( 20, 0, 2),  24, 1);
}
