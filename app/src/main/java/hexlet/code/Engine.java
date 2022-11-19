package hexlet.code;

import java.util.Scanner;
public class Engine {
    public static final int COUNT_ROUNDS = 3;
    public static final int SUM_QUESTION_AND_ANSWER = 2;
    public static final int NUMBER_OPERATIONS_CALC = 3;
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int LENGTH_PROGRESSION = 10;

    public static void playGame(String[][] sample, String rule) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String playerName = scanner.next();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(rule);
        int countWin = 0;
        for (var i = 0; i < COUNT_ROUNDS; i++) {
            System.out.print("Question: " + sample[i][0] + "\nYour answer: ");
            var playerAnswer = scanner.next();
            if (playerAnswer.equals(sample[i][1])) {
                System.out.println("Correct!");
                countWin += 1;
            } else {
                System.out.println("'" + playerAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + sample[i][1] + "'" + ".\nLet's try again, " + playerName + "!");
                break;
            }
        }
        if (countWin == COUNT_ROUNDS) {
            System.out.println("Congratulations, " + playerName + "!");
        }
    }
}
