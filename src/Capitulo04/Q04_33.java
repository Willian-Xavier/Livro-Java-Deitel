/*
4.34 - (M�ltiplos de 2 com um loop infinito) Escreva um aplicativo que continue exibindo na janela de comando os
m�ltiplos do inteiro 2, a saber, 2, 4, 8, 16, 32, 64 e assim por diante. Seu loop n�o deve terminar (isto �, deve
criar um loop infinito). O que acontece quando voc� executa esse programa?
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
    O loop � executado at� o n�mero -2147483648. Ap�s atingir este valor, os seguintes passam a ser 0, j� que vari�veis
    do tipo int suportam valores que v�o de -2.147.483.648 at� 2.147.483.647 (2^32).
    */
    }
}
