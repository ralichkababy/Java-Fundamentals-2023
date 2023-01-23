package DataTypesLab;

import java.util.Scanner;

public class RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //double dul, sh, V = 0;

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double high = Double.parseDouble(scanner.nextLine());

        System.out.print("Length: ");

        System.out.print("Width: ");

        System.out.print("Height: ");

        double volume = (length * width * high) / 3;

        System.out.printf("Pyramid Volume: %.2f", volume);
    }
}
