package Capitulo05.Q05_01.DrawCircles;

import javax.swing.*;

public class DrawCirclesTest {
    public static void main(String[] args) {
        DrawCircles drawCircles = new DrawCircles();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(drawCircles);
        application.setSize(300, 300);
        application.setVisible(true);
    }
}
