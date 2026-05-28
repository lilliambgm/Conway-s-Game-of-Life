/*
 * This class is supposed to mainly represent the game field. This includes
 * things like declaring the game field, and updating the game field every frame.
 */

public class Game {
    String[][] game;
    Cell[][] gameCells;
    public Game() {
        int height = Integer.parseInt(Helper.prompter("What would you like the height of the game to be?"));
        int width = Integer.parseInt(Helper.prompter("What would you like the width of the game to be?"));
        game = new String[height][width];
        gameCells = new Cell[height][width];
    }
}
