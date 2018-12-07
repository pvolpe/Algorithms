package org.paolo.algorithms.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class DuplicateNumberRemover {

    Integer[] removeDuplicate(Integer... nums) {
        Set<Integer> ints = new LinkedHashSet<>(Arrays.asList(nums));
        return ints.toArray(new Integer[0]);
    }
}
