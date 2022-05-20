package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final String RULES = "What number is missing in the progression?";
    private static final int DIGITS_IN_PROGRESSION = 7;


    public static void start() {
        String[][] questionsAndResults = generateQuestionAndResult();
        Engine.playGame(RULES, questionsAndResults);
    }


    private static String[] generateProgression(int progressionStep, int firstItem) {
        String[] progression = new String[DIGITS_IN_PROGRESSION];
        progression[0] = Integer.toString(firstItem);
        for (int i = 1; i < DIGITS_IN_PROGRESSION; i++) {
            progression[i] = Integer.toString(Integer.parseInt(progression[i - 1]) + progressionStep);
        }
        return progression;
    }

    public static String[][] generateQuestionAndResult() {
        String[][] questionsAndResults = new String[2][Engine.MAX_TRIES];
        for (int i = 0; i < Engine.MAX_TRIES; i++) {
            final int min = 0;
            final int max = 10;
            int progressionStep = Utils.returnNumber(min, max);
            int firstItem = Utils.returnNumber(min, max);
            int numberForMasking = Utils.returnNumber(min, DIGITS_IN_PROGRESSION);
            String[] progression = generateProgression(progressionStep, firstItem);
            String maskedDigit = progression[numberForMasking];
            progression[numberForMasking] = "..";
            String progressionForPrint = String.join(" ", progression);
            questionsAndResults[0][i] = progressionForPrint;
            questionsAndResults[1][i] = maskedDigit;
        }
        return questionsAndResults;
    }

}
