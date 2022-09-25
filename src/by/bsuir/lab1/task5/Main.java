package by.bsuir.lab1.task5;

import by.bsuir.lab1.task5.counters.UnnecessaryCounter;

public class Main {
    public static void main(String[] args) {
        int[] values = new int[]{-1, 3, 4, 1, 2, 7, 5, 8};
        System.out.println(UnnecessaryCounter.count(values));
    }
}
