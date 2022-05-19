package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final String RULES = "What number is missing in the progression?";
    private static final int DIGITS_IN_PROGRESSION = 7;


    public static void start() {
        String[][] questionsAndResults = generateQuestionAndResult(Engine.MAX_TRIES);
        Engine.playGame(RULES, questionsAndResults);
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

    private static int[] generateProgression(int digitsInProgression, int progressionStep, int firstItem) {
        int[] progression = new int[digitsInProgression];
        progression[0] = firstItem;
        for (int i = 1; i < digitsInProgression; i++) {
            progression[i] = progression[i - 1] + progressionStep;
        }
        return progression;
    }

    public static String[][] generateQuestionAndResult(int tries) {
        String[][] questionsAndResults = new String[2][tries];
        for (int i = 0; i < tries; i++) {
            final int min = 0;
            final int max = 10;
            int progressionStep = Utils.returnNumber(min, max);
            int firstItem = Utils.returnNumber(min, max);
            int[] progression = generateProgression(DIGITS_IN_PROGRESSION, progressionStep, firstItem);
            int numberForMasking = Utils.returnNumber(min, DIGITS_IN_PROGRESSION);
            String[] stringProgression = convertIntArrayToStringArray(progression);
            String maskedDigit = stringProgression[numberForMasking];
            String progressionForPrint = getProgressionForPrint(stringProgression, numberForMasking);
            questionsAndResults[0][i] = progressionForPrint;
            questionsAndResults[1][i] = maskedDigit;
        }
        return questionsAndResults;
    }

}
