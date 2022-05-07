package hexlet.code.games;

import hexlet.code.Engine;

public class Calculator {


    public static void calc() {
        Engine.printWelcome();
        Engine.askName();
        String gamerName = Engine.getName();
        Engine.printGreeting(gamerName);
        int winsCounter = 0;
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < Engine.getMaxTries(); i++) {
            String min = "0";
            String max = "100";
            int randomNumber1 = Engine.returnNumber(Integer.parseInt(min), Integer.parseInt(max));
            int randomNumber2 = Engine.returnNumber(Integer.parseInt(min), Integer.parseInt(max));
            String optionsMax = "4";
            String randomGameOption = Integer.toString(Engine.returnNumber(Integer.parseInt(min), Integer.parseInt(optionsMax)));
            int result = 0;
            switch (randomGameOption) {
                case "1":
                    Engine.printTask(randomNumber1 + " * " + randomNumber2);
                    result = Engine.multiply(randomNumber1, randomNumber2);
                    break;
                case "2":
                    Engine.printTask(randomNumber1 + " - " + randomNumber2);
                    result = Engine.subtract(randomNumber1, randomNumber2);
                    break;
                case "3":
                    Engine.printTask(randomNumber1 + " + " + randomNumber2);
                    result = Engine.add(randomNumber1, randomNumber2);
                    break;
                default:
                    throw new Error(String.format("Unknown order state: %s!", randomGameOption));
            }
            String answer = Engine.getAnswer();
            Engine.printAnswer(answer);
            if (!answer.equals(Integer.toString(result))) {
                Engine.printGameOverLine(answer, Integer.toString(result), gamerName);
                break;
            }
            winsCounter = winsCounter + 1;
            Engine.printSuccessLines(winsCounter, gamerName);
        }


    }

}
