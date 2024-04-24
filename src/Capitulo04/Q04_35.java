/*
4.35 - (Lados de um triângulo) Escreva um aplicativo que lê três valores diferentes de zero inseridos pelo usuário,
determina e imprime se eles poderiam representar os lados de um triângulo.
 */

package Capitulo04;

import java.util.Scanner;

public class Q04_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ladoA = 0;
        int ladoB = 0;
        int ladoC = 0;

        while (ladoA == 0 || ladoB == 0 || ladoC == 0) {
            System.out.println("Informe um valor maior que 0 para o Lado A: ");
            ladoA = input.nextInt();
            System.out.println("Informe um valor maior que 0 para o Lado B: ");
            ladoB = input.nextInt();
            System.out.println("Informe um valor maior que 0 para o Lado C: ");
            ladoC = input.nextInt();
            if (ladoA == 0 || ladoB == 0 || ladoC == 0)
                System.out.println("Proibido lado com valor 0.");
        }

        if ((ladoA + ladoB) > ladoC && (ladoA + ladoC) > ladoB && (ladoB + ladoC) > ladoA)
            System.out.println("Os valores podem representar os lados de um triângulo!");
        else
            System.out.println("Os valores não podem representar os lados de um triângulo!");
    }
}
