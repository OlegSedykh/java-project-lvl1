package hexlet.code.Game;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import java.util.Scanner;

import static hexlet.code.Engine.playerName;

public class Even {
    public static void gameEven() {
        Engine.toGreet();

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        String[][] questionsAndAnswersEven = new String[3][2];

        for (var i = 0; i < 3; i++) {
            int number1 = RandomUtils.nextInt(0, 100);
            questionsAndAnswersEven[i][0] = Integer.toString(number1);
            questionsAndAnswersEven[i][1] = Even.searchEvenOrNo(number1);
        }

        Engine.toGame(questionsAndAnswersEven);

    }

    public static String searchEvenOrNo(int n1) {
        if (n1 % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
