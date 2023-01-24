package DataTypesExercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 255;
        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            int litters = Integer.parseInt(scanner.nextLine());
            sum += litters;
            if (sum > capacity) {
                System.out.printf("Insufficient capacity!%n");
                sum -= litters;
            }
            if (i == number) {
                System.out.println(sum);
            }
        }
    }}
