package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {

    private static final String RULES = "What is the result of the expression?";

    public static void start() {
        String[][] questionsAndResults = generateQuestionAndResult(Engine.MAX_TRIES);
        Engine.playGame(RULES, questionsAndResults);
    }

    public static String[][] generateQuestionAndResult(int tries) {
        String[][] questionsAndResults = new String[2][tries];
        for (int i = 0; i < tries; i++) {
            String min = "0";
            String max = "100";
            int randomNumber1 = Utils.returnNumber(Integer.parseInt(min), Integer.parseInt(max));
            int randomNumber2 = Utils.returnNumber(Integer.parseInt(min), Integer.parseInt(max));
            max = "4";
            String randomGameOption = Integer.toString(Utils.returnNumber(Integer.parseInt(min),
                    Integer.parseInt(max)));
            String question = "";
            int result = 0;
            switch (randomGameOption) {
                case "1":
                    question = randomNumber1 + " * " + randomNumber2;
                    result =  randomNumber1 * randomNumber2;
                    break;
                case "2":
                    question = randomNumber1 + " - " + randomNumber2;
                    result = randomNumber1 - randomNumber2;
                    break;
                case "3":
                    question = randomNumber1 + " + " + randomNumber2;
                    result = randomNumber1 + randomNumber2;
                    break;
                default:
                    throw new Error(String.format("Unknown order state: %s!", randomGameOption));
            }
            questionsAndResults[0][i] = question;
            questionsAndResults[1][i] = Integer.toString(result);
        }
        return questionsAndResults;
    }

}
