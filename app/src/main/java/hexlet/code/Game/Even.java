package hexlet.code.Game;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import java.util.Scanner;

import static hexlet.code.Engine.playerName;

public class Even {
    public static void gameEven() {
        Engine.toGreet();

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        Scanner answer = new Scanner(System.in);
        for (var i = 0; i < 3; i++) {
            int question = RandomUtils.nextInt(1, 100);
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            var playerAnswer = answer.next();
            if ((playerAnswer.equals("yes") && question % 2 == 0) || ((playerAnswer.equals("no") && question % 2 != 0))) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + playerName + "!");
                }
            } else if (!(playerAnswer.equals("yes")) && question % 2 == 0) {
                System.out.println("'" + playerAnswer + "'" + " is wrong answer ;(. Correct answer was 'yes'.\nLet's try again, " + playerName + "!");
                break;
            } else {
                System.out.println("'" + playerAnswer + "'" + " is wrong answer ;(. Correct answer was 'no'.\nLet's try again, " + playerName + "!");
                break;
            }
        }
    }
}
