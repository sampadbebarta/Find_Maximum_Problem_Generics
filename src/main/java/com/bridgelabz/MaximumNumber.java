package com.bridgelabz;

public class MaximumNumber {
    public static void main(String[] args) {
        System.out.println("Welcome Find Maximum Number Problem");
    }

    public Integer findMaxIntegerValue(Integer first, Integer second, Integer third) {

        Integer maximumIntegerNumber = first;
        if (second.compareTo(maximumIntegerNumber) > 0)
            maximumIntegerNumber = second;
        if (third.compareTo(maximumIntegerNumber) > 0)
            maximumIntegerNumber = third;
        return maximumIntegerNumber;
    }

}
