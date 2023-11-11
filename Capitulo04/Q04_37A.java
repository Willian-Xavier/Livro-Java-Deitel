package Capitulo04;

import java.util.Scanner;

public class Q04_37A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um valor inteiro não negativo: ");
        int numeroFatorial = input.nextInt();

        while (numeroFatorial < 0) {
            System.out.println("Informe um valor inteiro não negativo: ");
            numeroFatorial = input.nextInt();
        }

        int resultadoFatorial = 1;

        System.out.printf("%d%s", numeroFatorial, "! = ");

        // Lógica utilizando while

        while (numeroFatorial > 0) {
            String separador = ".";
            if (numeroFatorial == 1)
                separador = "";
            System.out.printf("%d%s", numeroFatorial, separador);
            resultadoFatorial *= numeroFatorial;
            numeroFatorial -= 1;
        }

        System.out.printf("%s%d", " = ", resultadoFatorial);

        // Lógica utilizando for

//        for (int i = numeroFatorial; i > 0; i--) {
//            String separador = ".";
//            if (i == 1)
//                separador = "";
//            System.out.printf("%d%s", i, separador);
//            resultadoFatorial *= numeroFatorial;
//            numeroFatorial -= 1;
//        }

//        System.out.printf("%s%d", " = ", resultadoFatorial);
    }
}
