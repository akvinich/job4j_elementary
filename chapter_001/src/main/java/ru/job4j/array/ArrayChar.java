package ru.job4j.array;

import org.junit.Assert;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i ++) {
            if (pref[i] != word[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}