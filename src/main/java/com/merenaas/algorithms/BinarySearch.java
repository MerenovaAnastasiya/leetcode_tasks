package com.merenaas.algorithms;

public class BinarySearch {

    public static void main(String[] args) {
        var result1 = search(new int[]{1, 2, 3, 4, 5}, 3);
        System.out.println(result1);
        var result2 = search(new int[]{1, 2, 3, 4, 5}, 0);
        System.out.println(result2);
        var result3 = search(new int[]{}, 0);
        System.out.println(result3);

    }

//    1 2 3 4 5
    static int search(int[] elements, int e) {
        if (elements.length == 0) {
            return  - 1;
        }
        int left = 0;
        int right = elements.length - 1;
        int middleIndex, middleE;

        while (left < right) {
            middleIndex = (right - left) / 2;
            middleE = elements[middleIndex];
            if (middleE == e) {
                return middleIndex;
            } else if(middleE < middleIndex) {
                left = middleIndex + 1;
            } else {
                right = middleIndex - 1;
            }
        }
        return -1;
    }

}
