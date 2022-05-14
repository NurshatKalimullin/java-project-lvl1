package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    public static void gcd() {
        String rules = "Find the greatest common divisor of given numbers.";
        String[] questionsAndResults = generateQuestionAndResult(Engine.getMaxTries());
        Engine.playGame(rules, questionsAndResults);
    }

    private static int findGreatestDivisor(int randomNumber1, int randomNumber2) {
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

    public static String[] generateQuestionAndResult(int tries) {
        String numberOfQuestionsAndResultsInOneTry = "2";
        int totalNumberOfQuestionsAndResults = tries * Integer.parseInt(numberOfQuestionsAndResultsInOneTry);
        String[] questionsAndResults = new String[totalNumberOfQuestionsAndResults];
        for (int i = 0; i < totalNumberOfQuestionsAndResults; i = i + 2) {
            String min = "1";
            String max = "100";
            int randomNumber1 = Engine.returnNumber(Integer.parseInt(min), Integer.parseInt(max));
            int randomNumber2 = Engine.returnNumber(Integer.parseInt(min), Integer.parseInt(max));
            int result = findGreatestDivisor(randomNumber1, randomNumber2);
            String question = randomNumber1 + " " + randomNumber2;
            questionsAndResults[i] = question;
            questionsAndResults[i + 1] = Integer.toString(result);
        }
        return questionsAndResults;
    }

}
