package com.github.codertrex.cardgame.level;
import java.util.Random;

import com.github.codertrex.cardgame.Main;
import com.github.codertrex.cardgame.character.Character;

public class LevelPicker {
    final private static int NUMBER_OF_POSSIBLE_LEVEL_1_DUNGEONS = 1;
    final private static int NUMBER_OF_POSSIBLE_LEVEL_2_DUNGEONS = 1;
    final private static int NUMBER_OF_POSSIBLE_LEVEL_3_DUNGEONS = 1;
    private static Random random = new Random();


    public static void levelPicker(int level, Character character) {
        int numberOfPossibleLevels;
        switch(level){
            case 1:
                numberOfPossibleLevels = NUMBER_OF_POSSIBLE_LEVEL_1_DUNGEONS;
                break;
            case 2:
                numberOfPossibleLevels = NUMBER_OF_POSSIBLE_LEVEL_2_DUNGEONS;
                break;
            case 3:
                numberOfPossibleLevels = NUMBER_OF_POSSIBLE_LEVEL_3_DUNGEONS;
                break;
            default:
                numberOfPossibleLevels = 1;
                break;
        }
        int randomDunegon = random.nextInt(numberOfPossibleLevels);

        switch(level){
            case 1:
                switch(randomDunegon){
                    case 0:
                        Main.gameOver = ForestDungeon.play(character);
                }
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
    }
}
