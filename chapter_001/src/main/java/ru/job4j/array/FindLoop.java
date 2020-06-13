package ru.job4j.array;

import org.junit.Assert;

public class FindLoop {

    /**
     * Поиск в массиве индекса по значению
     * Метод возвращает -1, если значение не найдено
     * @param data - массив
     * @param value - искомое значение
     */
    public int indexOf(int[] data, int value) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    /**
     * Поиск в массиве индекса по значению в заданном диапазоне
     * Метод возвращает -1, если значение не найдено
     * @param data - массив
     * @param value - искомое значение
     * @param start - начальный индекс
     * @param finish - конечный индекс
     */
    public static int indexOf(int[] data, int value, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == value) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}