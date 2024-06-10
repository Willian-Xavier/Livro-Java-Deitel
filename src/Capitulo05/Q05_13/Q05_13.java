/*(Fatoriais) Fatoriais costumam ser utilizados em problemas de probabilidade. O fatorial de um inteiro positivo n
(escrito como n! e pronunciado como "fatorial de n") � igual ao produto dos n�meros inteiros positivos de 1 a n.
Escreva um aplicativo que calcula os fatoriais de 1 a 20. Utilize o tipo long. Exiba os resultados em formato tabular.
Que dificuldade poderia impedir voc� de calcular o fatorial de 100?*/

package Capitulo05.Q05_13;

public class Q05_13 {
    public static void main(String[] args) {
        long fatorial = 1;

        for (int i = 1; i <= 20; i++) {
            System.out.printf("%d%s", i, "! = ");
            for (int j = i; j >= 1; j--) {
                fatorial *= j;
                char separador = '.';
                if (j == 1)
                    separador = ' ';
                System.out.printf("%d%s", j, separador);
            }
            System.out.printf("%s%d", "= ", fatorial);
            System.out.println();
            fatorial = 1;
        }
    }
}
