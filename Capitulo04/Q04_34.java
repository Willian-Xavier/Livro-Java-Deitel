/*
4.34 - (O que h� de errado com esse c�digo?) O que h� de errado com a seguinte instru��o? Forne�a a instru��o correta
para adicionar 1 � soma de x e y.
System.out.println(++(x + y));
 */

package Capitulo04;

public class Q04_34 {
    public static void main(String[] args) {
        int x = 32;
        int y = 39;
        System.out.println((x + y) + 1);
        /*
        x e y n�o s�o vari�veis, logo n�o � poss�vel incrementar uma express�o matem�tica
         */
    }
}
