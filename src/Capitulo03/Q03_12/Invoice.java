package Capitulo03.Q03_12;

public class Invoice {
    private String numero;
    private String descricao;
    private int qtdeCompradaItem;
    private double precoPorItem;

    public Invoice(String numero, String descricao, int qtdeCompradaItem, double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        if (qtdeCompradaItem > 0)
            this.qtdeCompradaItem = qtdeCompradaItem;
        if (precoPorItem > 0.0)
            this.precoPorItem = precoPorItem;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdeCompradaItem() {
        return qtdeCompradaItem;
    }

    public void setQtdeCompradaItem(int qtdeCompradaItem) {
        this.qtdeCompradaItem = qtdeCompradaItem;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }

    public double getInvoiceAmount() {
        return this.precoPorItem * this.qtdeCompradaItem;
    }
}
