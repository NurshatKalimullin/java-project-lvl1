package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    private static int maxTries = 3;

    public static void printGameOverLine(String answer, String result, String gamerName) {
        System.out.println(String.format("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!",
                answer, result, gamerName));
    }

    public static void printSuccessLines(int winsCounter, String gamerName) {
        System.out.println("Correct!");
        String  maxNumberOfWins = "3";
        if (winsCounter == Integer.parseInt(maxNumberOfWins)) {
            System.out.println(String.format("Congratulations, %s!", gamerName));
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

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void printWelcome() {
        System.out.println("Welcome to the Brain Games!");
    }

    public static void askName() {
        System.out.println("May I have your name?");
    }

    public static String getName() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void printGreeting(String gamerName) {
        System.out.println(String.format("Hello, %s!", gamerName));
    }

    public static int getMaxTries() {
        return maxTries;
    }

    public static String getAnswer() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void printAnswer(String answer) {
        System.out.println("Your answer: " + answer);
    }

    public static void printTask(String task) {
        System.out.println("Question: " + task);
    }
}
