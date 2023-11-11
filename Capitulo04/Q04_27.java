package Capitulo04;

public class Q04_27 {
    public static void main(String[] args) {
        // Letra a
        int x = 9;
        int y = 11;
        if (x < 10) {
            if (y > 10)
                System.out.println("*****");
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");
        }

        x = 11;
        y = 9;

        // Letra b

        if (x < 10) {
            if (y > 10) {
                System.out.println("*****");
            }
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");
        }
    }
}
