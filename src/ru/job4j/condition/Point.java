package ru.job4j.condition;

import static java.lang.Math.*;

public class Point {

    /**
     * Это поле объекта. Оно доступно только конкретному объекту.
     */
    private int x;

    /**
     * И это поле объекта. Оно доступно только конкретному объекту.
     */
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        System.out.println("result (0, 0) to (2, 0) " + new Point(0, 0).distance(new Point(2, 0)));
        System.out.println("result (-3, -4) to (3, 4) " + new Point(-3, -4).distance(new Point(3, 4)));
        System.out.println("result (5, 36) to (1, 0) " + new Point(5, 36).distance(new Point(1, 0)));
    }
}