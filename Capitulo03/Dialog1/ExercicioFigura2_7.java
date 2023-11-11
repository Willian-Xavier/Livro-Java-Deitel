package Capitulo03.Dialog1;

import javax.swing.*;

public class ExercicioFigura2_7 {
    public static void main(String[] args) {
        String number1 = JOptionPane.showInputDialog("Enter first integer: ");
        String number2 = JOptionPane.showInputDialog("Enter second integer: ");

        int soma = Integer.parseInt(number1) + Integer.parseInt(number2);

        JOptionPane.showMessageDialog(null, String.format("Sum is %s", soma));
    }
}
