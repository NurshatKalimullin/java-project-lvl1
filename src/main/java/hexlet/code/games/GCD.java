package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {

    public static void gcd() {
        Scanner sc = new Scanner(System.in);
        int winsCounter = 0;
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < 3; i++) {
            int randomNumber1 = Engine.returnNumber(1, 100);;
            int randomNumber2 = Engine.returnNumber(1, 100);
            int result = Engine.findGreatestDivisor(randomNumber1, randomNumber2);
            System.out.println("Question: " + randomNumber1 + " " + randomNumber2);
            String answer  = sc.nextLine();
            System.out.println("Your answer: " + answer);
            if (!answer.equals(Integer.toString(result))) {
                Engine.printGameOverLine(answer, Integer.toString(result));
                break;
            }
            winsCounter = winsCounter + 1;
            Engine.printSuccessLines(winsCounter);
        }
    }

}
