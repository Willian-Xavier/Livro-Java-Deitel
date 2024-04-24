package Capitulo04;

import java.util.Scanner;

public class Q04_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número binário: ");
        int numeroBinario = input.nextInt();

        int tamanho = Integer.toString(numeroBinario).length();
        int divisor = 1000;
        int numeroDecimal = 0;


//        for (int i = 0; i < Integer.toString(numeroBinario).length() - 1; i++) {
//            divisor *= 10;
//        }

        for (int i = 0; i <= Integer.toString(numeroBinario).length(); i++) {
//            numeroDecimal += (tamanho * (numeroBinario / divisor % 10));
            numeroBinario = numeroBinario / divisor;
            System.out.println(numeroBinario % 10);
//            System.out.println(divisor);
            divisor /= 10;
//            divisor /= 10;
//            tamanho--;
        }

        System.out.println(numeroDecimal);


//        System.out.println(divisor);
    }
}
