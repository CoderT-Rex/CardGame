package com.github.codertrex.cardgame;

import java.util.Random;
import java.util.Scanner;

import com.github.codertrex.cardgame.card.Card;
import com.github.codertrex.cardgame.card.DeckManager;
import com.github.codertrex.cardgame.character.Character;
import com.github.codertrex.cardgame.character.CharacterCreation;
import com.github.codertrex.cardgame.control.ColorText;
import com.github.codertrex.cardgame.control.Pause;
import com.github.codertrex.cardgame.level.LevelPicker;

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
            System.out.print(ColorText.colorize(card.getName(), card.getCardClass().getColor())+" ");
        }
        System.out.println();

// */
        while (gameOver != true) {
            LevelPicker.levelPicker(1, character);
        }

        }}