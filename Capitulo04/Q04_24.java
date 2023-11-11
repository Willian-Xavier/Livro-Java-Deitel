/*
4.24 - (Validando entrada de usu�rio) Modifique o programa na Figura 4.12 para validar suas entradas. Para qualquer
entrada, se o valor entrado for diferente de 1 ou 2, continue o loop at� o usu�rio inserir um valor correto.
 */

package Capitulo04;

import java.util.Scanner;

public class Q04_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10) {
            int result = 0;
            do {
                System.out.println("Enter result (1 = pass, 2 = fail): ");
                result = input.nextInt();
                if (result != 1 && result != 2)
                    System.out.println("Op��o Inv�lida!\nDigite Novamente!");
            } while (result != 1 && result != 2);

            if (result == 1)
                passes += 1;
            else
                failures += 1;

            studentCounter++;
        }
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
        if (passes > 8)
            System.out.println("Bonus to instructor!");
    }
}
