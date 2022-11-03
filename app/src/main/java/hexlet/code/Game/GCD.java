package hexlet.code.Game;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class GCD {

    public static void gameGCD() {
        Engine.toGreet();

        System.out.println("Find the greatest common divisor of given numbers.");

        String[][] questionsAndAnswersGCD = new String[3][2];

        for (var i = 0; i < 3; i++) {
            int number1 = RandomUtils.nextInt(0, 100);
            int number2 = RandomUtils.nextInt(0, 100);
            questionsAndAnswersGCD[i][0] = Integer.toString(number1) + " " + Integer.toString(number2);
            questionsAndAnswersGCD[i][1] = Integer.toString(GCD.searchGcd(number1, number2));
        }

        Engine.toGame(questionsAndAnswersGCD);

    }

    public static int searchGcd(int n1, int n2) {
        int gcd = 1;
        for (var ii = 1; ii <= n1 && ii <= n2; ii++) {
            if (n1 % ii == 0 && n2 % ii == 0) {
                gcd = ii;
            }
        }
        return gcd;
    }
}