package org.ds.patterns;

import java.util.*;

public class _10_PairSumOfArray {


    public static void main(String[] args) {
        int[] input = {1, 7, 2, 1, 2, 3, 3, 5, 6};
        int sum = 8;
        Map<Integer, Integer> result = new HashMap<>();

        System.out.println("Input" + Arrays.toString(input));
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {

                if (input[i] + input[j] == sum) {
                    result.put(input[i], input[j]);
                }
            }
        }

        System.out.println("Output" + result);
    }
}
