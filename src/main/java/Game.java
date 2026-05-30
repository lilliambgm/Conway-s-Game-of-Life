/*
 * This class is supposed to mainly represent the game field. This includes
 * things like declaring the game field, and updating the game field every frame.
 */

public class Game {
    // Declaring variables that will be used throughout the whole Game class.
    String[][] game;
    Cell[][] gameCells;
    int height;
    int width;

    // Constructor will prompt the user for the desired game dimensions
    public Game() {
        System.out.println("Hello to my version of Conway's Game of Life!");
        this.height = Integer.parseInt(Helper.prompter("What would you like the height of the game to be?"));
        this.width = Integer.parseInt(Helper.prompter("What would you like the width of the game to be?"));
        game = new String[this.height][this.width];
        gameCells = new Cell[this.height][this.width];
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                gameCells[i][j] = new Cell();
                game [i][j] = gameCells[i][j].getState();
                System.out.print(game[i][j]);
            }
            System.out.println();
        }
    }

    private void updateGame() {

    }
}
