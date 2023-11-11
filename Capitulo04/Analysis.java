package Capitulo04;

import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10) {
            System.out.println("Enter result (1 = pass, 2 = fail): ");
            byte result = input.nextByte();
            if (result == 1)
                passes += 1;
/*                passes++;  O incremento também pode ser feito das duas formas
                  ++passes;

 */
            else
                failures += 1;
/*
                failures++;
                ++failures;
*/
            studentCounter++;
        }

        // Os operadores de incremento ou decremento só podem ser utilizados com variáveis

        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        if (passes > 8)
            System.out.println("Bonus to instructor!");
    }
}
