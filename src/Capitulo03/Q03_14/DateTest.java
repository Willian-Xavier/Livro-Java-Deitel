package Capitulo03.Q03_14;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(4, 1, 1993);

        System.out.println(date.displayDate());

        date.setMes(5);
        date.setDia(17);
        date.setAno(2022);

        System.out.println(date.displayDate());
        System.out.println(date.getAno());
        System.out.println(date.getMes());
        System.out.println(date.getDia());
    }
}
