package Capitulo04.Q04_38;

import java.util.Scanner;

public class TesteCriptografa {
    public static void main(String[] args) {
        MetodosCriptografia metodosCriptografia = new MetodosCriptografia(0);
        Scanner input = new Scanner(System.in);
        int numero = 0;

        while (Integer.toString(numero).length() != 4) {
            System.out.println("Informe um número inteiro de 4 dígitos: ");
            metodosCriptografia.setNumero(numero = input.nextInt());
            if (Integer.toString(numero).length() != 4)
                System.out.println("Tamanho Inválido!");
        }

        System.out.println("Número criptografado: " + metodosCriptografia.criptografaNumero());
    }
}
