package org.paolo.algorithms.arrays;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DuplicateNumberFinderTest {

    @Test
    public void testCompute() {
        DuplicateNumberFinder finder = new DuplicateNumberFinder();

        assertThat(finder.compute(1,2,3,4,5,4,6), is(4));
        assertThat(finder.compute(1,2,3,4,5,2,6), is(2));
        assertThat(finder.compute(1,2,3,4,5,6,1), is(1));
    }
}