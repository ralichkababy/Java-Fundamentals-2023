package DataTypesExercise;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstCode = Integer.parseInt(scanner.nextLine());
        int lastCode = Integer.parseInt(scanner.nextLine());

        for (int code = firstCode; code <= lastCode ; code++) {
            System.out.printf("%c ", code);

        }
    }
}
