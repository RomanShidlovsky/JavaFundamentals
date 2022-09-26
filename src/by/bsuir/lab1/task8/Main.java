package by.bsuir.lab1.task8;

import by.bsuir.lab1.task8.concatenators.Concatenator;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] a = new double[]{-1, 3, 3, 5, 7, 8};
        double[] b = new double[]{-2, 0, 3, 6, 9};
        System.out.println("Before concat: ");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("After concat:");
        double[] result = Concatenator.concat(a, b);
        System.out.println(Arrays.toString(result));
    }
}
