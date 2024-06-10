package Capitulo05.Q05_01.DrawCircles;

import javax.swing.*;
import java.awt.*;

public class DrawCircles extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < 12; i++) {
            g.drawOval(getWidth() / 2 - 10 * i, getHeight() / 2 - 10 * i, 20 * i, 20 * i);
        }
    }
}
