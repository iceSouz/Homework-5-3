package sport;

import java.util.Arrays;
import java.util.Random;

public class Rugby {
    public static final int NUMBER_PLAYERS = 25;
    public static final int LOWER_AGE = 18;
    public static final int UPPER_AGE = 40;

    public static void main(String[] args) {
        String teamGreen = "Green";
        int[] agesGreen = new int[NUMBER_PLAYERS];
        int totalAgeGreen = 0;

        String teamRed = "Red";
        int[] agesRed = new int[NUMBER_PLAYERS];
        int totalAgeRed = 0;

        Random random = new Random();

        for (int i = 0; i < NUMBER_PLAYERS; i++) {
            agesGreen[i] = random.nextInt(UPPER_AGE - LOWER_AGE) + LOWER_AGE;
            agesRed[i] = random.nextInt(UPPER_AGE - LOWER_AGE) + LOWER_AGE;

            totalAgeGreen += agesGreen[i];
            totalAgeRed += agesRed[i];
        }

        System.out.println("Ages of " + teamGreen + " team: " + Arrays.toString(agesGreen));
        System.out.println("Ages of " + teamRed + " team: " + Arrays.toString(agesRed));

        double avgAgeGreen = totalAgeGreen / (double) NUMBER_PLAYERS;
        double avgAgeRed = totalAgeRed / (double) NUMBER_PLAYERS;

        System.out.println("Average age of " + teamGreen + " = " + avgAgeGreen);
        System.out.println("Average age of " + teamRed + " = " + avgAgeRed);
    }
}
