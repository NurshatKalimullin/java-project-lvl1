package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start() {
        String[][] questionsAndResults = generateQuestionAndResult();
        Engine.playGame(RULES, questionsAndResults);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String[][] generateQuestionAndResult() {
        String[][] questionsAndResults = new String[2][Engine.MAX_TRIES];
        for (int i = 0; i < Engine.MAX_TRIES; i++) {
            final int min = 0;
            final int max = 100;
            int randomNumber = Utils.returnNumber(min, max);
            String result = (isPrime(randomNumber)) ? "yes" : "no";
            questionsAndResults[0][i] = Integer.toString(randomNumber);
            questionsAndResults[1][i] = result;
        }
        return questionsAndResults;
    }

}
