package Capitulo04.Q04_38;

import java.util.Scanner;

public class TesteCriptografa {
    public static void main(String[] args) {
        MetodosCriptografia metodosCriptografia = new MetodosCriptografia(0);
        Scanner input = new Scanner(System.in);
        int numero = 0;

        while (Integer.toString(numero).length() != 4) {
            System.out.println("Informe um n�mero inteiro de 4 d�gitos: ");
            metodosCriptografia.setNumero(numero = input.nextInt());
            if (Integer.toString(numero).length() != 4)
                System.out.println("Tamanho Inv�lido!");
        }

        System.out.println("N�mero criptografado: " + metodosCriptografia.criptografaNumero());
    }
}
