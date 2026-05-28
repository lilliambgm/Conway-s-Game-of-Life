import java.util.Scanner;

public class Helper {
    private static Scanner input = new Scanner(System.in);

    //<editor-fold desc="Prompter">
    // Method to ask a question in console and instantly return a user input as a string.
    public static String prompter(String s){
        System.out.println(s);
        return input.nextLine();
    }
    //</editor-fold>
}
