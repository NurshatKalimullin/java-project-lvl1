package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    public static void gcd() {
        String game = "GCD";
        String rules = "Find the greatest common divisor of given numbers.";
        Engine.playGame(game, rules);
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

    public static String[] generateQuestionAndResult() {
        String min = "1";
        String max = "100";
        int randomNumber1 = Engine.returnNumber(Integer.parseInt(min), Integer.parseInt(max));
        int randomNumber2 = Engine.returnNumber(Integer.parseInt(min), Integer.parseInt(max));
        int result = findGreatestDivisor(randomNumber1, randomNumber2);
        String question = randomNumber1 + " " + randomNumber2;
        return new String[]{question, Integer.toString(result)};
    }

}
