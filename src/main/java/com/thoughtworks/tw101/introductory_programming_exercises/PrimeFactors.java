package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.sqrt;

public class PrimeFactors {

    public static void main(String[] args) {
        List<Integer> primeFactors = generate(1);
        System.out.println(Arrays.toString(primeFactors.toArray()));

        primeFactors = generate(30);
        System.out.println(Arrays.toString(primeFactors.toArray()));

        primeFactors = generate(75);
        System.out.println(Arrays.toString(primeFactors.toArray()));
    }

    private static List<Integer> generate(int n) {
        List<Integer> result = new ArrayList<Integer>();

        if (n % 2 == 0 && n > 0) {
            result.add(2);
        }

       for (int i = 3; i < sqrt(n); i = i + 2) {
            int num = n;

            while (num % i == 0) {
                result.add(i);
                num = num / i;
            }
       }

        return result;
    }
}
