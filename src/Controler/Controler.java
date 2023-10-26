package Controler;

import Model.Model;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Controler {
    Rectangle2D rectangle2D = new Rectangle2D.Double();
    Point2D[] point;
    Model model;

    public Controler() {
        point = new Point2D[2];
    }
    public void mousePressed(Point p){
        point[0] = (Point2D)p;
        model.createShape();
    }
    public void mouseDragged(Point p){
        point[1] = (Point2D)p;
    }
}
