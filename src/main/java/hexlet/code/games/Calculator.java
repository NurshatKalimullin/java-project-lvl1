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
            int randomNumber1 = Engine.returnNumber(0, 100);
            int randomNumber2 = Engine.returnNumber(0, 100);
            int randomGameOption = Engine.returnNumber(0, 3);
            int result = 0;
            switch(randomGameOption) {
                case 1:
                    System.out.println("Question: " + randomNumber1 + " * " + randomNumber2);
                    result = Engine.multiply(randomNumber1, randomNumber2);
                    break;
                case 2:
                    System.out.println("Question: " + randomNumber1 + " - " + randomNumber2);
                    result = Engine.subtract(randomNumber1, randomNumber2);
                    break;
                case 3:
                    System.out.println("Question: " + randomNumber1 + " + " + randomNumber2);
                    result = Engine.add(randomNumber1, randomNumber2);
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

}
