package Capitulo04;

import java.util.Scanner;

public class Q04_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int primeiroMaiorNumero = 0;
        int segundoMaiorNumero = 0;
        int counter = 1;

        while (counter <= 10) {
            System.out.printf("%s%d%s%n", "Informe o ", counter, "º número: ");
            int numero = input.nextInt();
            if (counter == 1) {
                primeiroMaiorNumero = numero;
                segundoMaiorNumero = numero;
            }
            if (numero > primeiroMaiorNumero) {
                segundoMaiorNumero = primeiroMaiorNumero;
                primeiroMaiorNumero = numero;
            }
            counter++;
        }

        System.out.printf("%s%d%n", "O primeiro maior número foi o ", primeiroMaiorNumero);
        System.out.printf("%s%d", "O segundo maior número foi o ", segundoMaiorNumero);
    }
}
