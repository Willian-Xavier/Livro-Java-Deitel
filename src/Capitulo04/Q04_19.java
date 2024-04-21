package Capitulo04;

import java.util.Scanner;

public class Q04_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double COMISSAO_SEMANAL = 200;
        double totalVendasSemana = 0;

        System.out.println("Informe o código do item comprado: Entre 1 e 4: ");
        int codigoItem = input.nextInt();

        while (codigoItem >= 1 && codigoItem <= 4) {
            if (codigoItem == 1)
                totalVendasSemana += 239.99;
            else if (codigoItem == 2) {
                totalVendasSemana += 129.75;
            } else if (codigoItem == 3) {
                totalVendasSemana += 99.95;
            } else
                totalVendasSemana += 350.89;

            System.out.println("Informe o código do item comprado: Entre 1 e 4: ");
            codigoItem = input.nextInt();
        }

        double rendimentoSemanalVendedor = COMISSAO_SEMANAL + ((totalVendasSemana * 9) / 100);
        System.out.printf("Os rendimentos do vendedor na última semana foram de R$%.2f", rendimentoSemanalVendedor);
    }
}
