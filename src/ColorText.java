public class ColorText {
    // ANSI escape codes for colors
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String PURPLE = "\u001B[35m";
    private static final String CYAN = "\u001B[36m";
    private static final String WHITE = "\u001B[37m";

    public static String colorize(String text, String color) {
        String colorCode = getColorCode(color);
        return colorCode + text + RESET;
    }

    private static String getColorCode(String color) {
        return switch (color.toUpperCase()) {
            case "RED" -> RED;
            case "GREEN" -> GREEN;
            case "YELLOW" -> YELLOW;
            case "BLUE" -> BLUE;
            case "PURPLE" -> PURPLE;
            case "CYAN" -> CYAN;
            case "WHITE" -> WHITE;
            default -> RESET;
        };
    }
}
