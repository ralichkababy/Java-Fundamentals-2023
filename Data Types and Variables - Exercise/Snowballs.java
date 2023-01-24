package DataTypesExercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balls = Integer.parseInt(scanner.nextLine());

        int ballSnow = 0;
        int ballTime = 0;
        int ballQuality = 0;

        double maxValue = Double.MIN_VALUE;

        for (int n = 1; n <= balls; n++) {
            int newBallSnow = Integer.parseInt(scanner.nextLine());
            int newBallTime = Integer.parseInt(scanner.nextLine());
            int newBallQuality = Integer.parseInt(scanner.nextLine());

            int a = newBallSnow / newBallTime;
            double value = Math.pow(a * 1.0, newBallQuality * 1.0);

            if (value > maxValue) {
                ballSnow = newBallSnow;
                ballTime = newBallTime;
                ballQuality = newBallQuality;
                maxValue = value;
            }
            }
            System.out.printf("%d : %d = %.0f (%d)", ballSnow, ballTime, maxValue, ballQuality);
        }
    }
