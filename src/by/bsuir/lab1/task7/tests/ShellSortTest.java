package by.bsuir.lab1.task7.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import by.bsuir.lab1.task7.sorts.ShellSort;

class ShellSortTest {
    @Test
    void sortTestThrowException() {
        Assertions.assertAll(
                () -> assertThrows(RuntimeException.class, () -> ShellSort.sort(null)),
                () -> assertThrows(RuntimeException.class, () -> ShellSort.sort(new double[0]))
        );
    }

    @Test
    void sortTest() {
        // arrange
        double[] array = new double[]{-9,5,1,-7,3,2,1,6};
        // act
        boolean actual = ShellSort.isSorted(ShellSort.sort(array));
        // assert
        assertTrue(actual);
    }
}