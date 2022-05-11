package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    private static final String MAX_TRIES = "3";


    public static void playGame(String gameOption, String rules) {
        printWelcome();
        askName();
        String gamerName = Engine.getName();
        printGreeting(gamerName);
        printRules(rules);
        int winsCounter = 0;
        for (int i = 0; i < Integer.parseInt(MAX_TRIES); i++) {
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
        String name = sc.next();
        return name;
    }

    private static void printGreeting(String gamerName) {
        System.out.println(String.format("Hello, %s!", gamerName));
    }

    private static String getAnswer() {
        Scanner sc = new Scanner(System.in);
        String answer = sc.next();
        return answer;
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
            case "Even":
                questionAndResult = Even.generateQuestionAndResult();
                break;
            case "Calculator":
                questionAndResult = Calculator.generateQuestionAndResult();
                break;
            case "GCD":
                questionAndResult = GCD.generateQuestionAndResult();
                break;
            case "Progression":
                questionAndResult = Progression.generateQuestionAndResult();
                break;
            case "Prime":
                questionAndResult = Prime.generateQuestionAndResult();
                break;
            default:
                throw new Error(String.format("Unknown order state: %s!", gameOption));
        }
        return questionAndResult;
    }


    private static void printRules(String rules) {
        System.out.println(rules);
    }
}
