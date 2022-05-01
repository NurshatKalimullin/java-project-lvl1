package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {

    public static void prime() {
        Scanner sc = new Scanner(System.in);
        int winsCounter = 0;
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int randomNumber = Engine.returnNumber(0, 300);
            String result = "yes";
            if (!isPrime(randomNumber)) {
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

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
