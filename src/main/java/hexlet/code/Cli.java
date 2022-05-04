package hexlet.code;

import java.util.Scanner;

public class Cli {

    protected static Gamer gamer;

    public static void cli() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        Gamer gamer = new Gamer(sc.nextLine());
        System.out.println(String.format("Hello, %s!", gamer.getName()));
    }

}

