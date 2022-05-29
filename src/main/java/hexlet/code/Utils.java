package hexlet.code;

import java.util.Random;

public class Utils {

    public static int returnRandomNumber(int min, int max) {
        Random random = new Random();
        int randomNumber = random.nextInt(max);
        while (randomNumber <= min) {
            randomNumber = random.nextInt(max);
        }
        return randomNumber;
    }

}
