package hexlet.code.Game;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import java.util.Arrays;

public class Progression {

    public static void gameProgression() {
        Engine.toGreet();

        System.out.println("What number is missing in the progression?");

        String[][] questionsAndAnswersProgression = new String[3][2];

        for (var i = 0; i < 3; i++) {
            int number1 = RandomUtils.nextInt(0, 100); //1е знач процессии
            int step = RandomUtils.nextInt(0, 100); //шаг процессии
            int number2 = RandomUtils.nextInt(0, 9); //значение-вопрос
            int[] progression = Progression.makeProgressionInArray(number1, step);
            questionsAndAnswersProgression[i][0] = Progression.replaceArrayToString(progression, number2);
            questionsAndAnswersProgression[i][1] = Integer.toString(progression[number2]);
        }

        Engine.toGame(questionsAndAnswersProgression);

    }

    public static int[] makeProgressionInArray(int n1, int n2) { //n1-первое знач процессии, n2-шаг
        int[] someArray = new int[10];
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
