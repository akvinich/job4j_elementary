package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void squareFirstTest() {
        Assert.assertEquals(1, SqArea.square(4, 1), 0.01);
    }

    @Test
    public void squareSecondTest() {
        Assert.assertEquals(2, SqArea.square(6, 2), 0.01);
    }
}
