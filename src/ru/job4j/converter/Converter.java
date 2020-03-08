package ru.job4j.converter;

public class Converter {

    private static int rubleToEuro(int value) {
        return value / 70;
    }

    private static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dolars = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dolars + " dolars.");
    }
}
