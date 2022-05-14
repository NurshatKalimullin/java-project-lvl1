package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    public static void progression() {
        String rules = "What number is missing in the progression?";
        String[] questionsAndResults = generateQuestionAndResult(Engine.getMaxTries());
        Engine.playGame(rules, questionsAndResults);
    }

    private static String getProgressionForPrint(String[] progression, int numberForMasking) {
        progression[numberForMasking] = "..";
        String result = "";
        for (String item : progression) {
            result = result + item + " ";
        }
        return result.substring(0, result.length() - 1);
    }

    private static String[] convertIntArrayToStringArray(int[] progression) {
        String[] stringArray = new String[progression.length];
        for (int i = 0; i < progression.length; i++) {
            stringArray[i] = Integer.toString(progression[i]);
        }
        return stringArray;
    }

    private static int[] generateProgression(int digitsInProgression) {
        int[] progression = new int[digitsInProgression];
        final int min = 0;
        final int max = 10;
        progression[0] = Engine.returnNumber(min, max);
        int step = Engine.returnNumber(min, max);
        for (int i = 1; i < digitsInProgression; i++) {
            progression[i] = progression[i - 1] + step;
        }
        return progression;
    }

    public static String[] generateQuestionAndResult(int tries) {
        String numberOfQuestionsAndResultsInOneTry = "2";
        int totalNumberOfQuestionsAndResults = tries * Integer.parseInt(numberOfQuestionsAndResultsInOneTry);
        String[] questionsAndResults = new String[totalNumberOfQuestionsAndResults];
        for (int i = 0; i < totalNumberOfQuestionsAndResults; i = i + 2) {
            String digitsInProgression = "7";
            String min = "0";
            int[] progression = generateProgression(Integer.parseInt(digitsInProgression));
            int numberForMasking = Engine.returnNumber(Integer.parseInt(min), Integer.parseInt(digitsInProgression));
            String[] stringProgression = convertIntArrayToStringArray(progression);
            String maskedDigit = stringProgression[numberForMasking];
            String progressionForPrint = getProgressionForPrint(stringProgression, numberForMasking);
            questionsAndResults[i] = progressionForPrint;
            questionsAndResults[i + 1] = maskedDigit;
        }
        return questionsAndResults;
    }

}
