package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    public static void prime() {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questionsAndResults = generateQuestionAndResult(Engine.getMaxTries());
        Engine.playGame(rules, questionsAndResults);
    }

    private static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String[] generateQuestionAndResult(int tries) {
        String numberOfQuestionsAndResultsInOneTry = "2";
        int totalNumberOfQuestionsAndResults = tries * Integer.parseInt(numberOfQuestionsAndResultsInOneTry);
        String[] questionsAndResults = new String[totalNumberOfQuestionsAndResults];
        for (int i = 0; i < totalNumberOfQuestionsAndResults; i = i + 2) {
            String min = "0";
            String max = "100";
            int randomNumber = Engine.returnNumber(Integer.parseInt(min), Integer.parseInt(max));
            String result = "yes";
            if (!isPrime(randomNumber)) {
                result = "no";
            }
            questionsAndResults[i] = Integer.toString(randomNumber);
            questionsAndResults[i + 1] = result;
        }
        return questionsAndResults;
    }

}
