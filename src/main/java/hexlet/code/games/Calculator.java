package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calculator {


    public static void calc() {
        Scanner sc = new Scanner(System.in);
        int winsCounter = 0;
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int randomNumber1 = random.nextInt(100);
            int randomNumber2 = random.nextInt(100);
            int randNumber;
            int result = 0;
            randNumber = random.nextInt(3);
            while (randNumber == 0){
                randNumber = random.nextInt(3);
            }
            switch(randNumber) {
                case 1:
                    System.out.println("Question: " + randomNumber1 + " * " + randomNumber2);
                    result = multiply(randomNumber1, randomNumber2);
                    break;
                case 2:
                    System.out.println("Question: " + randomNumber1 + " - " + randomNumber2);
                    result = subtract(randomNumber1, randomNumber2);
                    break;
                case 3:
                    System.out.println("Question: " + randomNumber1 + " + " + randomNumber2);
                    result = add(randomNumber1, randomNumber2);
            }
            String answer = sc.nextLine();
            System.out.println("Your answer: " + answer);
            if (!answer.equals(Integer.toString(result))) {
                Engine.printGameOverLine(answer, Integer.toString(result));
                break;
            }
            winsCounter = winsCounter + 1;
            Engine.printSuccessLines(winsCounter);
        }


    }

    private static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    private static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    private static int add(int num1, int num2) {
        return num1 + num2;
    }
}
