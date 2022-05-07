package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static void even() {
        Engine.printWelcome();
        Engine.askName();
        String gamerName = Engine.getName();
        Engine.printGreeting(gamerName);
        int winsCounter = 0;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < Engine.getMaxTries(); i++) {
            String min = "0";
            String max = "1000";
            int randomNumber = Engine.returnNumber(Integer.parseInt(min), Integer.parseInt(max));
            String result = "yes";
            if (randomNumber % 2 == 1) {
                result = "no";
            }
            Engine.printTask(Integer.toString(randomNumber));
            String answer = Engine.getAnswer();
            Engine.printAnswer(answer);
            if (!answer.equals(result)) {
                Engine.printGameOverLine(answer, result, gamerName);
                break;
            }
            winsCounter = winsCounter + 1;
            Engine.printSuccessLines(winsCounter, gamerName);
        }
    }
}
