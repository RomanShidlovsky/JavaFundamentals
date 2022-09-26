package by.bsuir.lab1.task8.concatenators;

import by.bsuir.lab1.task7.sorts.ShellSort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Concatenator {
    public static int[] getIndexes(double[] a, double[] b) {
        if (a == null || b == null || a.length == 0 || b.length == 0) {
            throw new RuntimeException("Empty array");
        }
        if (!ShellSort.isSorted(a) || !ShellSort.isSorted(b)) {
            throw new RuntimeException("Not correct array");
        }

        List<Double> in = new ArrayList<>();
        for (double value : a) {
            in.add(value);
        }
        List<Double> from = new ArrayList<>();
        for (double value : b) {
            from.add(value);
        }

        int[] result = new int[from.size()];
        for (int i = 0; i < from.size(); i++) {
            int dex = Collections.binarySearch(in, from.get(i));
            if (dex < 0) {
                result[i] = -(dex + 1) + i;
            } else {
                result[i] = dex + i;
            }
        }
        return result;
    }

    public static double[] concat(double[] a, double[] b) {
        int[] indexes = getIndexes(a, b);
        List<Double> in = new ArrayList<>();
        for (Double value : a) {
            in.add(value);
        }

        for (int i = 0; i < indexes.length; i++) {
            in.add(indexes[i], b[i]);
        }

        double[] result = new double[a.length+b.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = in.get(i);
        }
        return result;
    }
}
