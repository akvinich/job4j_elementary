package ru.job4j.condition;

import static java.lang.Math.*;

public class SqArea {
    public static double square(int p, int k) {
        return k * pow(p / (2 * (k + 1)), 2);
    }

    public static void main(String[] args) {
        System.out.println(" p = 4, k = 1, s = 1, real = " + SqArea.square(4, 1));
        System.out.println(" p = 6, k = 2, s = 2, real = " + SqArea.square(6, 2));
    }
}