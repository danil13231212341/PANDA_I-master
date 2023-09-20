package ru.vsu.cs.panda.elements;

import java.awt.*;

public class Plate {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color c;

    public Plate(int x, int y, int size, Color c) {
        this.x = x;
        this.y = y;
        this.width = size;
        this.height = size;
        this.c = c;
    }
    public void draw(Graphics2D g, int n, int m){
        Color save = g.getColor();
//...
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                double angle = (i + j) % 2 == 0 ? 0: Math.PI / 2.;
// rotate
                g.rotate(angle, x + j * width + width /2 , y + i * height + height / 2);
// work
                g.setColor(c);
                g.fillRect(x + j * width, y + i * height, width, height / 2);
                g.fillRect(x + j * width, y + i * height + height / 2, width, height / 2);
                g.setColor(Color.BLACK);
                g.drawRect(x + j * width, y + i * height, width, height / 2);
                g.drawRect(x + j * width, y + i * height + height / 2, width, height / 2);
// rotate back
                g.rotate(-angle, x + j * width + width /2 , y + i * height + height / 2);
            }
        }
//...
        g.setColor(save);
    }

}

