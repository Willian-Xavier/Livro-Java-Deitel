package Capitulo03.Q03_16;

import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HeartRates heartRates = new HeartRates(null, null, 0, 0, 0);

        System.out.println("Informe seu nome: ");
        heartRates.setNome(input.next());
        System.out.println("Informe seu sobrenome: ");
        heartRates.setSobrenome(input.next());
        System.out.println("Informe seu dia de nascimento: ");
        heartRates.setDia(input.nextByte());
        System.out.println("Informe seu mês de nascimento: ");
        heartRates.setMes(input.nextByte());
        System.out.println("Informe seu ano de nascimento: ");
        heartRates.setAno(input.nextInt());
        System.out.println("Informe o dia atual: ");
        byte diaAtual = input.nextByte();
        System.out.println("Informe o mês atual: ");
        byte mesAtual = input.nextByte();
        System.out.println("Informe o ano atual: ");
        int anoAtual = input.nextInt();


        System.out.println("Nome: " + heartRates.getNome() + " " + heartRates.getSobrenome());
        System.out.println("Data Nascimento: " + heartRates.getMes() + "/" + heartRates.getDia() + "/" +
                heartRates.getAno());
        System.out.println("Idade: " + heartRates.calculaIdade(mesAtual, diaAtual, anoAtual) + " anos");
        System.out.println("Frequência Cardíaca Máxima: " + heartRates.frequenciaCardiacaMaxima(mesAtual, diaAtual,
                anoAtual) + "bpm");
        System.out.println("Frequência Cardíaca Alvo: " + heartRates.frequenciaCardiacaAlvo(mesAtual, diaAtual,
                anoAtual) + "bpm");
    }
}
