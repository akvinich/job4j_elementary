package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;

public class PointTest {

    @Test
    public void distanceFirstTest() {
        Assert.assertEquals(Point.distance(0, 0, 2, 0), 2, 0.01);
    }

    @Test
    public void distanceSecondTest() {
        Assert.assertEquals(Point.distance(-3, -4, 3, 4), 10, 0.01);
    }
}
