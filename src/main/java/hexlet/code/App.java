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
            case "0":
                return;
            case "1":
                Cli.cli();
                break;
            case "2":
                Even.start();
                break;
            case "3":
                Calculator.start();
                break;
            case "4":
                GCD.start();
                break;
            case "5":
                Progression.start();
                break;
            case "6":
                Prime.start();
                break;
            default:
                System.out.println("Sorry! Wrong answer. Please, try again.");
        }
    }
}
