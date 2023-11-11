package Capitulo04.GUI;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int passos = 0;

        while (height - passos >= 0){
//            g.drawLine(0, 0, passos, height - passos);
            g.drawLine(height - passos,0,0, passos);
            g.drawLine(height-passos,height,0, height - passos);
//            g.drawLine(0,passos,height-passos, 0);
//            g.drawLine(0,passos, 0,height - passos);

//            g.drawLine(passos,0,0, height - passos);
            passos += 15;
        }

//        while (height - passos >= 0){
//            g.drawLine(0, 0, passos, height - passos);
//            g.drawLine(width, height, passos, height - passos);
//            g.drawLine(width, 0, passos, passos);
//            g.drawLine(0, height, passos, passos);
//
//            passos += 15;
//
//        }

//        g.drawLine(0, height, width, 0);
    }
}
