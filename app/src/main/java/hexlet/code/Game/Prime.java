package hexlet.code.Game;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Prime {

    public static void gamePrime() {
        Engine.toGreet();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        String[][] questionsAndAnswersPrime = new String[3][2];

        for (var i = 0; i < 3; i++) {
            int number1 = RandomUtils.nextInt(0, 100);
            questionsAndAnswersPrime[i][0] = Integer.toString(number1);
            questionsAndAnswersPrime[i][1] = Prime.isPrime(number1);
        }

        Engine.toGame(questionsAndAnswersPrime);

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