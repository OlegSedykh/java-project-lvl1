package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.getPlayerName;

public class Engine {

    public static final int COUNT_ROUNDS = 3;
    public static final int SUM_QUESTION_AND_ANSWER = 2;
    public static final int NUMBER_OPERATIONS_CALC = 3;
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int LENGTH_PROGRESSION = 10;






    public static void playGame(String[][] sample, String rule) {
        System.out.println(rule);
        Scanner scanner = new Scanner(System.in);
        int countWin = 0;
        for (var i = 0; i < COUNT_ROUNDS; i++) {
            System.out.print("Question: " + sample[i][0] + "\nYour answer: ");
            var playerAnswer = scanner.next();
            if (playerAnswer.equals(sample[i][1])) {
                System.out.println("Correct!");
                countWin += 1;
            } else {
                System.out.println("'" + playerAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + sample[i][1] + "'" + ".\nLet's try again, " + getPlayerName() + "!");
                break;
            }
        }

        if (countWin == COUNT_ROUNDS) {
            System.out.println("Congratulations, " + getPlayerName() + "!");
        }
    }


}
