package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    public static void prime() {
        Engine.printWelcome();
        Engine.askName();
        String gamerName = Engine.getName();
        Engine.printGreeting(gamerName);
        int winsCounter = 0;
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < Engine.getMaxTries(); i++) {
            String min = "0";
            String max = "100";
            int randomNumber = Engine.returnNumber(Integer.parseInt(min), Integer.parseInt(max));
            String result = "yes";
            if (!isPrime(randomNumber)) {
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
