package Model;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

public class MyShape {
    Color color;
    RectangularShape shape;

    public MyShape(Color color, RectangularShape shape) {
        this.color = color;
        this.shape = shape;
    }

    public MyShape() {
        color = Color.BLUE;
        shape = new Rectangle2D.Double();

    }

    void draw(Graphics2D g){
        g.draw(shape);
    }

    void straightShape(Point2D[]p){
        shape.setFrameFromDiagonal(p[0],p[1]);

    }
}
