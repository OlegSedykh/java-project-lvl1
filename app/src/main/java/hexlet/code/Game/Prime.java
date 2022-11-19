package hexlet.code.Game;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;
import static hexlet.code.Engine.COUNT_ROUNDS;
import static hexlet.code.Engine.SUM_QUESTION_AND_ANSWER;
import static hexlet.code.Engine.MAX_RANDOM_NUMBER;

public class Prime {

    public static void gamePrime() {
        String rulePrime = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionsAndAnswersPrime = new String[COUNT_ROUNDS][SUM_QUESTION_AND_ANSWER];
        for (var i = 0; i < COUNT_ROUNDS; i++) {
            int number1 = RandomUtils.nextInt(0, MAX_RANDOM_NUMBER);
            questionsAndAnswersPrime[i][0] = Integer.toString(number1);
            questionsAndAnswersPrime[i][1] = isPrime(number1) ? "yes" : "no";
        }
        Engine.playGame(questionsAndAnswersPrime, rulePrime);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        var divider = 2;
        while (divider <= number / 2) {
            if (number % divider == 0) {
                return false;
            }
            divider += 1;
        }
        return true;
    }
}
