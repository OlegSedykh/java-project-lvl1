package hexlet.code.Game;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Engine.numberOfRounds;
import static hexlet.code.Engine.sumQuestionAndAnswer;


public class Calc {
    public static void gameCalc() {
        Engine.toGreet();

        System.out.println("What is the result of the expression?");

        String[][] questionsAndAnswersCalc = new String[numberOfRounds][sumQuestionAndAnswer];
        for (var i = 0; i < numberOfRounds; i++) {
            int numberAction = RandomUtils.nextInt(0, 3); //0 = "+"; 1 = "-"; 2 = "*";
            int number1 = RandomUtils.nextInt(0, 100);
            int number2 = RandomUtils.nextInt(0, 100);
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
