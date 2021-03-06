package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";


    public static void start() {
        String[][] questionsAndResults = generateQuestionAndResult();
        Engine.playGame(RULES, questionsAndResults);
    }

    public static String[][] generateQuestionAndResult() {
        String[][] questionsAndResults = new String[2][Engine.MAX_TRIES];
        for (int i = 0; i < Engine.MAX_TRIES; i++) {
            final int min = 0;
            final int max = 1000;
            String randomNumber = Integer.toString(Utils.returnRandomNumber(min, max));
            String result = (Integer.parseInt(randomNumber) % 2 == 1) ? "no" : "yes";
            questionsAndResults[0][i] = randomNumber;
            questionsAndResults[1][i] = result;
        }
        return questionsAndResults;
    }

}
