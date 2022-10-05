package by.bsuir.lab1.task9;

import by.bsuir.lab1.task9.classes.Ball;
import by.bsuir.lab1.task9.classes.Basket;
import by.bsuir.lab1.task9.classes.Color;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket(new ArrayList<Ball>());

        basket.addBall(new Ball(Color.BLACK, 150.4));
        basket.addBall(new Ball(Color.BLUE, 50.12));
        basket.addBall(new Ball(Color.BLUE, 17.17));
        basket.addBall(new Ball(Color.RED, 78.78));
        basket.addBall(new Ball(Color.WHITE, 89.752));

        System.out.println("Total weight: " + basket.getWeight());
        System.out.println("Count of blue balls: " + basket.getBlueBallsCount());
    }
}
