package com.merenaas.algorithms;

import java.util.Arrays;

public class RecursiveSum {

    public static void main(String[] args) {
        var result1 = sum(new int[]{1, 2, 3, 4, 5});
        System.out.println(result1);
    }

    static int sum(int[] elements) {
        if (elements.length == 0) {
            return 0;
        } else if (elements.length == 1) {
            return elements[0];
        } else {
            return elements[0] + sum(Arrays.copyOfRange(elements, 1, elements.length));
        }
    }
}
