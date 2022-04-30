package hexlet.code;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");;
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        System.out.println("Your choice: " + number);
        if (number.equals("2")){
            Cli.cli();
            Even.even();
        }
        else if (number.equals("1")) {
            Cli.cli();
        } else if (!number.equals("0")) {
            System.out.println("Sorry! Wrong answer. Please, try again.");
        }

    }

}
