package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void dist3dTest() {
        Assert.assertEquals(new Point(6, 13, 1)
                .distance3d(new Point(1,1,1)), 13, 0.01);
    }
}
