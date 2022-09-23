package by.bsuir.lab1.task1;

import by.bsuir.lab1.task1.calculators.ExpressionCalculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("x=2.9, y=5.8");
        System.out.println("f=" + ExpressionCalculator.calculate(2.9, 5.8));
    }
}