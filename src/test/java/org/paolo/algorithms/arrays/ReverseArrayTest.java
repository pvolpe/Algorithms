package org.paolo.algorithms.arrays;

import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class ReverseArrayTest {

    private ReverseArray reverseArray;

    @Before
    public void setUp() {
        reverseArray = new ReverseArray();
    }

    @Test
    public void compute() {
        int[] res = reverseArray.compute(1,2,3,4,5);

        assertArrayEquals(res, new int[] {5,4,3,2,1});
    }
}