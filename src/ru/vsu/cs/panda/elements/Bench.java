package ru.vsu.cs.panda.elements;

import java.awt.*;

public class Bench {
    private int x, y;

    public Bench(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g) {
        Color save = g.getColor();
        //Ножки для лавочки
        g.setColor(Color.DARK_GRAY);
        g.fillRect(x + 40, y + 80, 10, 40);
        g.fillRect(x + 240, y + 80, 10, 40);
        //Сиденье у скамейки
        g.setColor(Color.BLUE);
        g.fillRect(x, y + 50, 300, 30);
        // Ножки к спинке скамейки
        g.setColor(Color.DARK_GRAY);
        g.fillRect(x + 60, y + 30, 10, 20);
        g.fillRect(x + 260, y + 30, 10, 20);
        //Спинка Скамейки
        g.setColor(Color.BLUE);
        g.fillRect(x + 30, y, 300, 30);
        g.setColor(save);
    }

}
