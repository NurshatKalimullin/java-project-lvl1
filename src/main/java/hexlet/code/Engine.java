package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    private static final String maxTries = "3";


    public static void playGame(String gameOption) {
        printWelcome();
        askName();
        String gamerName = Engine.getName();
        printGreeting(gamerName);
        printRules(gameOption);
        int winsCounter = 0;
        for (int i = 0; i < Integer.parseInt(maxTries); i++) {
            String[] questionAndResult = getQuestionAndResult(gameOption);
            String question = questionAndResult[0];
            String result = questionAndResult[1];
            printTask(question);
            String answer = Engine.getAnswer();
            printAnswer(answer);
            if (!answer.equals(result)) {
                printGameOverLine(answer, result, gamerName);
                break;
            }
            winsCounter = winsCounter + 1;
            printSuccessLines(winsCounter, gamerName);
        }
    }


    private static void printGameOverLine(String answer, String result, String gamerName) {
        System.out.println(String.format("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!",
                answer, result, gamerName));
    }

    private static void printSuccessLines(int winsCounter, String gamerName) {
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

    private static void printWelcome() {
        System.out.println("Welcome to the Brain Games!");
    }

    private static void askName() {
        System.out.println("May I have your name?");
    }

    private static String getName() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static void printGreeting(String gamerName) {
        System.out.println(String.format("Hello, %s!", gamerName));
    }

    private static String getAnswer() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static void printAnswer(String answer) {
        System.out.println("Your answer: " + answer);
    }

    private static void printTask(String task) {
        System.out.println("Question: " + task);
    }

    private static String[] getQuestionAndResult(String gameOption) {
        String[] questionAndResult = {""};
        switch (gameOption) {
            case "2":
                questionAndResult = Even.generateQuestionAndResult();
                break;
            case "3":
                questionAndResult = Calculator.generateQuestionAndResult();
                break;
            case "4":
                questionAndResult = GCD.generateQuestionAndResult();
                break;
            case "5":
                questionAndResult = Progression.generateQuestionAndResult();
                break;
            case "6":
                questionAndResult = Prime.generateQuestionAndResult();
                break;
            default:
                throw new Error(String.format("Unknown order state: %s!", gameOption));
        }
        return questionAndResult;
    }


    private static void printRules (String gameOption) {
        switch (gameOption) {
            case "2":
                Even.getRules();
                break;
            case "3":
                Calculator.getRules();
                break;
            case "4":
                GCD.getRules();
                break;
            case "5":
                Progression.getRules();
                break;
            case "6":
                Prime.getRules();
                break;
            default:
                throw new Error(String.format("Unknown order state: %s!", gameOption));
        }
    }
}
