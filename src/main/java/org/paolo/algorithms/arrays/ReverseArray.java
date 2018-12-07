package org.paolo.algorithms.arrays;

class ReverseArray {

    int[] compute(int... arr) {
        int[] ret = new int[arr.length];

        for(int i = 0; i< arr.length; i++) {
            ret[ret.length-1 - i] = arr[i];
        }

        return ret;
    }
}
