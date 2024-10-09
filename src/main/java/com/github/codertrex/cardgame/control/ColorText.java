package com.github.codertrex.cardgame.control;
public class ColorText {
    public enum Color {
        // ANSI escape codes for colors
        RESET("\u001B[0m"),
        RED("\u001B[31m"),
        GREEN("\u001B[32m"),
        YELLOW("\u001B[33m"),
        BLUE("\u001B[34m"),
        PURPLE("\u001B[35m"),
        CYAN("\u001B[36m"),
        WHITE("\u001B[37m");
        
        private String ansiCode;

        private Color(String ansiCode){
            this.ansiCode = ansiCode;
        }
        public String getAnsiCode() {
            return ansiCode;
        }
    }

    public static String colorize(String text, Color color) {
        String colorCode = color.getAnsiCode();
        return colorCode + text + Color.RESET.ansiCode;
    }

}
