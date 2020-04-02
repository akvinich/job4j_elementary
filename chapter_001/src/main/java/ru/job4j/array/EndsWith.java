package ru.job4j.array;

import org.junit.Assert;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int postEnd = post.length - 1, wordEnd = word.length - 1; postEnd >= 0; wordEnd--, postEnd--) {
            if (post[postEnd] != word[wordEnd]) {
                result = false;
                break;
            }
        }
        return result;
    }

}