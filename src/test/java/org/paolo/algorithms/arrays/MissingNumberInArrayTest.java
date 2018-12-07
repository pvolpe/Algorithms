package org.paolo.algorithms.arrays;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MissingNumberInArrayTest {

    @Test
    public void testCompute() {
        MissingNumberInArray miss = new MissingNumberInArray();
        assertThat(miss.compute(1, 2, 3, 5, 6, 7), is(4));
        assertThat(miss.compute(1, 2, 4), is(3));
        assertThat(miss.compute(1, 2, 3, 4, 6, 7), is(5));
    }
}