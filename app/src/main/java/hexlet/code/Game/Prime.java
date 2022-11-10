package hexlet.code.Game;

import hexlet.code.Cli;
import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Engine.*;

public class Prime {

    public static void gamePrime() {
        Cli.greet();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        String[][] questionsAndAnswersPrime = new String[COUNT_ROUNDS][SUM_QUESTION_AND_ANSWER];

        for (var i = 0; i < COUNT_ROUNDS; i++) {
            int number1 = RandomUtils.nextInt(0, MAX_RANDOM_NUMBER);
            questionsAndAnswersPrime[i][0] = Integer.toString(number1);
            questionsAndAnswersPrime[i][1] = isPrime(number1);
        }

        Engine.playGame(questionsAndAnswersPrime);

    }

    public static String isPrime(int number) {
        if (number < 2) {
            return "no";
        }

        var divider = 2;

        while (divider <= number / 2) {
            if (number % divider == 0) {
                return "no";
            }
            divider += 1;
        }

        return "yes";
    }
}
