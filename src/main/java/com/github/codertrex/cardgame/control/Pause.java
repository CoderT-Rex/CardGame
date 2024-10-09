package com.github.codertrex.cardgame.control;

import com.github.codertrex.cardgame.Main;

public class Pause {
    public static void pause(){
        System.out.println("Press 'Enter' to Continue...");
        Main.playerInput.nextLine();
    }
}
