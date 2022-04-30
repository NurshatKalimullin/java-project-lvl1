package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Scanner;

public class Progression {

    public static void progression() {
        Scanner sc = new Scanner(System.in);
        int winsCounter = 0;
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < 3; i++) {
            int digitsInProgression = Engine.returnNumber(5, 10);
            int[] progression = generateProgression(digitsInProgression);
            int numberForMasking = Engine.returnNumber(0, digitsInProgression);
            String[] stringProgression = convertIntArrayToStringArray(progression);
            String maskedDigit = stringProgression[numberForMasking];
            stringProgression[numberForMasking] = "..";
            System.out.println("Question: " + Arrays.toString(stringProgression));
            String answer = sc.nextLine();
            System.out.println("Your answer: " + answer);
            if (!answer.equals(maskedDigit)) {
                Engine.printGameOverLine(answer, maskedDigit);
                break;
            }
            winsCounter = winsCounter + 1;
            Engine.printSuccessLines(winsCounter);
        }
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
        progression[0] = Engine.returnNumber(0, 100);
        int step = Engine.returnNumber(0, 10);
        for (int i = 1; i < digitsInProgression; i++) {
            progression[i] = progression[i - 1] + step;
        }
        return progression;
    }
}
