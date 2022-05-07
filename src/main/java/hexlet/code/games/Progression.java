package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    public static void progression() {
        Engine.printWelcome();
        Engine.askName();
        String gamerName = Engine.getName();
        Engine.printGreeting(gamerName);
        int winsCounter = 0;
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < Engine.getMaxTries(); i++) {
            String min = "7";
            String max = "15";
            int digitsInProgression = Engine.returnNumber(Integer.parseInt(min), Integer.parseInt(max));
            min = "5";
            int[] progression = generateProgression(digitsInProgression);
            int numberForMasking = Engine.returnNumber(Integer.parseInt(min), digitsInProgression);
            String[] stringProgression = convertIntArrayToStringArray(progression);
            String maskedDigit = stringProgression[numberForMasking];
            String progressionForPrint = getProgressionForPrint(stringProgression, numberForMasking);
            Engine.printTask(progressionForPrint);
            String answer = Engine.getAnswer();
            Engine.printAnswer(answer);
            if (!answer.equals(maskedDigit)) {
                Engine.printGameOverLine(answer, maskedDigit, gamerName);
                break;
            }
            winsCounter = winsCounter + 1;
            Engine.printSuccessLines(winsCounter, gamerName);
        }
    }

    private static String getProgressionForPrint(String[] progression, int numberForMasking) {
        progression[numberForMasking] = "..";
        String result = "";
        for (String item : progression) {
            result = result + item + ", ";
        }
        return result.substring(0, result.length() - 2);
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
}
