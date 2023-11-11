package Capitulo03.Q03_17;

public class HealthProfile {
    private String nome;
    private String sobrenome;
    private char sexo;
    private int mesNascimento;
    private int diaNascimento;
    private int anoNascimento;
    private float altura;
    private float peso;

    public HealthProfile(String nome, String sobrenome, char sexo, int mesNascimento, int diaNascimento,
                         int anoNascimento, float altura, float peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.mesNascimento = mesNascimento;
        this.diaNascimento = diaNascimento;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
        this.peso = peso;
    }

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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int calculaIdade(byte mesAtual, byte diaAtual, int anoAtual) {
        if (mesAtual >= this.mesNascimento && diaAtual >= this.diaNascimento && anoAtual >= this.anoNascimento)
            return anoAtual - this.anoNascimento;
        return anoAtual - this.anoNascimento - 1;
    }

    public int frequenciaCardiacaMaxima(byte mesAtual, byte diaAtual, int anoAtual) {
        // Verifica o sexo e determina o valor da fórmula
        int valorCalculo = 220;
        if (this.sexo == 'F')
            valorCalculo = 226;
        // Cálculo
        if (mesAtual >= this.mesNascimento && diaAtual >= this.diaNascimento && anoAtual >= this.anoNascimento)
            return valorCalculo - (anoAtual - this.anoNascimento);
        return valorCalculo - (anoAtual - this.anoNascimento - 1);
    }

    public int frequenciaCardiacaAlvo(byte mesAtual, byte diaAtual, int anoAtual) {
        int valorCalculo = 220;
        if (this.sexo == 'F')
            valorCalculo = 226;

        if (mesAtual >= this.mesNascimento && diaAtual >= this.diaNascimento && anoAtual >= this.anoNascimento)
            return ((valorCalculo - (anoAtual - this.anoNascimento)) * 85) / 100;
        return ((valorCalculo - (anoAtual - this.anoNascimento - 1)) * 85) / 100;
    }

    public double calculoIMC() {
        return this.peso / Math.pow(this.altura, 2);
    }

    public void tabelaIndiceMassaCorporal() {
        System.out.println("========== Índice de Massa Corporal ==========");
        System.out.println("Abaixo do peso: menos de 18.4");
        System.out.println("Normal: entre 18.5 e 24.9");
        System.out.println("Acima do peso: entre 25 e 29.9");
        System.out.println("Obeso: 30 ou acima");
        System.out.println("==============================================");
    }
}
