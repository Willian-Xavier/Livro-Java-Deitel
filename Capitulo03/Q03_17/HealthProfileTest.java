package Capitulo03.Q03_17;

import java.util.Scanner;

@SuppressWarnings("DuplicatedCode")
public class HealthProfileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HealthProfile healthProfile = new HealthProfile(null, null, ' ', 0,
                0, 0, 0, 0);
        char sexo = ' ';

        System.out.println("Informe seu nome: ");
        healthProfile.setNome(input.nextLine());
        System.out.println("Informe seu sobrenome: ");
        healthProfile.setSobrenome(input.nextLine());
        do {
            System.out.println("Informe seu sexo: M - Masculino / F - Feminino: ");
            sexo = input.next().toUpperCase().charAt(0);
            if (sexo != 'M' && sexo != 'F')
                System.out.println("Sexo Inválido!\nDigite Novamente!");
        } while (sexo != 'M' && sexo != 'F');
        healthProfile.setSexo(sexo);
        System.out.println("Informe sua altura: ");
        healthProfile.setAltura(input.nextFloat());
        System.out.println("Informe seu peso: ");
        healthProfile.setPeso(input.nextFloat());
        System.out.println("Informe seu dia de nascimento: ");
        healthProfile.setDiaNascimento(input.nextByte());
        System.out.println("Informe seu mês de nascimento: ");
        healthProfile.setMesNascimento(input.nextByte());
        System.out.println("Informe seu ano de nascimento: ");
        healthProfile.setAnoNascimento(input.nextInt());
        System.out.println("Informe o dia atual: ");
        byte diaAtual = input.nextByte();
        System.out.println("Informe o mês atual: ");
        byte mesAtual = input.nextByte();
        System.out.println("Informe o ano atual: ");
        int anoAtual = input.nextInt();

        System.out.println("Nome: " + healthProfile.getNome() + " " + healthProfile.getSobrenome());
        System.out.println("Sexo: " + healthProfile.getSexo());
        System.out.println("Data Nascimento: " + healthProfile.getMesNascimento() + "/" +
                healthProfile.getDiaNascimento() + "/" + healthProfile.getAnoNascimento());
        System.out.printf("Altura: %.2f%s%n", healthProfile.getAltura(), "m");
        System.out.printf("Peso: %.2f%s%n", healthProfile.getPeso(), "Kg");
        System.out.println("Idade: " + healthProfile.calculaIdade(mesAtual, diaAtual, anoAtual) + " anos");
        System.out.println("Frequência Cardíaca Máxima: " + healthProfile.frequenciaCardiacaMaxima(mesAtual, diaAtual,
                anoAtual) + "bpm");
        System.out.println("Frequência Cardíaca Alvo: " + healthProfile.frequenciaCardiacaAlvo(mesAtual, diaAtual,
                anoAtual) + "bpm");
        System.out.printf("IMC: %.2f%n", healthProfile.calculoIMC());
        healthProfile.tabelaIndiceMassaCorporal();
    }
}
