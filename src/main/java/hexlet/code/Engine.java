package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int MAX_TRIES = 3;

    public static void playGame(String rules, String[][] questionAndResult) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String gamerName = sc.next();
        System.out.println(String.format("Hello, %s!", gamerName));
        System.out.println(rules);
        int winsCounter = 0;
        for (int i = 0; i < MAX_TRIES; i++) {
            String question = questionAndResult[0][i];
            String result = questionAndResult[1][i];
            System.out.println("Question: " + question);
            String answer = sc.next();
            System.out.println("Your answer: " + answer);
            if (!answer.equals(result)) {
                System.out.println(String.format(
                        "'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!",
                        answer, result, gamerName));
                sc.close();
                return;
            }
            winsCounter = winsCounter + 1;
            System.out.println("Correct!");
        }
        System.out.println(String.format("Congratulations, %s!", gamerName));
    }


}
