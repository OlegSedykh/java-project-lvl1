package hexlet.code;
import java.util.Scanner;

import static hexlet.code.Engine.setPlayerName;
import static hexlet.code.Engine.getPlayerName;

public class Cli {
    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        setPlayerName(scanner.next());
        System.out.println("Hello, " + getPlayerName() + "!");


    }
}
