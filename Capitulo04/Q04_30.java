/*
4.30 - (Pal�ndromos) Um pal�ndromo � uma sequ�ncia de caracteres que � lida da esquerda para a direita ou da direita
para a esquerda. Por exemplo, cada um dos seguintes inteiros de cinco d�gitos � um pal�ndromo: 12321, 55555, 45554 e
11611. Escreva um aplicativo que l� em um inteiro de cinco d�gitos e determina se ele � ou n�o um pal�ndromo. Se o
n�mero n�o for de cinco d�gitos, exiba uma mensagem de erro e permita que o usu�rio insira um novo valor.
 */

package Capitulo04;

import java.util.Scanner;

public class Q04_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 0;

        do {
            System.out.println("Informe um valor de 5 d�gitos: ");
            numero = input.nextInt();
            if (Integer.toString(numero).length() != 5)
                System.out.println("Tamanho inv�lido!\nDigite um valor inteiro de 5 d�gitos.");
        } while (Integer.toString(numero).length() != 5);

        int divisor = 10000;
        int multiplicador = 1;
        int novoNumero = 0;

        for (int i = 0; i < 5; i++) {
            novoNumero += (numero / divisor % 10) * multiplicador;
            divisor /= 10;
            multiplicador *= 10;
        }

        System.out.println(numero == novoNumero ? "� um pal�ndromo!" : "N�o constitui um pal�ndromo!");

//        SEGUNDA L�GICA, POR�M, UTILIZANDO MAIS VARI�VEIS

//        int centenaMilhar = numero / 10000 % 10;
//        int milhar = numero / 1000 % 10;
//        int centena = numero / 100 % 10;
//        int dezena = numero / 10 % 10;
//        int unidade = numero % 10;
//
//        int novoNumero = (unidade * 10000) + (dezena * 1000) + (centena * 100) + (milhar * 10) + centenaMilhar;
//
//        System.out.println(numero == novoNumero ? "� um pal�ndromo!" : "N�o constitui um pal�ndromo!");
    }
}
