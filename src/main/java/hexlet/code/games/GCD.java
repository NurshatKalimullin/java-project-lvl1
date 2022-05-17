package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    private static final String RULES = "Find the greatest common divisor of given numbers.";

    public static void play() {
        String[][] questionsAndResults = generateQuestionAndResult(Engine.MAX_TRIES);
        Engine.playGame(RULES, questionsAndResults);
    }

    private static int gcd(int randomNumber1, int randomNumber2) {
        int minNumber = randomNumber1;
        int maxNumber = randomNumber2;
        if (randomNumber1 > randomNumber2) {
            minNumber = randomNumber2;
            maxNumber = randomNumber1;
        }
        int result = 0;
        for (int i = minNumber; i > 0; i--) {
            if (minNumber % i == 0) {
                if (maxNumber % i == 0) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }

    public static String[][] generateQuestionAndResult(int tries) {
        String[][] questionsAndResults = new String[2][tries];
        for (int i = 0; i < tries; i++) {
            String min = "1";
            String max = "100";
            int randomNumber1 = Utils.returnNumber(Integer.parseInt(min), Integer.parseInt(max));
            int randomNumber2 = Utils.returnNumber(Integer.parseInt(min), Integer.parseInt(max));
            int result = gcd(randomNumber1, randomNumber2);
            String question = randomNumber1 + " " + randomNumber2;
            questionsAndResults[0][i] = question;
            questionsAndResults[1][i] = Integer.toString(result);
        }
        return questionsAndResults;
    }

}
