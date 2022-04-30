package hexlet.code;

import java.util.Random;

public class Engine {

    public static void printGameOverLine(String answer, String result) {
        System.out.println(String.format("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!", answer, result, Cli.gamerName));
    }

    public static void printSuccessLines(int winsCounter) {
        System.out.println("Correct!");
        if (winsCounter == 3) {
            System.out.println(String.format("Congratulations, %s!", Cli.gamerName));
        }
    }

    public static int returnNumber(int min, int max) {
        Random random = new Random();
        int randomNumber = random.nextInt(max);
        while (randomNumber <= min) {
            randomNumber = random.nextInt(max);
        }
        return randomNumber;
    }

    public static int findGreatestDivisor(int randomNumber1, int randomNumber2) {
        int minNumber = randomNumber1;
        int maxNumber = randomNumber2;
        if (randomNumber1 > randomNumber2) {
            minNumber = randomNumber2;
            maxNumber = randomNumber1;
        }
        int result = 0;
        for (int i = minNumber - 1; i > 0; i--) {
            if (minNumber % i == 0) {
                if (maxNumber % i == 0) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

}
