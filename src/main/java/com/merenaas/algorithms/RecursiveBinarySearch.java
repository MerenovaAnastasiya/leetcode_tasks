package com.merenaas.algorithms;

public class RecursiveBinarySearch {

    public static void main(String[] args) {
        var result1 = search(new int[]{1, 2, 3, 4, 5}, 3);
        System.out.println(result1);
        var result2 = search(new int[]{1, 2, 3, 4, 5}, 0);
        System.out.println(result2);
        var result3 = search(new int[]{}, 0);
        System.out.println(result3);
    }

    static int search(int[] elements, int element) {
        if (elements.length == 0) {
            return -1;
        }
        int left = 0;
        int right = elements.length - 1;
        return recursiveSearch(elements, element, left, right);
    }

    private static int recursiveSearch(int[] elements, int element, int left, int right) {
        if (left > right) {
            return -1;
        } else {
            if (left == right) {
                if (elements[left] == element) {
                    return left;
                } else {
                    return -1;
                }
            } else {
                int middle = (right - left) / 2;
                int middleElement = elements[middle];
                if (middleElement == element) {
                    return middle;
                } else if (middleElement > element) {
                    return recursiveSearch(elements, element, left, middle - 1);
                } else {
                    return recursiveSearch(elements, element, middle + 1, right);
                }
            }
        }
    }
}
