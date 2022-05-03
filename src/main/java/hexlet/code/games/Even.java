package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even {

    public static void even() {
        Scanner sc = new Scanner(System.in);
        int winsCounter = 0;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int tries = 3;
        for (int i = 0; i < tries; i++) {
            int randomNumber = Engine.returnNumber(0, 1000);
            String result = "yes";
            if (randomNumber % 2 == 1) {
                result = "no";
            }
            System.out.println("Question: " + randomNumber);
            String answer  = sc.nextLine();
            System.out.println("Your answer: " + answer);
            if (!answer.equals(result)) {
                Engine.printGameOverLine(answer, result);
                break;
            }
            winsCounter = winsCounter + 1;
            Engine.printSuccessLines(winsCounter);
        }
    }
}
