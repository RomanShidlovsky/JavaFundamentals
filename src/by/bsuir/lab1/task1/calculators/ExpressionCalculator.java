package by.bsuir.lab1.task1.calculators;

public class ExpressionCalculator {
    public static double calculate(double x, double y) {
        double numerator = 1 + Math.pow(Math.sin(x + y), 2);
        double denominator = 2 + Math.abs(x - (2*x)/(1+Math.pow(x*y,2)));
        return numerator / denominator + x;
    }
}
