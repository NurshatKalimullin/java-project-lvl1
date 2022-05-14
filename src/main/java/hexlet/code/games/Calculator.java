package hexlet.code.games;

import hexlet.code.Engine;

public class Calculator {

    public static void calc() {
        String rules = "What is the result of the expression?";
        String[] questionsAndResults = generateQuestionAndResult(Engine.getMaxTries());
        Engine.playGame(rules, questionsAndResults);
    }

    private static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    private static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    private static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static String[] generateQuestionAndResult(int tries) {
        String numberOfQuestionsAndResultsInOneTry = "2";
        int totalNumberOfQuestionsAndResults = tries * Integer.parseInt(numberOfQuestionsAndResultsInOneTry);
        String[] questionsAndResults = new String[totalNumberOfQuestionsAndResults];
        for (int i = 0; i < totalNumberOfQuestionsAndResults; i = i + 2) {
            String min = "0";
            String max = "100";
            int randomNumber1 = Engine.returnNumber(Integer.parseInt(min), Integer.parseInt(max));
            int randomNumber2 = Engine.returnNumber(Integer.parseInt(min), Integer.parseInt(max));
            max = "4";
            String randomGameOption = Integer.toString(Engine.returnNumber(Integer.parseInt(min),
                    Integer.parseInt(max)));
            String question = "";
            int result = 0;
            switch (randomGameOption) {
                case "1":
                    question = randomNumber1 + " * " + randomNumber2;
                    result = multiply(randomNumber1, randomNumber2);
                    break;
                case "2":
                    question = randomNumber1 + " - " + randomNumber2;
                    result = subtract(randomNumber1, randomNumber2);
                    break;
                case "3":
                    question = randomNumber1 + " + " + randomNumber2;
                    result = add(randomNumber1, randomNumber2);
                    break;
                default:
                    throw new Error(String.format("Unknown order state: %s!", randomGameOption));
            }
            questionsAndResults[i] = question;
            questionsAndResults[i + 1] = Integer.toString(result);
        }
        return questionsAndResults;
    }

}
