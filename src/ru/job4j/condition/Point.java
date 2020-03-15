package ru.job4j.condition;

import static java.lang.Math.*;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        System.out.println("result (0, 0) to (2, 0) " + Point.distance(0, 0, 2, 0));
        System.out.println("result (-3, -4) to (3, 4) " + Point.distance(-3, -4, 3, 4));
        System.out.println("result (5, 36) to (1, 0) " + Point.distance(5, 36, 1, 0));
    }
}