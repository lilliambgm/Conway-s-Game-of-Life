import java.util.Arrays;
import java.util.Scanner;

/// The rules for Conway's Game of Life are as follows:
/// 1. Any live cell with fewer than two live neighbours dies, as if by underpopulation;
/// 2. Any live cell with two or three live neighbours lives on to the next generation;
/// 3. Any live cell with more than three live neighbours dies, as if by overpopulation;
/// 4. Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.

public class Main {
    // ToDo Add comments to what I'm doing here, and change things about so that logic happens in functions, and not just in the main class!
    static void main(String[] args) {
        int width;
        int height;
        Scanner input = new Scanner(System.in);

        System.out.println("Hello to my version of Conway's Game of Life!");
        System.out.print("What would you like the width of the grid to be? ");
        width = Integer.parseInt(input.next());
        System.out.print("What would you like to be the height of the grid to be? ");
        height = Integer.parseInt(input.next());
        String[][] game = new String[height][width];
        for (int i = 0; i < height; i++){
            for (int ii = 0; ii < width; ii++){
                game[i][ii] = new Cell().cell();
                System.out.print(game[i][ii]);
            }
            System.out.println();
        }
        input.close();
    }
}
