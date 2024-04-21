package Capitulo04;

import java.util.Scanner;

public class Q04_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o n�mero da conta: ");
        int numeroDaConta = input.nextInt();
        System.out.println("Informe o saldo no in�cio do m�s: ");
        int saldoInicioMes = input.nextInt();
        System.out.println("Total de todos os itens cobrado no m�s: ");
        int totalItensCobrados = input.nextInt();
        System.out.println("Total de cr�ditos aplicados no m�s: ");
        int totalCreditosAplicados = input.nextInt();
        System.out.println("Limite de cr�dito autorizado: ");
        int limiteCreditoAutorizado = input.nextInt();

        int novoSaldo = saldoInicioMes + totalItensCobrados - limiteCreditoAutorizado;

        System.out.printf("Novo Saldo: %d", novoSaldo);

        if (novoSaldo > limiteCreditoAutorizado)
            System.out.println("Limite de cr�dito excedido!");
    }
}
