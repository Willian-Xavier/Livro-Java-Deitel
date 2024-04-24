/*
4.32 - Padrão de tabuleiro de damas de asteriscos) Escreva um aplicativo que utiliza apenas as instruções de saída
System.out.print("* ");
System.out.print(" ");
System.out.println();
para exibir o padrão de tabuleiro de damas a seguir. Uma chamada de método System.out.println sem argumentos faz com
que o programa gere saída de um único caractere de nova linha. [Dica: as instruções de repetição são requeridas.]
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
