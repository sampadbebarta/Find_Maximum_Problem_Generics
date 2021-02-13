package com.bridgelabz;

import java.util.Arrays;
import java.util.Collections;

public class MaximumNumber<E extends Comparable> {
    E[] arrElements;

    public MaximumNumber(E[] arrElements) {
        this.arrElements = arrElements;
    }

    public static <E extends Comparable> E findMaxValue(E... arrElements) {
        Arrays.sort(arrElements, Collections.reverseOrder());
        return arrElements[0];
    }

    public E findMaxValue() {
        E result = findMaxValue(arrElements);
        printMax(result);
        return result;
    }

    private static <E> void printMax(E result) {
        System.out.println(result);
    }
}
