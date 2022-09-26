package by.bsuir.lab1.task6.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import by.bsuir.lab1.task6.generators.MatrixGenerator;

class MatrixGeneratorTest {

    @Test
    void generateTest() {
        // arrange
        double[] values = new double[]{0, 1, 2, 3, 4, 5};
        // act
        double[][] matrix = MatrixGenerator.generate(values);
        // assert
        Assertions.assertAll(
                () -> assertEquals(values[0],matrix[0][0]),
                () -> assertEquals(values[0],matrix[1][values.length-1]),
                () -> assertEquals(values[3],matrix[1][2]),
                () -> assertEquals(values[values.length-1], matrix[values.length-1][0])
        );
    }
}