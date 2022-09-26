package by.bsuir.lab1.task7;

import by.bsuir.lab1.task7.sorts.ShellSort;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] array = new double[]{-5, 12, -23, 24, 1, 2, 3, 0, 15};
        System.out.println("Before sorting: " + Arrays.toString(array));
        double[] sortedArray = ShellSort.sort(array);
        System.out.println("After sorting: " + Arrays.toString(sortedArray));
    }
}
