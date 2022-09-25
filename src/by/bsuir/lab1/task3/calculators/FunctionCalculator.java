package by.bsuir.lab1.task3.calculators;

import java.util.ArrayList;
import java.util.function.Function;

public class FunctionCalculator {
    public interface Operation{
        double execute(double x);
    }
    public static Double[][] calculate(double a, double b, double h, Operation func) {
        int length = (int)((b - a)/ h + 1);
        ArrayList<Double[]> list = new ArrayList<>();

        double x = a;
        while (x <= b){
            list.add(new Double[]{x, func.execute(x)});
            x += h;
        }

        if (x != b) {
            list.add(new Double[]{b, func.execute(b)});
        }

        Double[][] res = new Double[list.size()][2];
        res = list.toArray(res);
        return res;
    }
}
