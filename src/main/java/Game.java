/*
 * This class is supposed to mainly represent the game field. This includes
 * things like declaring the game field, and updating the game field every frame.
 */

public class Game {
    // Declaring variables that will be used throughout the whole Game class.
    String[][] game;
    Cell[][] gameCells;

    // Constructor will prompt the user for the desired game dimensions
    public Game() {
        int height = Integer.parseInt(Helper.prompter("What would you like the height of the game to be?"));
        int width = Integer.parseInt(Helper.prompter("What would you like the width of the game to be?"));
        game = new String[height][width];
        gameCells = new Cell[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                gameCells[i][j] = new Cell();
                game [i][j] = gameCells[i][j].getState();
                System.out.print(game[i][j]);
            }
            System.out.println();
        }
    }
}
