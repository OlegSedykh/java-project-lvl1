package hexlet.code.Game;

import hexlet.code.Cli;
import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Engine.COUNT_ROUNDS;
import static hexlet.code.Engine.SUM_QUESTION_AND_ANSWER;
import static hexlet.code.Engine.MAX_RANDOM_NUMBER;

public class Even {
    public static void gameEven() {
        Cli.greet();

        String ruleEven = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] questionsAndAnswersEven = new String[COUNT_ROUNDS][SUM_QUESTION_AND_ANSWER];

        for (var i = 0; i < COUNT_ROUNDS; i++) {
            int number1 = RandomUtils.nextInt(0, MAX_RANDOM_NUMBER);
            questionsAndAnswersEven[i][0] = Integer.toString(number1);
            questionsAndAnswersEven[i][1] = isEven(number1) ? "yes" : "no";
        }

        Engine.playGame(questionsAndAnswersEven, ruleEven);

    }

    public static boolean isEven(int n1) {
        return n1 % 2 == 0 ? true : false;
    }
}
