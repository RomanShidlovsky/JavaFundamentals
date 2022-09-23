package by.bsuir.lab1.task2.models;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class PointInFigureChecker {
    public Rectangle2D.Double[] rectangles;

    public PointInFigureChecker(Rectangle2D.Double[] rectangles) {
        this.rectangles = rectangles;
    }

    public boolean check(double x, double y) {
        Point2D.Double point = new Point2D.Double(x, y);

        for (Rectangle2D.Double rectangle : this.rectangles) {
            if (rectangle.contains(point)) {
                return true;
            }
        }
        return false;
    }
}
