package hexlet.code.Game;

import hexlet.code.Cli;
import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Engine.COUNT_ROUNDS;
import static hexlet.code.Engine.SUM_QUESTION_AND_ANSWER;
import static hexlet.code.Engine.NUMBER_OPERATIONS_CALC;
import static hexlet.code.Engine.MAX_RANDOM_NUMBER;

public class Calc {
    public static void gameCalc() {
        Cli.greet();

        String ruleCalc = "What is the result of the expression?";

        String[][] questionsAndAnswersCalc = new String[COUNT_ROUNDS][SUM_QUESTION_AND_ANSWER];
        for (var i = 0; i < COUNT_ROUNDS; i++) {
            int numberAction = RandomUtils.nextInt(0, NUMBER_OPERATIONS_CALC); //0 = "+"; 1 = "-"; 2 = "*";
            int number1 = RandomUtils.nextInt(0, MAX_RANDOM_NUMBER);
            int number2 = RandomUtils.nextInt(0, MAX_RANDOM_NUMBER);
                    questionsAndAnswersCalc[i][0] = questionsForCalc(number1, number2, numberAction);
                    questionsAndAnswersCalc[i][1] = calculate(number1, number2, numberAction);
        }

        Engine.playGame(questionsAndAnswersCalc, ruleCalc);
    }

    public static String calculate(int n1, int n2, int n3) { //0 = "+"; 1 = "-"; 2 = "*";
        switch (n3) {
            case 0:
                return Integer.toString(n1 + n2);
            case 1:
                return Integer.toString(n1 - n2);
            case 2:
                return Integer.toString(n1 * n2);
            default:
                return null;
        }
    }

    public static String questionsForCalc(int n1, int n2, int n3) {
        switch (n3) {
            case 0:
                return n1 + " + " + n2;
            case 1:
                return n1 + " - " + n2;
            case 2:
                return n1 + " * " + n2;
            default:
                return null;
        }
    }
}
