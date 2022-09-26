package by.bsuir.lab1.task7.sorts;

public class ShellSort {
    public static double[] sort(double[] values) {
        if (values == null || values.length == 0) {
            throw new RuntimeException("Empty array");
        }
        double[] array = values.clone();
        double temp;
        int n = array.length;
        for (int step = n / 2; step > 0; step /= 2) {
            for (int i = step; i < n; i++) {
                int j;
                temp = array[i];
                for (j = i; j >= step; j -= step) {
                    if (temp < array[j - step]) {
                        array[j] = array[j - step];
                    } else {
                        break;
                    }
                }
                array[j] = temp;
            }
        }
        return array;
    }

    public static boolean isSorted(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
