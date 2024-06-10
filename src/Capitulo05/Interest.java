package Capitulo05;

public class Interest {
    public static void main(String[] args) {
        double amount = 0;
        double principal = 1_000;
        final double RATE = 0.05;

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (int year = 1; year <= 10; year++) {
            amount = principal * Math.pow(1.0 + RATE, year);
            System.out.printf("%3d%,21.2f%n", year, amount);
        }

/*        amount = principal;

        for (int i = 1; i <= 10; i++) {
            amount += (amount * RATE);
            System.out.printf("%s%d%s%.2f%n", "Valor do ", i, "º ano: U$$", amount);
        }*/
    }
}
