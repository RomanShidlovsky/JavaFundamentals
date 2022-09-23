package by.bsuir.lab1.task2.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.geom.Rectangle2D;
import by.bsuir.lab1.task2.models.PointInFigureChecker;

class PointInFigureCheckerTest {

    @Test
    void checkTestOneRectangle() {
        Rectangle2D.Double[] rect = {new Rectangle2D.Double(5, 5, 5, 5)};
        PointInFigureChecker checker = new PointInFigureChecker(rect);

        Assertions.assertAll(
                () -> assertTrue(checker.check(6, 6)),
                () -> assertFalse(checker.check(4, 4)),
                () -> assertTrue(checker.check(6, 9))
        );
    }

    @Test
    void checkTestTwoRectangles() {
        Rectangle2D.Double[] rectangles = {new Rectangle2D.Double(-4, 0, 8, 5),
                new Rectangle2D.Double(-6, -3, 12, 3)};
        PointInFigureChecker checker = new PointInFigureChecker(rectangles);

        Assertions.assertAll(
                () -> assertTrue(checker.check(0, 0)),
                () -> assertTrue(checker.check(3, 4)),
                () -> assertTrue(checker.check(-2, -2)),
                () -> assertFalse(checker.check(6, 6)),
                () -> assertFalse(checker.check(0, -4)),
                () -> assertFalse(checker.check(3, 6))
        );
    }
}