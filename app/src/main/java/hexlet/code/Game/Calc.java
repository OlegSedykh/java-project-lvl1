package hexlet.code.Game;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Calc {
    public static void gameCalc() {
        Engine.toGreet();

        System.out.println("What is the result of the expression?");

        String[][] questionsAndAnswersCalc = new String[3][2];
        for (var i = 0; i < 3; i++) {
            int numberAction = RandomUtils.nextInt(0, 3);//0 = "+"; 1 = "-"; 2 = "*";
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
            }
        }

        Engine.toGame(questionsAndAnswersCalc);
    }
}
