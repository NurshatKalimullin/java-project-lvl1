package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static void even() {
        String game = "Even";
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.playGame(game, rules);
    }

    public static String[] generateQuestionAndResult() {
        String min = "0";
        String max = "1000";
        String randomNumber = Integer.toString(Engine.returnNumber(Integer.parseInt(min),
                Integer.parseInt(max)));
        String result = "yes";
        if (Integer.parseInt(randomNumber) % 2 == 1) {
            result = "no";
        }
        return new String[]{randomNumber, result};
    }

}
