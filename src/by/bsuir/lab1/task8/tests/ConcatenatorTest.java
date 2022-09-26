package by.bsuir.lab1.task8.tests;

import by.bsuir.lab1.task7.sorts.ShellSort;
import by.bsuir.lab1.task8.concatenators.Concatenator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConcatenatorTest {

    @Test
    void concatTest() {
        // arrange
        double[] a = new double[]{-5, -4, -4, 0, 3, 4, 6, 10, 15};
        double[] b = new double[]{-7, -5, -4, -3, -2, 1, 2, 7, 14, 20};
        // act
        double[] result = Concatenator.concat(a, b);
        // assert
        Assertions.assertAll(
                () -> assertEquals(a.length + b.length, result.length),
                () -> assertTrue(ShellSort.isSorted(result))
        );
    }
}