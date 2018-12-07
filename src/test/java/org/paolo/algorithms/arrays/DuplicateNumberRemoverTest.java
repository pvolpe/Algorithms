package org.paolo.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateNumberRemoverTest {

    @Test
    public void test() {
        DuplicateNumberRemover remover = new DuplicateNumberRemover();
        Integer[] actuals = remover.removeDuplicate(1, 2, 5, 3, 5, 7, 2, 3);
        Integer[] expecteds = {1, 2, 5, 3, 7};
        assertArrayEquals(expecteds, actuals);
    }
}