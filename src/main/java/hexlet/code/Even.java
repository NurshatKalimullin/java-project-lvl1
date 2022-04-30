package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {

    public static void even() {
        Scanner sc = new Scanner(System.in);
        int winsCounter = 0;
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(1000);
            String even = "yes";
            if (randomNumber % 2 == 1) {
                even = "no";
            }
            System.out.println("Question: " + randomNumber);
            String answer = sc.nextLine();
            System.out.println("Your answer: " + answer);
            if (!answer.equals(even)) {
                System.out.println(String.format("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!", answer, even, Cli.gamerName));
                break;
            }
            winsCounter = winsCounter + 1;
            System.out.println("Correct!");
            if (winsCounter == 3) {
                System.out.println(String.format("Congratulations, %s!", Cli.gamerName));
            }
        }
    }
}
