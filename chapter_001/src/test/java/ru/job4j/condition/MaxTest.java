package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To2Then2() {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax4To4Then2() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMaxLeftFromThree() {
        int result = Max.max(6, 4, 2);
        assertThat(result, is(6));
    }

    @Test
    public void whenMaxCenterFromThree() {
        int result = Max.max(6, 8, 7);
        assertThat(result, is(8));
    }

    @Test
    public void whenMaxRightFromThree() {
        int result = Max.max(6, 8, 10);
        assertThat(result, is(10));
    }
}