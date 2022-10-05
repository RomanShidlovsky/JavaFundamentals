package by.bsuir.lab1.task9.classes;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> balls;

    public Basket(ArrayList<Ball> balls) {
        this.balls = balls;
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public double getWeight() {
        double result = 0;
        for (Ball ball : balls) {
            result += ball.weight;
        }
        return result;
    }

    public int getBlueBallsCount() {
        int result = 0;
        for (Ball ball : balls) {
            if (ball.color == Color.BLUE) {
                result++;
            }
        }
        return result;
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }
}
