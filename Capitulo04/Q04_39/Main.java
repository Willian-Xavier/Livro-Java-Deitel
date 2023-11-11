package Capitulo04.Q04_39;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a população mundial atual: ");
        long populacaoMundialAtual = input.nextLong();

//        long aumentoPopulacional = 0L;

        final double TAXA_MEDIA_CRESCIMENTO_ANUAL = 1.3F;

//        aumentoPopulacional = populacaoMundialAtual + ((populacaoMundialAtual * (long)TAXA_MEDIA_CRESCIMENTO_ANUAL) / 100);
//        System.out.println(aumentoPopulacional);
        System.out.println("||    Ano     ||    População Mundial    ||     Aumento anual    ||");

        for (int i = 0; i < 75; i++) {
            long aumentoPopulacional = ((populacaoMundialAtual * (long) TAXA_MEDIA_CRESCIMENTO_ANUAL)
                    / 100);
            System.out.printf("%8d%19s%-8d%10s%12d%n", i + 1, "     ", populacaoMundialAtual, "     ",
                    (populacaoMundialAtual + aumentoPopulacional) - populacaoMundialAtual);
            populacaoMundialAtual += aumentoPopulacional;
        }
    }
}

//        System.out.printf(new Locale("pt"), "%,d%n",Long.MAX_VALUE);
