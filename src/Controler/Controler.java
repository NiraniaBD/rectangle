package Controler;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Controler {
    Rectangle2D rectangle2D = new Rectangle2D.Double();
    Point2D[] point;

    public Controler() {
        point = new Point2D[2];
    }




    public void mousePressed(Point p){
        point[0] = (Point2D)p;
    }
    public void mouseDragged(Point p){
        point[1] = (Point2D)p;
    }
}
