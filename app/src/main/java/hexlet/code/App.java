package hexlet.code;

import hexlet.code.Game.*;

import java.util.Scanner;

import static hexlet.code.Engine.toGreet;

public class App {

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        Scanner choice = new Scanner(System.in);
        System.out.print("Your choice: ");
        int choiceNumberGame = choice.nextInt();
        System.out.println();
        switch (choiceNumberGame) {
            case 1:
                Engine.toGreet();
                break;
            case 2:
                Even.gameEven();
                break;
            case 3:
                Calc.gameCalc();
                break;
            case 4:
                GCD.gameGCD();
                break;
            case 5:
                Progression.gameProgression();
                break;
            case 6:
                Prime.gamePrime();
                break;
            default:
                
        }
    }

}
