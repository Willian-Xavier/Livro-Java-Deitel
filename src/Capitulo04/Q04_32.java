/*
4.32 - Padr�o de tabuleiro de damas de asteriscos) Escreva um aplicativo que utiliza apenas as instru��es de sa�da
System.out.print("* ");
System.out.print(" ");
System.out.println();
para exibir o padr�o de tabuleiro de damas a seguir. Uma chamada de m�todo System.out.println sem argumentos faz com
que o programa gere sa�da de um �nico caractere de nova linha. [Dica: as instru��es de repeti��o s�o requeridas.]
*/

package Capitulo04;

public class Q04_32 {
    public static void main(String[] args) {
        int counter1 = 0;

        while (counter1 < 4) {
            int counter = 0;
            while (counter < 8) {
                System.out.print("* ");
                System.out.print(" ");
                counter++;
            }

            System.out.println();

            counter = 0;
            while (counter < 8) {
                System.out.print(" ");
                System.out.print("* ");
                counter++;
            }

            System.out.println();
            counter1++;
        }
    }
}
