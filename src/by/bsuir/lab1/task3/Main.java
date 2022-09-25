package by.bsuir.lab1.task3;

import by.bsuir.lab1.task3.writers.TableWriter;
import by.bsuir.lab1.task3.writers.TableWriter.TableWriterOptions;
import by.bsuir.lab1.task3.calculators.FunctionCalculator;
import by.bsuir.lab1.task3.calculators.FunctionCalculator.Operation;

import java.beans.Expression;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Double[][] values = FunctionCalculator.calculate(1.3, 1.8, 0.1, (Math::tan));

        TableWriterOptions options = new TableWriterOptions(values.length, 2, 10, new String[]{"x", "F(x)"});
        TableWriter writer = new TableWriter(options);
        writer.printTable(values);
    }
}
