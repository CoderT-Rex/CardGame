package com.github.codertrex.cardgame.level;
import com.github.codertrex.cardgame.Main;
import com.github.codertrex.cardgame.character.Character;
import com.github.codertrex.cardgame.control.Pause;

public class ForestDungeon {
    private static int room;
    public static boolean play(Character character){
        System.out.println("You wake up in a dense forest after a night of camping. \n" +
                " The air is thick with mist and the sound of rustling leaves.\n" +
                "Two paths lie before you that seem to head to your destination");
        System.out.print("Will you go right or left? ");
        String path = Main.playerInput.nextLine();
        if(path.equalsIgnoreCase("Right")){
            room = 1; }
        else if(path.equalsIgnoreCase(("Left"))){
            room = 5;
            System.out.println("This path seems shorter.");
            Pause.pause();
        }
        else{
            System.out.println("You pace in circles for a few minutes, unable to decide.");
            System.out.println("After taking a deep breath, you pick a path at random.");
            room = Main.random.nextInt(5);
        }
        while (character.getHealth() >= 0) {
            character.loseHealth(1000); //Temporary test code
            switch (room) {
                case 1:
                    System.out.println("You find yourself in a small clearing. Sunlight barely penetrates the thick canopy above.");
                    break;
                case 2:
                    System.out.println("You come across a babbling brook. The water looks refreshing, but is it safe to drink?");
                    break;
                case 3:
                    System.out.println("You enter a part of the forest where the trees seem older, their trunks wider and more gnarled.");
                    break;
                case 4:
                    System.out.println("You stumble upon an ancient stone structure, half-covered in vines and moss.");
                    break;
                case 5:
                    System.out.println("You reach a high point in the forest, offering a panoramic view of the surrounding wilderness.");
                    break;
                default:
                    System.out.println("You continue your journey through the mysterious forest.");
                    break;
            }
        }
        return true; //returns a Game Over
    }
}
