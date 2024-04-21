package Capitulo04;

import java.util.Scanner;

public class Q04_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salarioBruto = 0;
        final int PORCENTAGEM_AUMENTO = 50;
        final int QTDE_HORAS_SEMANAIS = 40;
        int cont = 1;

        while (cont <= 3) {
            System.out.printf("%s%d%s%n", "Informe a quantidade de horas semanais do ", cont, "� empregado: ");
            int numeroHorasTrabalhadas = input.nextInt();
            System.out.printf("%s%d%s%n", "Informe o sal�rio-hora do ", cont, "� empregado: ");
            double salarioHora = input.nextDouble();
            if (numeroHorasTrabalhadas > QTDE_HORAS_SEMANAIS) {
                salarioBruto = QTDE_HORAS_SEMANAIS * salarioHora + ((float) ((numeroHorasTrabalhadas
                        - QTDE_HORAS_SEMANAIS)) * salarioHora * PORCENTAGEM_AUMENTO / 100);
            } else {
                salarioBruto = numeroHorasTrabalhadas * salarioHora;
            }
            System.out.printf("%s%d%s%.2f%n", "O sal�rio bruto do ", cont, "� funcion�rio � de R$", salarioBruto);
            cont++;
        }
    }
}
