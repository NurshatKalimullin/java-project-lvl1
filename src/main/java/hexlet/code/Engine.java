package hexlet.code;

public class Engine {

    public static void printGameOverLine(String answer, String result) {
        System.out.println(String.format("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!", answer, result, Cli.gamerName));
    }

    public static void printSuccessLines(int winsCounter) {
        System.out.println("Correct!");
        if (winsCounter == 3) {
            System.out.println(String.format("Congratulations, %s!", Cli.gamerName));
        }
    }

}
