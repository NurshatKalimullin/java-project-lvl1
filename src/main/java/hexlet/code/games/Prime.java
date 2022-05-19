package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start() {
        String[][] questionsAndResults = generateQuestionAndResult(Engine.MAX_TRIES);
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

    public static String[][] generateQuestionAndResult(int tries) {
        String[][] questionsAndResults = new String[2][tries];
        for (int i = 0; i < tries; i++) {
            String min = "0";
            String max = "100";
            int randomNumber = Utils.returnNumber(Integer.parseInt(min), Integer.parseInt(max));
            String result = "yes";
            if (!isPrime(randomNumber)) {
                result = "no";
            }
            questionsAndResults[0][i] = Integer.toString(randomNumber);
            questionsAndResults[1][i] = result;
        }
        return questionsAndResults;
    }

}
