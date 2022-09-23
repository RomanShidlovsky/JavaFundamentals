package by.bsuir.lab1.task2;

import by.bsuir.lab1.task2.models.PointInFigureChecker;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {
        Rectangle2D.Double[] rectangles = {new Rectangle2D.Double(-4, 0, 8, 5),
                new Rectangle2D.Double(-6, -3, 12, 3)};

        PointInFigureChecker checker = new PointInFigureChecker(rectangles);
        System.out.print(checker.check(3, 4));
    }
}
