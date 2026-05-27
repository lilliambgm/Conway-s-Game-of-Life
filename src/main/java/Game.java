/*
 * This class is supposed to mainly represent the game field. This includes
 * things like declaring the game field, and updating the game field every frame.
 */

public class Game {
    String[][] game;
    Cell[][] gameCells;
    public Game(int height, int width) {
        game =  new String[height][width];
        gameCells = new Cell[height][width];
    }
}
