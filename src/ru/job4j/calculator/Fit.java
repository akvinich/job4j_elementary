package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }


    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        System.out.println("Man 170 is " + Fit.manWeight(170));
        System.out.println("Woman 165 is " + Fit.manWeight(165));
    }

}
