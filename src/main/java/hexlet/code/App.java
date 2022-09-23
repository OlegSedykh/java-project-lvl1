package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
        Scanner choice = new Scanner(System.in);
        System.out.print("Your choice: ");
        int choiceNumberGame = choice.nextInt();
        System.out.println();
        switch (choiceNumberGame) {
            case 1:
                Greet.toGreet();
                break;
            case 2:
                Even.gameEven();
                break;
        }
    }
}
