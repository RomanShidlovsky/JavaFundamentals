package by.bsuir.lab1.task4.checker;

import java.util.ArrayList;

import static java.lang.Math.sqrt;

public class PrimaryChecker {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        int n = (int) sqrt(number);
        for (int i = 2; i <= n; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] getPrimeNumberIndexes(int[] values) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (values == null) {
            return null;
        }

        for (int i = 0; i < values.length; i++) {
            if (isPrime(values[i])) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
