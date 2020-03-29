package ru.job4j.array;

import org.junit.Assert;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        Assert.assertEquals(true, word.length >= post.length);
        for (int i = post.length - 1, j = word.length - 1; i >= 0; j--, i--) {
            if (post[i] != word[j]) {
                result = false;
                break;
            }
        }
        return result;
    }

}