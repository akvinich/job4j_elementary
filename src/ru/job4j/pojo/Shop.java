package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int rst = 0;
        while (rst < products.length && products[rst] != null) {
            if (rst == products.length -1) {
                return -1;
            }
            rst++;
        }
        return rst;
    }
}