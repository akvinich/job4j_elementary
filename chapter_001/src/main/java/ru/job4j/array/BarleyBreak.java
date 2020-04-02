package ru.job4j.array;

import java.util.Arrays;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] table = new int[3][3];
        int number = 1;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = number;
                number++;
            }
        }
        for (int i = 0; i < table.length; i++) {
            System.out.println(Arrays.toString(table[i]));
        }
    }
}
