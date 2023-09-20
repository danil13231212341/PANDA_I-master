package ru.vsu.cs.panda.elements;

import java.awt.*;

public class Bamboo {
    private int x, y;

    public Bamboo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g, int n){
        Color save = g.getColor();
        // Бамбук
        g.setColor(new Color(59, 136, 36, 255));
        for (int i = 0; i < n; i++) {
            g.fillRect(x + 80 + i * 50, y + 200, 15, 350);
        }
        g.setColor(save);
    }
}
