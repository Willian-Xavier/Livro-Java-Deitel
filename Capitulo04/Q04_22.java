package Capitulo04;

public class Q04_22 {
    public static void main(String[] args) {
        int n = 1;

        System.out.println("N    10*N    100*N   1000*N\n");
        for (int i = 1; i <= 5; i++)
            System.out.printf("%d%6s%d%6s%d%5s%d%n", i, "     ", i * 10, "     ", i * 100, "    ", i * 1000);
    }
}
