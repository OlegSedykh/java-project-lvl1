package hexlet.code.Game;

import hexlet.code.Cli;
import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import java.util.Arrays;

import static hexlet.code.Engine.COUNT_ROUNDS;
import static hexlet.code.Engine.MAX_RANDOM_NUMBER;
import static hexlet.code.Engine.SUM_QUESTION_AND_ANSWER;
import static hexlet.code.Engine.LENGTH_PROGRESSION;


public class Progression {

    public static void gameProgression() {
        Cli.greet();

        String ruleProgression = "What number is missing in the progression?";

        String[][] questionsAndAnswersProgression = new String[COUNT_ROUNDS][SUM_QUESTION_AND_ANSWER];

        for (var i = 0; i < COUNT_ROUNDS; i++) {
            int number1 = RandomUtils.nextInt(0, MAX_RANDOM_NUMBER); //1е знач прогрессии
            int step = RandomUtils.nextInt(0, MAX_RANDOM_NUMBER); //шаг прогрессии
            int number2 = RandomUtils.nextInt(0, LENGTH_PROGRESSION - 1); //значение-вопрос
            int[] progression = makeProgressionInArray(number1, step);
            questionsAndAnswersProgression[i][0] = replaceArrayToString(progression, number2);
            questionsAndAnswersProgression[i][1] = Integer.toString(progression[number2]);
        }

        Engine.playGame(questionsAndAnswersProgression, ruleProgression);

    }

    public static int[] makeProgressionInArray(int n1, int n2) { //n1-первое знач прогрессии, n2-шаг
        int[] someArray = new int[LENGTH_PROGRESSION];
        someArray[0] = n1;
        for (var x = 0; x < someArray.length - 1; x++) {
            someArray[x + 1] = someArray[x] + n2;
        }
        return someArray;
    }

    public static String replaceArrayToString(int[] sample, int y) { //y- значение-вопрос
        String befor = Arrays.toString(sample);
        String[] sampleString = befor.substring(1, befor.length() - 1).split(", ");
        sampleString[y] = "..";
        String question = String.join(" ", sampleString);
        return question;

    }
}
