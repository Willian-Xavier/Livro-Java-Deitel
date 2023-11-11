package Capitulo04;

public class Increment {
    public static void main(String[] args) {
        int c = 5;

        System.out.printf("c antes do pós-incremento: %d%n", c);
        System.out.printf("pós-incremento de c: %d%n", c++);
        System.out.printf("c depois do pós-incremento: %d%n%n", c);

        c = 5;

        System.out.printf("c antes do pré-incremento: %d%n", c);
        System.out.printf("pré-incremento de c: %d%n", ++c);
        System.out.printf("c depois do pré-incremento: %d%n", c);
    }
}
