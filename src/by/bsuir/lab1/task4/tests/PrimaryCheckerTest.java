package by.bsuir.lab1.task4.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import by.bsuir.lab1.task4.checker.PrimaryChecker;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimaryCheckerTest {
    @Test
    void isPrimeTest() {
        Assertions.assertAll(
                () -> assertTrue(PrimaryChecker.isPrime(137)),
                () -> assertFalse(PrimaryChecker.isPrime(24980)),
                () -> assertFalse(PrimaryChecker.isPrime(33333)),
                () -> assertTrue(PrimaryChecker.isPrime(9973))
        );
    }

    @Test
    void getPrimeNumberIndexes() {
        // arrange
        int[] values = new int[]{137, 24, 13, 9, 239, 11};
        String expected = Arrays.toString(new int[]{0,2,4,5});
        // act
        String actual =Arrays.toString(PrimaryChecker.getPrimeNumberIndexes(values));
        // assert
        assertEquals(expected, actual);
    }

}