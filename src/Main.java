import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static boolean gameOver = false;
    public static Scanner playerInput = new Scanner(System.in);
    public static Random random = new Random();
    public static void main(String[] args) {
        Character character = new Character(1, CharacterCreation.createName(), CharacterCreation.chooseClass(), CharacterCreation.characterOrigin());
        Pause.pause();
//     Test code to display deck, will move elsewhere later.
        System.out.println("Starting deck:");
        DeckManager.shuffle(character.getDeck());
        for (Card card : character.getDeck()){
            System.out.print(ColorText.colorize(card.getName(), card.getColor())+" ");
        }
        System.out.println();

// */
        while (gameOver != true) {
            LevelPicker.levelPicker(1, character);
        }

        }}