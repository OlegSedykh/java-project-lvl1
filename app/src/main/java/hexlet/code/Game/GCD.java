package hexlet.code.Game;

import hexlet.code.Cli;
import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Engine.*;

public class GCD {

    public static void gameGCD() {
        Cli.greet();

        System.out.println("Find the greatest common divisor of given numbers.");

        String[][] questionsAndAnswersGCD = new String[COUNT_ROUNDS][SUM_QUESTION_AND_ANSWER];

        for (var i = 0; i < COUNT_ROUNDS; i++) {
            int number1 = RandomUtils.nextInt(0, MAX_RANDOM_NUMBER);
            int number2 = RandomUtils.nextInt(0, MAX_RANDOM_NUMBER);
            questionsAndAnswersGCD[i][0] = Integer.toString(number1) + " " + Integer.toString(number2);
            questionsAndAnswersGCD[i][1] = Integer.toString(searchGcd(number1, number2));
        }

        Engine.playGame(questionsAndAnswersGCD);

    }

    public static int searchGcd(int n1, int n2) {
        if (n1 == 0) {
            return n2;
        }
        if (n2 == 0) {
            return n1;
        }
        int gcd = 1;
        for (var ii = 1; ii <= n1 && ii <= n2; ii++) {
            if (n1 % ii == 0 && n2 % ii == 0) {
                gcd = ii;
            }
        }
        return gcd;
    }
}
