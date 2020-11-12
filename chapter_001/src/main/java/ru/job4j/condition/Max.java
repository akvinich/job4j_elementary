package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static int max(int left, int center, int right) {
        return max(max(left, center), right);
    }

    public static int max(int left, int center, int right, int last) {
        return max(max(left, center, right), last);
    }
}