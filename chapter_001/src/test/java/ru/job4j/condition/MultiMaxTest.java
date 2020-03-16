package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(5, 4, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(5, 4, 9);
        assertThat(result, is(9));
    }

    @Test
    public void whenEq() {
        MultiMax check = new MultiMax();
        int result = check.max(9, 9, 9);
        assertThat(result, is(9));
    }
}