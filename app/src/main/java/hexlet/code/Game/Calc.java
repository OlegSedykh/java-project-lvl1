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
            String[] typesOfOperation = {"+", "-", "*"};

            int operation = RandomUtils.nextInt(0, NUMBER_OPERATIONS_CALC); //0 = "+"; 1 = "-"; 2 = "*";
            int number1 = RandomUtils.nextInt(0, MAX_RANDOM_NUMBER);
            int number2 = RandomUtils.nextInt(0, MAX_RANDOM_NUMBER);
                    questionsAndAnswersCalc[i][0] = questionsForCalc(number1, number2, typesOfOperation[operation]);
                    questionsAndAnswersCalc[i][1] =
                            Integer.toString(calculate(number1, number2, typesOfOperation[operation]));
        }

        Engine.playGame(questionsAndAnswersCalc, ruleCalc);
    }

    public static int calculate(int n1, int n2, String operation) {
        switch (operation) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            default:
                System.out.println("This operation is not supported.");
                return 0;
        }
    }

    public static String questionsForCalc(int n1, int n2, String operation) {
        switch (operation) {
            case "+":
                return n1 + " + " + n2;
            case "-":
                return n1 + " - " + n2;
            case "*":
                return n1 + " * " + n2;
            default:
                return "This operation is not supported.";
        }
    }
}
