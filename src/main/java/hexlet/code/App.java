package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

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
        switch (gameOption) {
            case "1":
                Cli.cli();
                break;
            case "2":
                Cli.cli();
                Even.even();
                break;
            case "3":
                Cli.cli();
                Calculator.calc();
                break;
            case "4":
                Cli.cli();
                GCD.gcd();
                break;
            case "5":
                Cli.cli();
                Progression.progression();
                break;
            case "6":
                Cli.cli();
                Prime.prime();
                break;
            default:
                System.out.println("Sorry! Wrong answer. Please, try again.");
        }

    }

}
