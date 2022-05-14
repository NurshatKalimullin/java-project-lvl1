package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static void even() {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] questionsAndResults = generateQuestionAndResult(Engine.getMaxTries());
        Engine.playGame(rules, questionsAndResults);
    }

    public static String[] generateQuestionAndResult(int tries) {
        String numberOfQuestionsAndResultsInOneTry = "2";
        int totalNumberOfQuestionsAndResults = tries * Integer.parseInt(numberOfQuestionsAndResultsInOneTry);
        String[] questionsAndResults = new String[totalNumberOfQuestionsAndResults];
        for (int i = 0; i < totalNumberOfQuestionsAndResults; i = i + 2) {
            String min = "0";
            String max = "1000";
            String randomNumber = Integer.toString(Engine.returnNumber(Integer.parseInt(min),
                    Integer.parseInt(max)));
            String result = "yes";
            if (Integer.parseInt(randomNumber) % 2 == 1) {
                result = "no";
            }
            questionsAndResults[i] = randomNumber;
            questionsAndResults[i + 1] = result;
        }
        return questionsAndResults;
    }

}
