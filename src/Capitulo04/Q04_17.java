package Capitulo04;

import java.util.Scanner;

public class Q04_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quilometragemTotal = 0;
        double totalCombustivelConsumido = 0;

//        int qtdeQuilometrosDirigidos = input.nextInt();


//        System.out.println("Informe a quantidade de quilômetros dirigidos ou digite um valor menor ou igual a 0 " +
//                "para sair: ");
//        int qtdeQuilometrosDirigidos = input.nextInt();

        System.out.println("Informe a quantidade de quilômetros dirigidos ou digite um valor menor ou igual a 0 " +
                "para sair: ");
        int qtdeQuilometrosDirigidos = input.nextInt();

        while (qtdeQuilometrosDirigidos > 0) {
            if (qtdeQuilometrosDirigidos > 0) {
                System.out.println("Informe a quantidade de litos de combustível consumido: ");
                int qtdeCombustivelConsumido = input.nextInt();

                if (qtdeCombustivelConsumido > 0) {
                    double consumo = (double) qtdeQuilometrosDirigidos / qtdeCombustivelConsumido;
                    System.out.printf("O consumo de combustível dessa viagem foi de %.2f%s%n", consumo, " Km/L");
                    totalCombustivelConsumido += qtdeCombustivelConsumido;
                    quilometragemTotal += qtdeQuilometrosDirigidos;
                } else
                    System.out.println("Programa encerrado!");
            }
            System.out.printf("A quilometragem total é de %d%s%n", quilometragemTotal, "Km.");
            System.out.printf("O consumo total de combustível é de %.2f%s%n", totalCombustivelConsumido, "/L.");

            System.out.println("Informe a quantidade de quilômetros dirigidos ou digite um valor menor ou igual a 0 " +
                    "para sair: ");
            qtdeQuilometrosDirigidos = input.nextInt();
        }
    }
}
