package com.github.codertrex.cardgame.card;

import com.github.codertrex.cardgame.control.ColorText.Color;
import static com.github.codertrex.cardgame.control.ColorText.Color.*;

public enum CardClass {
    NORMIE(WHITE),
    ROGUE(GREEN),
    WIZARD(PURPLE),
    KNIGHT(BLUE);

    private Color color;
    private CardClass(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
}
