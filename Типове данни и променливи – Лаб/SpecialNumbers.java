package DataTypesLab;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=num ; i++) {
            int currentSum = i;

            int sum=0;
            while (currentSum >0) {

                sum = sum+currentSum % 10;
                currentSum = currentSum/10;

            }
            boolean isSpecial = sum == 5 || sum == 7 || sum ==11;
            if (isSpecial) {
                System.out.printf("%d -> True%n", i);
            }
            else {
                System.out.printf("%d -> False%n", i);
            }
            }
        }
    }
