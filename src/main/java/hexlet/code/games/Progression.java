package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final String RULES = "What number is missing in the progression?";
    private static final int DIGITS_IN_PROGRESSION = 7;


    public static void play() {
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

    private static int[] generateProgression(int digitsInProgression) {
        int[] progression = new int[digitsInProgression];
        final int min = 0;
        final int max = 10;
        progression[0] = Utils.returnNumber(min, max);
        int step = Utils.returnNumber(min, max);
        for (int i = 1; i < digitsInProgression; i++) {
            progression[i] = progression[i - 1] + step;
        }
        return progression;
    }

    public static String[][] generateQuestionAndResult(int tries) {
        String[][] questionsAndResults = new String[2][tries];
        for (int i = 0; i < tries; i = i + 2) {
            String min = "0";
            int[] progression = generateProgression(DIGITS_IN_PROGRESSION);
            int numberForMasking = Utils.returnNumber(Integer.parseInt(min), DIGITS_IN_PROGRESSION);
            String[] stringProgression = convertIntArrayToStringArray(progression);
            String maskedDigit = stringProgression[numberForMasking];
            String progressionForPrint = getProgressionForPrint(stringProgression, numberForMasking);
            questionsAndResults[0][i] = progressionForPrint;
            questionsAndResults[1][i] = maskedDigit;
        }
        return questionsAndResults;
    }

}
