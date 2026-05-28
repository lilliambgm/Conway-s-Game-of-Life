import java.util.Scanner;

public class Helper {
    private static Scanner input = new Scanner(System.in);
    public static void print(String s){
        System.out.println(s);
    }

    public static String prompter(String s){
        System.out.println(s);
        return input.nextLine();
    }
}
