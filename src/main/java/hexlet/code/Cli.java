package hexlet.code;


public class Cli {


    public static void cli() {
        Engine.printWelcome();
        Engine.askName();
        String gamerName = Engine.getName();
        Engine.printGreeting(gamerName);
    }


}

