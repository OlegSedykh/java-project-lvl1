package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String playerName;
    public static int numberOfRounds = 3;
    public static int sumQuestionAndAnswer = 2;
    public static int maxRandomNumber = 100;
    public static int lengthOfProgression = 10;
    public static Scanner sc = new Scanner(System.in);
    public static void toGreet() {
        System.out.println("Welcome to the Brain Games!");
        //Scanner name = new Scanner(System.in);
        System.out.print("May I have your name? ");
        playerName = sc.next();
        System.out.println("Hello, " + playerName + "!");

    }

    public static void toGame(String[][] sample) {
        //Scanner answer = new Scanner(System.in);
        int countWin = 0;
        for (var i = 0; i < numberOfRounds; i++) {
            System.out.print("Question: " + sample[i][0] + "\nYour answer: ");
            var playerAnswer = sc.next();
            if (playerAnswer.equals(sample[i][1])) {
                System.out.println("Correct!");
                countWin += 1;
            } else {
                System.out.println("'" + playerAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + sample[i][1] + "'" + ".\nLet's try again, " + playerName + "!");
                break;
            }
        }
        sc.close();
        if (countWin == numberOfRounds) {
            System.out.println("Congratulations, " + playerName + "!");
        }
    }


}
