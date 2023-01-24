package DataTypesExercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustion = Integer.parseInt(scanner.nextLine());

        int sourceOfPower = power;

        int targets = 0;

        while (power>=distance) {
            power -= distance;
            targets ++;

            if (power == sourceOfPower/2 && exhaustion != 0){
                power /= exhaustion;
            }
            else {

            }
        }
        System.out.println(power);
        System.out.println(targets);
    }
}
