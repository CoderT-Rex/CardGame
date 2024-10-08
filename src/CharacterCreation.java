import java.util.Random;
import java.util.Scanner;

public class CharacterCreation {
    private static String playerName = "";
    private static String playerClass = "";
    private static String winCondition = "";

    public static String createName() {
        System.out.println("Hello Adventurer.");
        while (true) {
            System.out.print("What is your name? ");
            playerName = Main.playerInput.nextLine();
            System.out.print(playerName + ", are you sure? y/n ");
            String confirm = Main.playerInput.nextLine();
            if (confirm.equalsIgnoreCase("y") || confirm.equalsIgnoreCase("yes")) {
                break;
            }
        }
        return playerName;
    }

    public static String chooseClass() {
        while (true) {
            System.out.println(playerName + " what is your class? 1 = Knight, 2 = Rogue, 3 = Wizard");
            playerClass = Main.playerInput.nextLine();
            if (playerClass.equalsIgnoreCase("Knight") || playerClass.equalsIgnoreCase("1")) {
                System.out.println("The Knight, one average in both attack and defense though exceptional an neither. " +
                        "A well balanced class.");
                playerClass = "Knight";
            }
            else if (playerClass.equalsIgnoreCase("Rogue") || playerClass.equalsIgnoreCase("2")){
                System.out.println("The Rogue, tries to sneak up on enemies for high risk, high reward encounters.");
                playerClass = "Rogue";
            }
            else if (playerClass.equalsIgnoreCase("Wizard") || playerClass.equalsIgnoreCase("3")){
                System.out.println("The Wizard, high damage spells but poor physical defense.");
                playerClass = "Wizard";
            }
            else if (playerClass.equalsIgnoreCase("Bard") || playerClass.equalsIgnoreCase("69")) {
                System.out.println("Nice. You a Bard. With nothing but your lute in hand, you try to sweet talk (or sleep with)\nany enemies.");
                playerClass = "Bard";
            }
            else {
                System.out.println("Invalid Selection");
                continue;
            }
            System.out.print("Are you sure? y/n ");
            String confirm = Main.playerInput.nextLine();
            if (confirm.equalsIgnoreCase("y") || confirm.equalsIgnoreCase("yes")) {
                break;
            }
        }
        return playerClass;
    }
    public static String characterOrigin() {
       int originSelector = Main.random.nextInt(5);
        if (playerClass.equalsIgnoreCase("Knight") && originSelector == 0) {
            System.out.println(playerName + ", Son of Dahnthar, trusted protector of the land of Schimar. You have\n" +
                    "traveled far into the lands of the West to seek aid for your sire the King. He is sick. This man\n" +
                    "who has been your leader and friend through many battles lays on the verge of death from a dark illness\n" +
                    "none in the land have ever seen. You hear tell of a monk known to work wonders, but his habitation is \n" +
                    "far and time is running out.");
            System.out.println();
            System.out.println("You will win the game if you find a cure and make it back to the King in time.");
            winCondition = "Find the cure";
        }
        else if (playerClass.equalsIgnoreCase("Knight") && originSelector == 1) {
            System.out.println(playerName + ", last scion of the fallen kingdom of Arathor. You were but a child when \n" +
                    "the forces of darkness overwhelmed your homeland. Raised in exile by the elves of Silverwood, \n" +
                    "you have trained for this moment your entire life. A prophecy speaks of a lost artifact, the Crown \n" +
                    "of Stars, which could restore your kingdom and drive back the shadow. Your quest begins here.");
            System.out.println("\nYou will win the game if you recover the Crown of Stars and reclaim your throne.");
            winCondition = "Reclaim the throne";
        }
        else if (playerClass.equalsIgnoreCase("Knight") && originSelector == 2) {
            System.out.println(playerName + ", once the captain of the royal guard, now a disgraced exile. Framed for \n" +
                    "the assassination of the beloved Queen, you've spent years in hiding, gathering evidence to clear \n" +
                    "your name. Now, with whispers of a grand conspiracy reaching your ears, you emerge from the shadows \n" +
                    "to uncover the truth and bring justice to those who wronged you.");
            System.out.println("\nYou will win the game if you expose the conspiracy and restore your honor.");
            winCondition = "Clear your name";
        }
        else if (playerClass.equalsIgnoreCase("Knight") && originSelector == 3) {
            System.out.println(playerName + ", Commander of the Crimson Lance, an order of knights sworn to protect \n" +
                    "the realm from otherworldly threats. A planar rift has opened near the village of Millbrook, \n" +
                    "spewing forth aberrations and twisting the very fabric of reality. You must lead a band of heroes \n" +
                    "to seal the rift before it's too late.");
            System.out.println("\nYou will win the game if you close the planar rift and save the realm.");
            winCondition = "Seal the rift";
        }
        if (playerClass.equalsIgnoreCase("Knight") && originSelector == 4) {
            System.out.println(playerName + ", Paladin of the Radiant Dawn, chosen champion of the god of light. \n" +
                    "An ancient evil stirs in the depths of the world, threatening to plunge all lands into eternal \n" +
                    "darkness. Guided by divine visions, you must assemble the five Shards of Hope, legendary \n" +
                    "artifacts scattered across treacherous lands, to forge a weapon capable of vanquishing this \n" +
                    "primordial threat.");
            System.out.println("\nYou will win the game if you forge the weapon of light and defeat the ancient evil.");
            winCondition = "Forge the weapon of light";
        }
        if (playerClass.equalsIgnoreCase("Rogue")) {
            switch (originSelector) {
                case 0:
                    System.out.println(playerName + ", the infamous Shadow of Ravencrest, master thief and infiltrator. \n" +
                            "Your legendary heists have made you wealthy beyond measure, but your latest job has gone \n" +
                            "terribly wrong. You've stolen an artifact of immense magical power from the wrong person: \n" +
                            "the Archmagus of the Crimson Tower. Now, you're caught in a deadly game of cat and mouse, \n" +
                            "trying to unravel the artifact's secrets before the Archmagus and his agents catch up to you.");
                    System.out.println("\nYou will win the game if you unlock the artifact's power and use it to defeat the Archmagus.");
                    winCondition = "Master the artifact";
                    break;
                case 1:
                    System.out.println(playerName + ", once a street urchin in the sprawling port city of Freehold, \n" +
                            "now the spymaster of the Thieves' Guild. Your network of informants has uncovered a plot \n" +
                            "that threatens not just your guild, but the entire city. A cult dedicated to the Void god \n" +
                            "plans to open a portal in the heart of Freehold, unleashing chaos and destruction. With the \n" +
                            "city guard in the cult's pocket, it's up to you and your rogues to save the day from the shadows.");
                    System.out.println("\nYou will win the game if you expose the cult and prevent the summoning ritual.");
                    winCondition = "Thwart the cult";
                    break;
                case 2:
                    System.out.println(playerName + ", the Whisper in the Court, a noble-born rogue with a silver tongue \n" +
                            "and a heart of gold. For years, you've played the game of courtly intrigue, using your \n" +
                            "position to help the downtrodden. But now, you've uncovered evidence of corruption that \n" +
                            "goes all the way to the throne. With a usurper pulling the strings and a legitimate heir in \n" +
                            "hiding, you must navigate a web of lies and danger to set things right.");
                    System.out.println("\nYou will win the game if you expose the usurper and restore the rightful heir to the throne.");
                    winCondition = "Restore the rightful heir";
                    break;
                case 3:
                    System.out.println(playerName + ", known in whispered legends as the Veil Walker, a rogue with the \n" +
                            "extraordinary ability to step between planes of existence. Your gift has made you the \n" +
                            "perfect thief, but it's also drawn the attention of the Planar Conclave, a powerful \n" +
                            "organization that polices inter-dimensional travel. They've given you an ultimatum: help \n" +
                            "them track down a dangerous reality-hopping criminal, or be imprisoned in a timeless void \n" +
                            "for eternity.");
                    System.out.println("\nYou will win the game if you catch the inter-dimensional criminal and secure your freedom.");
                    winCondition = "Catch the criminal";
                    break;
            }
        }
        if (playerClass.equalsIgnoreCase("Wizard")) {
            switch (originSelector) {
                case 0:
                    System.out.println(playerName + ", the Archmage of the Shifting Citadel, master of space and time. \n" +
                            "Your magical fortress exists in multiple realities simultaneously, a nexus of infinite possibilities.\n " +
                            "But a catastrophic spell has shattered this delicate balance, causing realities to bleed into one another.\n " +
                            "Now, you must journey across fractured dimensions, gathering the fragments of a cosmic keystone\n " +
                            "to restore the barriers between worlds before all of reality unravels.");
                    System.out.println("\nYou will win the game if you reassemble the cosmic keystone and mend the fabric of reality.");
                    winCondition = "Restore reality";
                    break;
                case 1:
                    System.out.println(playerName + ", once the most promising student at the Academy of Planar Studies,\n " +
                            "now an exile branded as a dangerous rogue elementalist. Your breakthrough in merging elemental\n " +
                            "magics was deemed too dangerous by the conservative archmagi. Forced to flee, you've spent years\n " +
                            "perfecting your art in secret. Now, as an extraplanar invasion threatens the material plane,\n " +
                            "your forbidden knowledge may be the realm's only hope.");
                    System.out.println("\nYou will win the game if you repel the extraplanar invasion and prove the value of your magical theories.");
                    winCondition = "Repel the invasion";
                    break;
                case 2:
                    System.out.println(playerName + ", the reluctant inheritor of an ancient and terrible power. Born with\n " +
                            "a crystal embedded in your chest, you've always known you were different. Now, on the eve of\n " +
                            "your 30th birthday, you've discovered the truth: you're the latest in a line of guardians\n " +
                            "tasked with keeping an elder god imprisoned. As your power grows, so does the god's influence.\n " +
                            "You must master your abilities and uncover the secrets of your lineage before the god breaks free.");
                    System.out.println("\nYou will win the game if you reinforce the elder god's prison and break the cycle of guardianship.");
                    winCondition = "Imprison the elder god";
                    break;
                case 3:
                    System.out.println(playerName + ", the Chronicler of Lost Lore, a wizard obsessed with rediscovering\n " +
                            "the magic of bygone eras. Your research has led you to believe that the fabled Golden Age of Magic\n " +
                            "was more than just a myth. You've discovered references to an ancient library, the Opus Etherialis,\n " +
                            "said to contain the sum of all magical knowledge. But dark forces are also seeking this power,\n " +
                            "and the library's magical defenses grow more unstable with each passing day.");
                    System.out.println("\nYou will win the game if you locate the Opus Etherialis and preserve its knowledge before it's lost forever.");
                    winCondition = "Preserve ancient knowledge";
                    break;
            }
        }
        return winCondition;
    }
}
