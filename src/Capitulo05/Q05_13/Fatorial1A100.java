package Capitulo05.Q05_13;

public class Fatorial1A100 {
    public static void main(String[] args) {
        long fatorial1A100 = 1;

        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d%s", i, "! = ");
            for (int j = i; j >= 1; j--) {
                fatorial1A100 *= j;
                char separador = '.';
                if (j == 1)
                    separador = ' ';
                System.out.printf("%d%s", j, separador);
            }
            System.out.printf("%s%d", "= ", fatorial1A100);
            System.out.println();
            fatorial1A100 = 1;
        }

        /*A variável do tipo long suporta valores de -9,223,372,036,854,775,808 até 9,223,372,036,854,775,807
        portanto, só calcula o fatorial de 1 a 65, ainda assim transformando os valores em negativos*/
    }
}

