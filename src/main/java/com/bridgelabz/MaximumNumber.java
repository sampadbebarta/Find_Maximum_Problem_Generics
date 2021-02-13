package com.bridgelabz;

public class MaximumNumber {
    public static void main(String[] args) {
        System.out.println("Welcome Find Maximum Number Problem");
    }

    public Integer findMaxIntegerValue(Integer first, Integer second, Integer third) {

        Integer maximumNumber = first;
        if (second.compareTo(maximumNumber) > 0)
            maximumNumber = second;
        if (third.compareTo(maximumNumber) > 0)
            maximumNumber = third;
        return maximumNumber;
    }

    public Float findMaxFloatValue(Float firstNo, Float secondNo, Float thirdNo) {
        Float maximumFloatNumber = firstNo;
        if (secondNo.compareTo(maximumFloatNumber) > 0.0)
            maximumFloatNumber = secondNo;
        if (thirdNo.compareTo(maximumFloatNumber) > 0.0)
            maximumFloatNumber = thirdNo;
        return maximumFloatNumber;
    }
}
