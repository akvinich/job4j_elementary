package ru.job4j.array;

import java.util.Arrays;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.println(index);
            if (array[index] == null) {
                int point = index;
                index++;
                while (index < array.length && array[index] == null) {
                    index++;
                }
                if (index < array.length) {
                    array[point] = array[index];
                    array[index] = null;
                }
                index = point;
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}