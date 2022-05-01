package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");;
        Scanner sc = new Scanner(System.in);
        String gameOption = sc.nextLine();
        System.out.println("Your choice: " + gameOption);
        switch(gameOption) {
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
