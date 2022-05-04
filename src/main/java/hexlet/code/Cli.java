package hexlet.code;

import java.util.Scanner;

public class Cli {

    private static String gamerName;

    public static void cli() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        gamerName = sc.nextLine();
        System.out.println(String.format("Hello, %s!", gamerName));
    }

    public static String getGamer() {
        return gamerName;
    }

}

