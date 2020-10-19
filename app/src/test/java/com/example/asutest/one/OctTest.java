package com.example.asutest.one;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class OctTest extends TestCase {

    private Oct oct;
    private int[] list;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        oct = new Oct();
        list = new int[]{-10, 100, 23, 6, 52, 10000};
    }

    public void testBinarySearch1() {
        assertTrue(oct.binarySearch(list, -10));
    }

    public void testBinarySearch2() {
        assertTrue(oct.binarySearch(list, 10000));
    }

    public void testBinarySearch3() { assertFalse(oct.binarySearch(list, 5));
    }
}