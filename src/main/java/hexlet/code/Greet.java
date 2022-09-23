package hexlet.code;
import java.util.Scanner;

public class Greet {
    public static void toGreet() {
        System.out.println("Welcome to the Brain Games!");
        Scanner name = new Scanner(System.in);
        System.out.print("May I have your name? ");
        var playerName = name.next();
        //System.out.println("");
        System.out.println("Hello, " + playerName + "!");

    }
}
