package Capitulo05.Q05_03;

public class Q05_03_D {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.print(i);
            if (i % 5 == 0)
                System.out.println();
            else
                System.out.print('\t');
        }
    }
}
