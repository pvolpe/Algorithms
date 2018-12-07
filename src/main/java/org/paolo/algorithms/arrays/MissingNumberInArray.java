package org.paolo.algorithms.arrays;

import java.util.Arrays;

class MissingNumberInArray {

    int compute(int... nums) {

        int actualTot = Arrays.stream(nums).sum();
        int expTot = (nums.length +1) * (nums.length + 2)/2;
        return expTot - actualTot;
    }
}
