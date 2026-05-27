/*
 * The rules for Conway's game of Life are as follows:
 * 1. Any live cell with fewer than two live neighbours dies, as if by underpopulation;
 * 2. Any live cell with two or three live neighbours lives on to the next generation;
 * 3. Any live cell with more than three live neighbours dies, as if by overpopulation;
 * 4. Any dead cell with exactly three live neighbours becomes a live cell, as if by repopulation.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    // Defining variables we're using throughout the whole game.
    protected static int width;
    protected static int height;
    // Setting up the scanner as I think
    protected static Scanner input = new Scanner(System.in);

    static void main(String[] args) {
    }
}
