package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    private static boolean isPrime(int number) {
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

    public static void getRules() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static String[] generateQuestionAndResult() {
        String min = "0";
        String max = "100";
        int randomNumber = Engine.returnNumber(Integer.parseInt(min), Integer.parseInt(max));
        String result = "yes";
        if (!isPrime(randomNumber)) {
            result = "no";
        }
        return new String[]{Integer.toString(randomNumber), result};
    }
}
