package Capitulo05.Q05_01.DrawSquares;

import javax.swing.*;
import java.awt.*;

public class DrawSquares extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < 12; i++) {
            g.drawRect(getWidth() / 2 - 10 * i, getHeight() / 2 - 10 * i, 20 * i, 20 * i);
        }
    }
}
