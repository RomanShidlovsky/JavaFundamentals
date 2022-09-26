package by.bsuir.lab1.task6;

import by.bsuir.lab1.task6.generators.MatrixGenerator;

public class Main {
    public static void main(String[] args) {
        double[] values = new double[]{0, 1, 2, 3, 4, 5};
        double[][] matrix = MatrixGenerator.generate(values);
        int length = values.length;

        for (int i = 0; i < length; i++){
            for (int j = 0; j < length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
