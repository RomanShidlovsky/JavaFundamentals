package by.bsuir.lab1.task4;

import java.util.Arrays;
import by.bsuir.lab1.task4.checker.PrimaryChecker;

public class Main {
    public static void main(String[] args) {
        int[] values = new int[]{2, 15, 13, 199, 1323, 3};
        int[] indexes = PrimaryChecker.getPrimeNumberIndexes(values);
        System.out.println(Arrays.toString(indexes));
    }
}
