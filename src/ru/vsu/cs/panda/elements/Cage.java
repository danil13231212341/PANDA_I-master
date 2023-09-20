package ru.vsu.cs.panda.elements;

import java.awt.*;

public class Cage {
    private int x, y;

    public Cage(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g, int n) {
        Color save = g.getColor();
        //Крыша клетки
        g.setColor(Color.BLUE);
        g.fillArc(x, y, 1000, 300, 0, 180);
        // Основа клетки
        g.setColor(Color.DARK_GRAY);
        g.fillRect(x + 60, y + 550, 900, 30);
        // Решетка
        g.setColor(Color.GRAY);
        for (int i = 0; i < n; i++) {
            g.fillRect(x + 60 + i * 50, y + 150, 10, 400);
        }


        g.setColor(new Color(0xFFFFFF));
        g.setFont(new Font("Times", Font.PLAIN, 25));
        g.drawString("Заключенный №01010.Не кормить.", x + 280, y + 577);

        g.setColor(save);
    }

}
