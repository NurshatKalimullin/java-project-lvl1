package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    public static void gcd() {
        Engine.printWelcome();
        Engine.askName();
        String gamerName = Engine.getName();
        Engine.printGreeting(gamerName);
        int winsCounter = 0;
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < Engine.getMaxTries(); i++) {
            String min = "1";
            String max = "100";
            int randomNumber1 = Engine.returnNumber(Integer.parseInt(min), Integer.parseInt(max));
            int randomNumber2 = Engine.returnNumber(Integer.parseInt(min), Integer.parseInt(max));
            int result = findGreatestDivisor(randomNumber1, randomNumber2);
            Engine.printTask(randomNumber1 + " " + randomNumber2);
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

    private static int findGreatestDivisor(int randomNumber1, int randomNumber2) {
        int minNumber = randomNumber1;
        int maxNumber = randomNumber2;
        if (randomNumber1 > randomNumber2) {
            minNumber = randomNumber2;
            maxNumber = randomNumber1;
        }
        int result = 0;
        for (int i = minNumber; i > 0; i--) {
            if (minNumber % i == 0) {
                if (maxNumber % i == 0) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }

}
