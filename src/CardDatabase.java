public class CardDatabase {
    //Basic Cards
    public static final AttackCard Strike = new AttackCard("Strike", "WHITE", 1, 0, 6, 0, 1);
    public static final DefenseCard Defend = new DefenseCard("Defend", "WHITE", 2, 0, 5, 0, 1);

    //Knight Cards
    public static final KnightAttackCard SwordStrike = new KnightAttackCard("Sword Strike", 3, 1, 8, 0, 1);
    public static final KnightDefenseCard Shield = new KnightDefenseCard("Shield",4, 1, 8, 0, 1);

    //Rogue Cards
    public static final RogueAttackCard Backstab = new RogueAttackCard("Backstab",8, 13, 1, 0, 1);
    public static final RogueCard Hide = new RogueCard("Hide",14, 1, 0, 1);
    public static final RogueCard SmokeBomb = new RogueCard("Smoke Bomb",15, 1, 0, 1);

    //Wizard Cards
    public static final WizardAttackCard Firebolt = new WizardAttackCard("Firebolt",23, 1, 13, 0, 1);
    public static final WizardAttackCard Fireball = new WizardAttackCard("Fireball",24, 1, 20, 0, 2);
}
