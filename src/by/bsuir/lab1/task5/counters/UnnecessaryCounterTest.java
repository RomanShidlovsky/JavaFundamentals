package by.bsuir.lab1.task5.counters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnnecessaryCounterTest {

    @Test
    void countTestOnlyPositive() {
        // arrange
        int[] values = new int[]{10, 5, 6, 3, 9, 7};
        int expected = 3;
        // act
        int actual = UnnecessaryCounter.count(values);
        // assert
        assertEquals(expected, actual);
    }

    @Test
    void countTestOnlyNegative() {
        // arrange
        int[] values = new int[]{-10, -5, -6, -3, -9, -7};
        int expected = 3;
        // act
        int actual = UnnecessaryCounter.count(values);
        // assert
        assertEquals(expected, actual);
    }

    @Test
    void countTestFullyIncreasingSequence() {
        // arrange
        int[] values = new int[]{-9, -8, -1, 0, 1, 2, 3, 5, 10};
        int expected = 0;
        // act
        int actual = UnnecessaryCounter.count(values);
        // assert
        assertEquals(expected, actual);
    }

    @Test
    void countTestException() {
        // assert
        Assertions.assertAll(
                () -> assertThrows(RuntimeException.class,() -> UnnecessaryCounter.count(null)),
                () -> assertThrows(RuntimeException.class,() -> UnnecessaryCounter.count(new int[0]))
        );
    }
}