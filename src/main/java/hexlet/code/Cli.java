package hexlet.code;


import java.util.Scanner;

public class Cli {


    public static void cli() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String gamerName = sc.next();
        System.out.println(String.format("Hello, %s!", gamerName));
        sc.close();
    }


}

