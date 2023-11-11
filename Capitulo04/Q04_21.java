package Capitulo04;

import java.util.Scanner;

public class Q04_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int largest = 0;

        while (counter <= 10) {
            System.out.printf("%s%d%s%n", "Informe o ", counter, "º número: ");
            int number = input.nextInt();
//            if (counter == 1)
//                largest = number;

            if (number > largest || counter == 1)
                largest = number;
            counter++;
        }

        System.out.printf("%s%d%n", "O maior número foi ", largest);
    }
}
