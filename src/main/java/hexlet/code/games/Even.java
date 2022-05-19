package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";


    public static void start() {
        String[][] questionsAndResults = generateQuestionAndResult(Engine.MAX_TRIES);
        Engine.playGame(RULES, questionsAndResults);
    }

    public static String[][] generateQuestionAndResult(int tries) {
        String[][] questionsAndResults = new String[2][tries];
        for (int i = 0; i < tries; i++) {
            String min = "0";
            String max = "1000";
            String randomNumber = Integer.toString(Utils.returnNumber(Integer.parseInt(min),
                    Integer.parseInt(max)));
            String result = "yes";
            if (Integer.parseInt(randomNumber) % 2 == 1) {
                result = "no";
            }
            questionsAndResults[0][i] = randomNumber;
            questionsAndResults[1][i] = result;
        }
        return questionsAndResults;
    }

}
