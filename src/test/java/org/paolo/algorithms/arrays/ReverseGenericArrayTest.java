package org.paolo.algorithms.arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseGenericArrayTest {

    private ReverseGenericArray<String> genericArray;

    @Before
    public void setUp() {
        genericArray = new ReverseGenericArray<>();
    }

    @Test
    public void compute() {
        String[] res = genericArray.compute(String.class, "a", "b", "c");

        assertArrayEquals(new String[]{"c", "b", "a"}, res);
    }
}