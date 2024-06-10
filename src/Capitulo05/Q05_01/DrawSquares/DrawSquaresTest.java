package Capitulo05.Q05_01.DrawSquares;

import javax.swing.*;

public class DrawSquaresTest {
    public static void main(String[] args) {
        DrawSquares drawSquares = new DrawSquares();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(drawSquares);
        application.setSize(300, 300);
        application.setVisible(true);
    }
}
