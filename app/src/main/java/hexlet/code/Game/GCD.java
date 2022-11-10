package hexlet.code.Game;

import hexlet.code.Cli;
import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Engine.COUNT_ROUNDS;
import static hexlet.code.Engine.SUM_QUESTION_AND_ANSWER;
import static hexlet.code.Engine.MAX_RANDOM_NUMBER;

public class GCD {

    public static void gameGCD() {
        Cli.greet();

        String ruleGCD = "Find the greatest common divisor of given numbers.";

        String[][] questionsAndAnswersGCD = new String[COUNT_ROUNDS][SUM_QUESTION_AND_ANSWER];

        for (var i = 0; i < COUNT_ROUNDS; i++) {
            int number1 = RandomUtils.nextInt(0, MAX_RANDOM_NUMBER);
            int number2 = RandomUtils.nextInt(0, MAX_RANDOM_NUMBER);
            questionsAndAnswersGCD[i][0] = number1 + " " + number2;
            questionsAndAnswersGCD[i][1] = Integer.toString(searchGcd(number1, number2));
        }

        Engine.playGame(questionsAndAnswersGCD, ruleGCD);

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
