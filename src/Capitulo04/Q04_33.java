/*
4.34 - (Múltiplos de 2 com um loop infinito) Escreva um aplicativo que continue exibindo na janela de comando os
múltiplos do inteiro 2, a saber, 2, 4, 8, 16, 32, 64 e assim por diante. Seu loop não deve terminar (isto é, deve
criar um loop infinito). O que acontece quando você executa esse programa?
 */

package Capitulo04;

public class Q04_33 {
    public static void main(String[] args) {
        int multiplosDois = 1;

        while (true) {
            multiplosDois *= 2;
            System.out.printf("%d%s", multiplosDois, ", ");
        }

    /*
    O loop é executado até o número -2147483648. Após atingir este valor, os seguintes passam a ser 0, já que variáveis
    do tipo int suportam valores que vão de -2.147.483.648 até 2.147.483.647 (2^32).
    */
    }
}
