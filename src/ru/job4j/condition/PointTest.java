package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;

public class PointTest {

    @Test
    public void distanceFirstTest() {
        Assert.assertEquals(new Point(0, 0).distance(new Point(2, 0)), 2, 0.01);
    }

    @Test
    public void distanceSecondTest() {
        Assert.assertEquals(new Point(-3, -4).distance(new Point(3, 4)), 10, 0.01);
    }
}
