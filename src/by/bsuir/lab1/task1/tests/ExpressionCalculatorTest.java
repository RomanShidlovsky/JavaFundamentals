package by.bsuir.lab1.task1.tests;

import static org.junit.jupiter.api.Assertions.*;

import by.bsuir.lab1.task1.calculators.ExpressionCalculator;
import org.junit.jupiter.api.Test;

class ExpressionCalculatorTest {

    @Test
    void calculateTestPositiveDouble() {
        //arrange
        double x = 2.9;
        double y = 5.7;
        double expected = 3.2155;
        //act
        double actual = ExpressionCalculator.calculate(x, y);
        // assert
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void calculateTestPositiveAndNegativeDouble() {
        //arrange
        double x = -3.33;
        double y = 2.123;
        double expected = -2.9697;
        // act
        double actual = ExpressionCalculator.calculate(x, y);
        // assert
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void calculateTestNegativeDouble() {
        // arrange
        double x = -2000.123;
        double y = -123.1;
        double expected = -2000.1224;
        // act
        double actual = ExpressionCalculator.calculate(x, y);
        // assert
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void calculateTestInt() {
        // arrange
        int x = 2;
        int y = -16;
        double expected = 2.4958;
        // act
        double actual = ExpressionCalculator.calculate(x, y);
        // assert
        assertEquals(expected, actual, 0.0001);
    }
}