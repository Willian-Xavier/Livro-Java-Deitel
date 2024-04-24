package Capitulo04.Q04_38;

import java.util.Scanner;

public class TesteDescriptografa {
    public static void main(String[] args) {
        MetodosCriptografia metodosCriptografia2 = new MetodosCriptografia(0);
        Scanner input = new Scanner(System.in);
        int numero = 0;

        while (Integer.toString(numero).length() != 4) {
            System.out.println("Informe um número criptografado de 4 dígitos: ");
            numero = input.nextInt();
            if (Integer.toString(numero).length() != 4)
                System.out.println("Tamanho Inválido!");
        }

        String numeroCriptografado = Integer.toString(numero);
        System.out.println("Número descriptografado: " + metodosCriptografia2.descriptografaNumero(numeroCriptografado));
    }
}
