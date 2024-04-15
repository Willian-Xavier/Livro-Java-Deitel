package Capitulo03.Q03_12;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("33", "Processador Intel Core I7, 13ª Geração",
                0, 2_750);
        Invoice invoice2 = new Invoice("39", "Memória RAM DDR5, 5200MHz", 0,
                239.90);
        Invoice invoice3 = new Invoice("53", "Monitor 4k", 0,
                1_320);
        Invoice invoice4 = new Invoice("22", "Mouse Gamer Razer", 0,
                370);


        System.out.printf("Número: %s%n", invoice1.getNumero());
        System.out.printf("Descrição: %s%n", invoice1.getDescricao());
        invoice1.setQtdeCompradaItem(1);
        System.out.printf("Quantidade Comprada: %d%n", invoice1.getQtdeCompradaItem());
        System.out.printf("Preço por item: %.2f%n", invoice1.getPrecoPorItem());
        System.out.printf("Total: R$%.2f%n%n", invoice1.getInvoiceAmount());


        System.out.printf("Número: %s%n", invoice2.getNumero());
        System.out.printf("Descrição: %s%n", invoice2.getDescricao());
        invoice2.setQtdeCompradaItem(4);
        System.out.printf("Quantidade Comprada: %d%n", invoice2.getQtdeCompradaItem());
        System.out.printf("Preço por item: %.2f%n", invoice2.getPrecoPorItem());
        System.out.printf("Total: R$%.2f%n%n", invoice2.getInvoiceAmount());


        System.out.printf("Número: %s%n", invoice3.getNumero());
        System.out.printf("Descrição: %s%n", invoice3.getDescricao());
        invoice3.setQtdeCompradaItem(2);
        System.out.printf("Quantidade Comprada: %d%n", invoice3.getQtdeCompradaItem());
        System.out.printf("Preço por item: %.2f%n", invoice3.getPrecoPorItem());
        System.out.printf("Total: R$%.2f%n%n", invoice3.getInvoiceAmount());


        System.out.printf("Número: %s%n", invoice4.getNumero());
        System.out.printf("Descrição: %s%n", invoice4.getDescricao());
        invoice4.setQtdeCompradaItem(1);
        System.out.printf("Quantidade Comprada: %d%n", invoice4.getQtdeCompradaItem());
        System.out.printf("Preço por item: %.2f%n", invoice4.getPrecoPorItem());
        System.out.printf("Total: R$%.2f", invoice4.getInvoiceAmount());
//        System.out.println(invoice1.getPrecoPorItem());

    }
}
