package Controler;

import Model.*;
import View.MyFrame;
import View.MyPanel;


import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Controler {

    Rectangle2D rectangle2D = new Rectangle2D.Double();
    Point2D[] point;
    Model model;
    MyFrame frame;
    MyPanel panel;

    public Controler() {

        point = new Point2D[2];
        model = new Model();
        panel = new MyPanel(this);
        frame = new MyFrame(panel);

    }
    public void mousePressed(Point p){
        point[0] = (Point2D)p;
        model.createShape();
    }
    public void mouseDragged(Point p){
        point[1] = (Point2D)p;
        model.getCurrentShape().straightShape(point);

    }
    public MyShape translate(){
        return model.getCurrentShape();
    }

}




