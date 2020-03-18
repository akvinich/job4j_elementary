package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int firstSecondResult = first >= second ? first : second;
        return firstSecondResult >= third ? firstSecondResult : third;
    }
}