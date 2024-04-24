/*
4.29 - (Quadrado de asteriscos) Escreva um aplicativo que solicita ao usuário que insira o tamanho do lado de um
quadrado e, então, exibe um quadrado vazio desse tamanho com asteriscos. Seu programa deve trabalhar com quadrados de
todos os comprimentos de lado possíveis entre 1 e 20.
 */

package Capitulo04;

import java.util.Scanner;

public class Q04_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Digite o numero do tamanho do quadrado de 1 a 20 :");
        int quadrado = input.nextInt();

        for (int a = 1; a <= quadrado; a++) {
            System.out.print("*");
        }

        for (int a = 1; a <= quadrado; a++) {
            System.out.print("\n*");

            switch (quadrado) {
                case 3:
                    System.out.print(" ");
                    break;
                case 4:
                    System.out.print("  ");
                    break;
                case 5:
                    System.out.print("   ");
                    break;
                case 6:
                    System.out.print("    ");
                    break;
                case 7:
                    System.out.print("     ");
                    break;
                case 8:
                    System.out.print("      ");
                    break;
                case 9:
                    System.out.print("       ");
                    break;
                case 10:
                    System.out.print("        ");
                    break;
                case 11:
                    System.out.print("         ");
                    break;
                case 12:
                    System.out.print("          ");
                    break;
                case 13:
                    System.out.print("           ");
                    break;
                case 14:
                    System.out.print("            ");
                    break;
                case 15:
                    System.out.print("             ");
                    break;
                case 16:
                    System.out.print("              ");
                    break;
                case 17:
                    System.out.print("               ");
                    break;
                case 18:
                    System.out.print("                ");
                    break;
                case 19:
                    System.out.print("                 ");
                    break;
                case 20:
                    System.out.print("                  ");
                    break;
            }
            System.out.print("*\n");
        }

        for (int a = 1; a <= quadrado; a++) {
            System.out.print("*");
        }
    }
}

