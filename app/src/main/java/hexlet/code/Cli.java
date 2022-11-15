package hexlet.code;
import java.util.Scanner;


public class Cli {

    private static String playerName;

    public static String getPlayerName() {
        return playerName;
    }

    public static void setPlayerName(String name) {
        playerName = name;
    }
    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        setPlayerName(scanner.next());
        System.out.println("Hello, " + playerName + "!");


    }
}
