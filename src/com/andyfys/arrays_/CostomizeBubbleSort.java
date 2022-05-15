package com.andyfys.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Andyfys
 * @version 1.0
 */
public class CostomizeBubbleSort {
    public static void main(String[] args) {
        Integer[] numArr = {-1, 1, 10, 2, 4};
        CostomizeBubbleSort.bubble01(numArr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(numArr));

    }

    public static void bubble01(Integer[] numArr, Comparator c) {
        int temp = 0;
        for (int i = 0; i < numArr.length - 1; i++) {
            for (int j = 0; j < numArr.length - 1 - i; j++) {
                if (c.compare(numArr[j], numArr[j + 1]) > 0) {
                    temp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = temp;
                }
            }
        }
    }
}
