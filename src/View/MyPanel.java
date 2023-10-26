package View;

import Controler.Controler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class MyPanel extends JPanel {
    Controler controler;


    public MyPanel(Controler c) {
        controler = c;
        addMouseListener(new MouseAdapter() {


            @Override
            public void mousePressed(MouseEvent e) {
                controler.mousePressed( e.getPoint());
            }

        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                controler.mouseDragged( e.getPoint());
               // rectangle2D.setFrameFromDiagonal(p[0], p[1]);
                repaint();
            }


        });



    }

    public MyPanel() {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(rectangle2D);
    }
}

