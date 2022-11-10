package hexlet.code.Game;

import hexlet.code.Cli;
import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Engine.*;


public class Calc {
    public static void gameCalc() {
        Cli.greet();

        System.out.println("What is the result of the expression?");

        String[][] questionsAndAnswersCalc = new String[COUNT_ROUNDS][SUM_QUESTION_AND_ANSWER];
        for (var i = 0; i < COUNT_ROUNDS; i++) {
            int numberAction = RandomUtils.nextInt(0, NUMBER_OPERATIONS_CALC); //0 = "+"; 1 = "-"; 2 = "*";
            int number1 = RandomUtils.nextInt(0, MAX_RANDOM_NUMBER);
            int number2 = RandomUtils.nextInt(0, MAX_RANDOM_NUMBER);
            switch (numberAction) {
                case 0:
                    questionsAndAnswersCalc[i][0] = number1 + " + " + number2;
                    questionsAndAnswersCalc[i][1] = Integer.toString(number1 + number2);
                    break;
                case 1:
                    questionsAndAnswersCalc[i][0] = number1 + " - " + number2;
                    questionsAndAnswersCalc[i][1] = Integer.toString(number1 - number2);
                    break;
                case 2:
                    questionsAndAnswersCalc[i][0] = number1 + " * " + number2;
                    questionsAndAnswersCalc[i][1] = Integer.toString(number1 * number2);
                    break;
                default:
            }
        }

        Engine.playGame(questionsAndAnswersCalc);
    }
}
