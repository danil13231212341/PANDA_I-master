package ru.vsu.cs.panda.elements;

import java.awt.*;

public class StreetLight {
    private int x, y;
    private int width, height;

    private Color[] lightColors = new Color[]{
            new Color(17, 16, 16),
            new Color(238, 255, 0),
    };
    private int iLightColor = 0;
    private Color pillarColor;

    public StreetLight(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.pillarColor = new Color(0, 0, 0);
    }

    public StreetLight(int x, int y) {
        this(x, y, 150, 480);
    }

    public void draw(Graphics2D g) {
        Color save = g.getColor();
        // ...
        // Pillar
        int xLocal = x, yLocal = y;
        // Верхняя арка
        g.setColor(pillarColor);
        g.fillArc(xLocal, yLocal, width, 3 * height / 10, 0, 180);
        // Рисуем стекло фонаря
        g.setColor(lightColors[iLightColor]);
        xLocal += width / 6;
        yLocal += height / 20;
        g.fillArc(xLocal, yLocal, 2 * width / 3, height / 5, 0, 180);
        // Рисуем основную часть столба фонаря
        g.setColor(pillarColor);
        yLocal += height / 10;
        g.fillRect(xLocal, yLocal, 2 * width / 3, 5 * height / 8);
        // Рисуем кронштейн фонаря
        xLocal += width / 6;
        yLocal += 5 * height / 8;
        g.fillRect(xLocal, yLocal, width / 3, 3 * height / 20);
        // ...
        g.setColor(save);
    }

    public void changeColor(){
        iLightColor = (iLightColor +1) % lightColors.length;

    }
}
