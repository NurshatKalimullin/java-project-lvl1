package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {

    private static final String RULES = "What is the result of the expression?";
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 100;
    private static final int MAX_GAME_OPTION = 4;

    public static void start() {
        String[][] questionsAndResults = generateQuestionAndResult();
        Engine.playGame(RULES, questionsAndResults);
    }

    public static String[][] generateQuestionAndResult() {
        String[][] questionsAndResults = new String[2][Engine.MAX_TRIES];
        for (int i = 0; i < Engine.MAX_TRIES; i++) {
            int randomNumber1 = Utils.returnNumber(MIN_NUMBER, MAX_NUMBER);
            int randomNumber2 = Utils.returnNumber(MIN_NUMBER, MAX_NUMBER);
            String randomGameOption = Integer.toString(Utils.returnNumber(MIN_NUMBER,
                    MAX_GAME_OPTION));
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
