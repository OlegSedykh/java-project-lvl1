package hexlet.code;
import java.util.Scanner;

import static hexlet.code.Engine.playerName;


public class Cli {
    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        playerName = scanner.next();
        System.out.println("Hello, " + playerName + "!");


    }
}
