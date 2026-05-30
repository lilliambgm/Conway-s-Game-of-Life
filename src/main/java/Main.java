import java.util.Scanner;

/**
 * The rules for Conway's game of Life are as follows:
 * 1. Any live cell with fewer than two live neighbours dies, as if by underpopulation;
 * 2. Any live cell with two or three live neighbours lives on to the next generation;
 * 3. Any live cell with more than three live neighbours dies, as if by overpopulation;
 * 4. Any dead cell with exactly three live neighbours becomes a live cell, as if by repopulation.
 *
 * @author Lilliam
 */

public class Main {
    static void main(String[] args) {
        Game game = new Game();
        Scanner input = new Scanner(System.in);
        System.out.println("Type \"Next\" or \"N\" to advance the game 1 frame, or type \"Exit\" to exit");
        int counter = 0;
        String userInput = input.next();
        while (!userInput.equals("Exit") && userInput.equals("Next") || userInput.equals("N")) {
            counter++;
            System.out.printf("Frame %3$d of your randomly generated game of life with height %1$d and width %2$d:\n", game.height, game.width, counter);
            userInput = input.next();
        }
    }
}
