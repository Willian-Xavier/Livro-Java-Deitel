package Capitulo04;

public class Increment {
    public static void main(String[] args) {
        int c = 5;

        System.out.printf("c antes do p�s-incremento: %d%n", c);
        System.out.printf("p�s-incremento de c: %d%n", c++);
        System.out.printf("c depois do p�s-incremento: %d%n%n", c);

        c = 5;

        System.out.printf("c antes do pr�-incremento: %d%n", c);
        System.out.printf("pr�-incremento de c: %d%n", ++c);
        System.out.printf("c depois do pr�-incremento: %d%n", c);
    }
}
