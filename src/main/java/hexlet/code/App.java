package hexlet.code;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner sc = new Scanner(System.in);
        String gameOption = sc.nextLine();
        System.out.println("Your choice: " + gameOption);
        if (gameOption.equals("1")) {
            Cli.cli();
        } else if (gameOption.equals("2") || gameOption.equals("3") || gameOption.equals("4") ||
                gameOption.equals("5") || gameOption.equals("6")) {
            Engine.playGame(gameOption);
        } else {
            System.out.println("Sorry! Wrong answer. Please, try again.");
        }
    }


}
