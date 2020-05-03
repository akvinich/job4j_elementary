package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int k = 0;
        while (k < rsl.length) {
            if (leftIndex == left.length) {
                while (rightIndex < right.length) {
                    rsl[k] = right[rightIndex++];
                    k++;
                    System.out.println(Arrays.toString(rsl));
                }
                break;
            }
            if (rightIndex == right.length) {
                while (leftIndex < left.length) {
                    rsl[k] = left[leftIndex++];
                    k++;
                    System.out.println(Arrays.toString(rsl));
                }
                break;
            }
            if (rightIndex != right.length && leftIndex != left.length) {
                rsl[k] = left[leftIndex] <= right[rightIndex] ? left[leftIndex++] : right[rightIndex++];
                System.out.println(Arrays.toString(rsl));
            }
            k++;
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
