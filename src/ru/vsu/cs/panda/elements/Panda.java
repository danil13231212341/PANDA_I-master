package ru.vsu.cs.panda.elements;

import java.awt.*;

public class Panda {
    private int x, y;

    public Panda(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g) {
        Color save = g.getColor();
        //Верхняя часть туловища
        g.setColor(Color.BLACK);
        g.fillOval(x + 70, y + 60, 170, 180);
        // Нижняя часть тела панды
        g.setColor(Color.WHITE);
        g.fillOval(x + 50, y + 130, 200, 130);

        // Правая нога панды
        g.setColor(Color.BLACK);
        g.fillOval(x + 50, y + 210, 50, 50);


        //Левая нога панды
        g.fillOval(x + 200, y + 210, 50, 50);

        //правое ухо панды
        g.fillOval(x + 200, y, 30, 30);

        //левое ухо панды
        g.fillOval(x + 80, y, 30, 30);

        //Голова Панды
        g.setColor(Color.WHITE);
        g.fillOval(x + 85, y, 140, 110);

        //Овалы глаз
        g.setColor(Color.BLACK);
        g.fillOval(x + 110, y + 20, 25, 40);
        g.fillOval(x + 170, y + 20, 25, 40);

        // Глаза
        g.setColor(Color.WHITE);
        g.fillOval(x + 115, y + 35, 10, 10);
        g.fillOval(x + 175, y + 35, 10, 10);

        //Зрачки
        g.setColor(Color.BLACK);
        g.fillOval(x + 115, y + 38, 7, 7);
        g.fillOval(x + 177, y + 38, 7, 7);

        // Рот
        g.fillArc (x + 130, y + 70, 50, 20, 180, 180);

        // Нос

        g.fillOval(x + 150, y + 50, 10, 10);

        // Правая лапа

        g.fillOval(x + 200, y + 105, 120, 30);

        //Левая лапа

        g.fillOval(x, y + 105, 120, 30);

        //  папайя в руке у панды
        g.setColor(Color.YELLOW);
        g.fillArc(x, y + 60, 50, 120, 100, 180);

        g.setColor(save);
    }
}
