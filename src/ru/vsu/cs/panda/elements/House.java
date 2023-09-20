package ru.vsu.cs.panda.elements;

import java.awt.*;

public class House {
    private int x, y;

    public House(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g) {
        Color save = g.getColor();
        g.setColor(Color.ORANGE);
        g.fillRect(x + 10, y + 300, 20, 30);
        g.fillRect(x + 310, y + 300, 20, 30);
        g.setColor(Color.RED);
        g.fillRect(x + 10, y + 100, 330, 200);
        g.setColor(Color.YELLOW);
        g.fillArc(x, y, 350, 200, 0, 180);
        g.setColor(Color.BLACK);
        g.fillRect(x + 60, y + 200, 240, 100);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(x + 50, y + 300, 170, 20);
        g.fillRect(x + 30, y + 320, 170, 10);
        g.setColor(save);
    }
}
