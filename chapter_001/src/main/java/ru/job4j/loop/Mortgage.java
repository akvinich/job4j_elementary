package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double currentAmount = amount;
        while (currentAmount > 0) {
            year++;
            currentAmount = currentAmount * (1 + percent / 100) - salary;
        }
        return year;
    }
}