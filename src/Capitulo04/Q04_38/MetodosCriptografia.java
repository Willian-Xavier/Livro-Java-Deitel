package Capitulo04.Q04_38;


public class MetodosCriptografia {
    private int numero;

    public MetodosCriptografia(int numero) {
        if (Integer.toString(numero).length() == 4)
            this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String criptografaNumero() {
        int novoNumero = 0;
        int multiplicador = 1000;

        for (int i = 0; i < 4; i++) {
            novoNumero += (Integer.parseInt(String.valueOf(Integer.toString(this.numero).charAt(i))) + 7) % 10 *
                    multiplicador;
            multiplicador /= 10;
        }

        String novoNumeroString = Integer.toString(novoNumero);

        if (Integer.toString(novoNumero).length() < 4)
            return String.format("%s%s0%s", (novoNumeroString).charAt(1), (novoNumeroString).charAt(2),
                    (novoNumeroString).charAt(0));
        else
            return String.format("%s%s%s%s", (novoNumeroString).charAt(2), (novoNumeroString).charAt(3),
                    (novoNumeroString).charAt(0), (novoNumeroString).charAt(1));
    }

    public String descriptografaNumero(String numeroCriptografado) {
        int novoNumero = 0;
        int multiplicador = 1000;

        for (int i = 0; i < 4; i++) {
            if (i == 0 || i == 1) {
                novoNumero = novoNumero + ((10 + (Integer.parseInt(String.valueOf(numeroCriptografado.charAt(i + 2))))
                        - 7) % 10 * multiplicador);
            } else {
                novoNumero = novoNumero + ((10 + (Integer.parseInt(String.valueOf(numeroCriptografado.charAt(i - 2))))
                        - 7) % 10 * multiplicador);
            }
            multiplicador /= 10;
        }
        return Integer.toString(novoNumero);
    }
}
