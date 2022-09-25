package by.bsuir.lab1.task5.counters;

public class UnnecessaryCounter {
    public static int count(int[] values) {
        if (values == null || values.length == 0) {
            throw new RuntimeException("Empty array!");
        }

        int length = values.length;
        int[] maxLength = new int[length];
        for (int i = 0; i < length - 1; i++){
            int prev = values[i];
            maxLength[i] = 1;
            for (int j = i + 1; j < length; j++) {
                if (values[j] > prev) {
                    prev = values[j];
                    maxLength[i]++;
                }
            }
        }

        int max = maxLength[0];
        for (int i = 1; i < length; i++) {
            if (maxLength[i] > max) {
                max = maxLength[i];
            }
        }
        return length - max;
    }

}
