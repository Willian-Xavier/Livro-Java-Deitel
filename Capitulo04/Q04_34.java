/*
4.34 - (O que há de errado com esse código?) O que há de errado com a seguinte instrução? Forneça a instrução correta
para adicionar 1 à soma de x e y.
System.out.println(++(x + y));
 */

package Capitulo04;

public class Q04_34 {
    public static void main(String[] args) {
        int x = 32;
        int y = 39;
        System.out.println((x + y) + 1);
        /*
        x e y não são variáveis, logo não é possível incrementar uma expressão matemática
         */
    }
}
