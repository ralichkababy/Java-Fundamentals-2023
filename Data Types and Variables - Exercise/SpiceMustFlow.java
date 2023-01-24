package DataTypesExercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int total = startingYield;
       
        int workedDays = 0;
        int workersEat = 26;

        while (startingYield>=100) {
            workedDays++;

            if (workedDays>1){
                total += startingYield - workersEat;
        }   else {
                total -= workersEat;
            }
            if (total < 0){
                total = 0;
            }
            startingYield -= 10;
        }
        if (workedDays == 0){
            total = 0;
        } else {
            total -= 26;
        }

        System.out.println(workedDays);
        System.out.println(total);
        }
    }
