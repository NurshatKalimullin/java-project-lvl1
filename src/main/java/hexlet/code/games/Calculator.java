package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calculator {


    public static void calc() {
        Scanner sc = new Scanner(System.in);
        int winsCounter = 0;
        System.out.println("What is the result of the expression?");
        final int tries = 3;
        for (int i = 0; i < tries; i++) {
            String min = "0";
            String max = "100";
            int randomNumber1 = Engine.returnNumber(Integer.parseInt(min), Integer.parseInt(max));
            int randomNumber2 = Engine.returnNumber(Integer.parseInt(min), Integer.parseInt(max));
            max = "3";
            String  randomGameOption = Integer.toString(Engine.returnNumber(Integer.parseInt(min), Integer.parseInt(max)));
            int result = 0;
            switch (randomGameOption) {
                case "1":
                    System.out.println("Question: " + randomNumber1 + " * " + randomNumber2);
                    result = Engine.multiply(randomNumber1, randomNumber2);
                    break;
                case "2":
                    System.out.println("Question: " + randomNumber1 + " - " + randomNumber2);
                    result = Engine.subtract(randomNumber1, randomNumber2);
                    break;
                case "3":
                    System.out.println("Question: " + randomNumber1 + " + " + randomNumber2);
                    result = Engine.add(randomNumber1, randomNumber2);
                default:
                    System.out.println("There is not default. You stupid checkstyle!");
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
