/*
4.30 - (Palíndromos) Um palíndromo é uma sequência de caracteres que é lida da esquerda para a direita ou da direita
para a esquerda. Por exemplo, cada um dos seguintes inteiros de cinco dígitos é um palíndromo: 12321, 55555, 45554 e
11611. Escreva um aplicativo que lê em um inteiro de cinco dígitos e determina se ele é ou não um palíndromo. Se o
número não for de cinco dígitos, exiba uma mensagem de erro e permita que o usuário insira um novo valor.
 */

package Capitulo04;

import java.util.Scanner;

public class Q04_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 0;

        do {
            System.out.println("Informe um valor de 5 dígitos: ");
            numero = input.nextInt();
            if (Integer.toString(numero).length() != 5)
                System.out.println("Tamanho inválido!\nDigite um valor inteiro de 5 dígitos.");
        } while (Integer.toString(numero).length() != 5);

        int divisor = 10000;
        int multiplicador = 1;
        int novoNumero = 0;

        for (int i = 0; i < 5; i++) {
            novoNumero += (numero / divisor % 10) * multiplicador;
            divisor /= 10;
            multiplicador *= 10;
        }

        System.out.println(numero == novoNumero ? "É um palíndromo!" : "Não constitui um palíndromo!");

//        SEGUNDA LÓGICA, PORÉM, UTILIZANDO MAIS VARIÁVEIS

//        int centenaMilhar = numero / 10000 % 10;
//        int milhar = numero / 1000 % 10;
//        int centena = numero / 100 % 10;
//        int dezena = numero / 10 % 10;
//        int unidade = numero % 10;
//
//        int novoNumero = (unidade * 10000) + (dezena * 1000) + (centena * 100) + (milhar * 10) + centenaMilhar;
//
//        System.out.println(numero == novoNumero ? "É um palíndromo!" : "Não constitui um palíndromo!");
    }
}
