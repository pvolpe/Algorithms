package org.paolo.algorithms.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class DuplicateNumberFinder {

    int compute(int... nums) {
        Set<Integer> ints = new HashSet<>();

        for(int i: nums) {
            if (!ints.add(i)) {
                return i;
            }
        }
        throw new IllegalArgumentException();
    }
}
