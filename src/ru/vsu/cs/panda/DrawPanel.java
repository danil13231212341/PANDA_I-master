package ru.vsu.cs.panda;

import ru.vsu.cs.panda.elements.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawPanel extends JPanel {
    private StreetLight light;
    private Panda panda;
    private House house;
    private Cage cage;
    private Bench bench;

    private Plate plate;
    private Bamboo bamboo;
    public DrawPanel() {

        plate = new Plate(0, 600, 20, new Color(119, 115, 115, 255));
        panda = new Panda(625, 340);
        light = new StreetLight(225, 160);
        house = new House(990, 270);
        bench = new Bench(60, 500);
        cage = new Cage(500, 50);
        bamboo = new Bamboo(500, 50);


        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                light.changeColor();
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        // background
        g.setColor(new Color(22, 38, 40));
        g.fillRect(0,0,getWidth(), getHeight());

        plate.draw(g, 45, 80);
        bamboo.draw(g, 18);
        panda.draw(g);
        house.draw(g);
        cage.draw(g, 18);
        light.draw(g);
        bench.draw(g);
    }
}
