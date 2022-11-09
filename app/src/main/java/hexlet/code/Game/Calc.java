package hexlet.code.Game;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Engine.*;


public class Calc {
    public static void gameCalc() {
        Engine.toGreet();

        System.out.println("What is the result of the expression?");

        String[][] questionsAndAnswersCalc = new String[numberOfRounds][sumQuestionAndAnswer];
        for (var i = 0; i < numberOfRounds; i++) {
            int numberOfOperations = 3;
            int numberAction = RandomUtils.nextInt(0, numberOfOperations); //0 = "+"; 1 = "-"; 2 = "*";
            int number1 = RandomUtils.nextInt(0, maxRandomNumber);
            int number2 = RandomUtils.nextInt(0, maxRandomNumber);
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

        Engine.toGame(questionsAndAnswersCalc);
    }
}
