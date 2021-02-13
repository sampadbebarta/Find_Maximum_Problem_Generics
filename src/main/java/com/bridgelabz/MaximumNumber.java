package com.bridgelabz;

import java.util.Arrays;
import java.util.Collections;

public class CheckMaximumValue<E extends Comparable> {
    E[] arrElements;

    public CheckMaximumValue() {
    }

    public CheckMaximumValue(E[] arrElements) {
        this.arrElements = arrElements;
    }

    public static <E extends Comparable> E findMaxValue(E... arrElements) {
        Arrays.sort(arrElements, Collections.reverseOrder());
        return arrElements[0];
    }

    public E findMaxValue() {
        return findMaxValue(arrElements);
    }
}
