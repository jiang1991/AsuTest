package com.example.asutest.one;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OctTest {

    private int[] list;

    @Before
    public void setUp() throws Exception {
        list = new int[]{-10, 100, 23, 6, 52, 10000};
    }

    @Test
    public void testBinarySearch1() {
        Assert.assertTrue(Oct.binarySearch(list, -10));
    }

    @Test
    public void testBinarySearch2() {
        Assert.assertTrue(Oct.binarySearch(list, 10000));
    }

    @Test
    public void testBinarySearch3() {
        Assert.assertFalse(Oct.binarySearch(list, 5));
    }

}