package Capitulo03.Q03_16;

public class HeartRates {
    private String nome;
    private String sobrenome;
    private int mes;
    private int dia;
    private int ano;

    public HeartRates(String nome, String sobrenome, int mes, int dia, int ano) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

//    int idade = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int calculaIdade(byte mesAtual, byte diaAtual, int anoAtual) {
        if (mesAtual >= this.mes && diaAtual >= this.dia && anoAtual >= this.ano)
            return anoAtual - this.ano;
        return anoAtual - this.ano - 1;
    }

    public int frequenciaCardiacaMaxima(byte mesAtual, byte diaAtual, int anoAtual) {
        if (mesAtual >= this.mes && diaAtual >= this.dia && anoAtual >= this.ano)
            return 220 - (anoAtual - this.ano);
        return 220 - (anoAtual - this.ano - 1);
    }

    public int frequenciaCardiacaAlvo(byte mesAtual, byte diaAtual, int anoAtual) {
        if (mesAtual >= this.mes && diaAtual >= this.dia && anoAtual >= this.ano)
            return ((220 - (anoAtual - this.ano)) * 85) / 100;
        return ((220 - (anoAtual - this.ano - 1)) * 85) / 100;
    }
}
